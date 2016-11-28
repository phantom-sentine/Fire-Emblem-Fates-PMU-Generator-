import java.lang.Math;
public class Unit
{
    private String name;
    private boolean female;
    private boolean avatar;
    private BoonBane boon;
    private BoonBane bane;
    private BaseClass[] classSets;
    private Unit fixedParent;
    private Unit variableParent;
    private boolean secondGen;
    private Unit[] aPlusSupports;
    private Unit[] sSupports;
    private Unit sSupport;
    private Unit aPlusSupport;
    private BaseClass dlcSeal;
    private String string = "";
    
    Unit(String name, boolean female, BaseClass[] classSets){
        this.name = name;
        this.female = female;
        avatar = false;
        this.classSets = classSets;
        secondGen = false;
    }
    Unit(String name, boolean female, BaseClass[] classSets, BoonBane boon, BoonBane bane){
        this.name = name;
        this.female = female;
        avatar = true;
        this.classSets = classSets;
        this.boon = boon;
        this.bane = bane;
        secondGen = false;
    }
    Unit(String name, boolean female, BaseClass[] classSets, Unit fixedParent){
        this.name = name;
        this.female = female;
        avatar = false;
        this.classSets = classSets;
        this.fixedParent = fixedParent;
        secondGen = true;
    }
    public boolean isSecondGen(){
        return secondGen;
    }
    public Unit getFixedParent(){
        return fixedParent;
    }
    public Unit getVariableParent(){
        return variableParent;
    }
    public Unit getSSupportPartner(){
        return sSupport;
    }
    public Unit getAPlusSupportPartner(){
        return aPlusSupport;
    }
    public Unit[] getSSupportPartners(){
        return sSupports;
    }
    public boolean isFemale(){
        return female;
    }
    public void setAPlusSupports(Unit[] aPlusSupports){
        this.aPlusSupports = aPlusSupports;
    }
    public void setSSupports(Unit[] sSupports){
        this.sSupports = sSupports;
    }
    public boolean hasSSupportPartner(){
        return sSupport != null;
    }
    public void setAPlusSupport(Unit aPlusSupport){
        this.aPlusSupport = aPlusSupport;
    }
    public void setSSupport(Unit sSupport){
        this.sSupport = sSupport;
        if(sSupport.hasSSupportPartner() == false)
            sSupport.setSSupport(this);
    }
    public boolean hasSameSexParents(){
        if(fixedParent == null || variableParent == null)
            return false;
        return variableParent.isFemale() == fixedParent.isFemale();
    }
    public boolean hasTwoParents(){
        if(fixedParent.hasSSupportPartner()){
            setVariableParent(fixedParent.getSSupportPartner());
            return true;
        }
        return false;
    }
    public void setVariableParent(Unit variableParent){
        this.variableParent = variableParent;
        BaseClass[] newClassSets = new BaseClass[3];
        Unit father;
        Unit mother;
        if(fixedParent.isFemale()){
            mother = fixedParent;
            father = variableParent;
        }
        else{
            mother = variableParent;
            father = fixedParent;
        }
        newClassSets[0] = classSets[0];
        if(father.getClassSets()[0] != classSets[0])
            newClassSets[1] = father.getClassSets()[0];
        else
            newClassSets[1] = father.getClassSets()[1];
        if(mother.getClassSets()[0] == BaseClass.SONGSTRESS){
            if(mother.getClassSets()[1] != newClassSets[0] && mother.getClassSets()[1] != newClassSets[1])
                newClassSets[2] = mother.getClassSets()[1];
            else if(BaseClass.getParallel(mother.getClassSets()[0]) != newClassSets[0] && 
                    BaseClass.getParallel(mother.getClassSets()[0]) != newClassSets[1]){
                newClassSets[2] = BaseClass.getParallel(mother.getClassSets()[0]);
            }
            else
                newClassSets[2] = BaseClass.getParallel(mother.getClassSets()[1]);
        }
        else if(mother.getClassSets()[0] != newClassSets[0] && mother.getClassSets()[0] != newClassSets[1])
            newClassSets[2] = mother.getClassSets()[0];
        else if(mother.getClassSets()[1] != newClassSets[0] && mother.getClassSets()[1] != newClassSets[1])
            newClassSets[2] = mother.getClassSets()[1];
        else
            newClassSets[2] = BaseClass.getParallel(mother.getClassSets()[0]);
        if(newClassSets[1] != classSets[1]){
            newClassSets[2] = newClassSets[1];
            newClassSets[1] = classSets[1];
        }
        classSets = newClassSets;
    }
    public String getName(){
        return name;
    }
    public BaseClass[] getClassSets(){
        return classSets;
    }
    private boolean canBorrowAPlusClass(){
        if(aPlusSupport == null)
            return false;
        if(getBorrow(false) == null)
            return false;
        if(getBorrow(false) == classSets[0] || getBorrow(false) == classSets[1])
            return false;
        return true;
    }
    private boolean canBorrowSClass(){
        if(sSupport == null)
            return false;
        if(getBorrow(true) == null)
            return false;
        if(getBorrow(true) == classSets[0] || getBorrow(true) == classSets[1])
            return false;
        return true;
    }
    private BaseClass getBorrow(boolean isSSupport){
        BaseClass[] borrowSets;
        if(isSSupport)
            borrowSets = sSupport.getClassSets();
        else
            borrowSets = aPlusSupport.getClassSets();
        if(borrowSets[0] == BaseClass.RV_NOHR_PRINCESS || borrowSets[0] == BaseClass.CQ_NOHR_PRINCESS || 
        borrowSets[0] == BaseClass.BR_NOHR_PRINCESS || borrowSets[0] == BaseClass.SONGSTRESS || 
        borrowSets[0] == BaseClass.WOLFSKIN || borrowSets[0] == BaseClass.KITSUNE || 
        borrowSets[0] == BaseClass.VILLAGER){
            if(classSets[0] == borrowSets[1])
                return BaseClass.getParallel(borrowSets[0]);
            else
                return borrowSets[1];
        }
        if(borrowSets[0] == classSets[0])
            return borrowSets[1];
        return borrowSets[0];
    }
    public boolean hasLegalSRankPartner(){
        if(sSupports == null)
            return false;
        for(int x = 0; x < sSupports.length; x++){
            if(sSupports[x].hasSSupportPartner() == false)
                return true;
        }
        return false;
    }
    public void pickSSupportPartner(){
        Unit potentialSSupport;
        while(sSupport == null){
            potentialSSupport = sSupports[(int)(Math.random()*sSupports.length)];
            if(!potentialSSupport.hasSSupportPartner())
                setSSupport(potentialSSupport);
        }
    }
    public void pickAPlusSupportPartner(){
        if(aPlusSupports == null)
            return;
        if(aPlusSupports.length == 0)
            return;
        setAPlusSupport(aPlusSupports[(int)(Math.random()*aPlusSupports.length)]);
    }
    public void giveDlcSeal(int seal){
        if(seal == 0)
            dlcSeal = BaseClass.DREAD_FIGHTER;
        else if(seal == 1)
            dlcSeal = BaseClass.DARK_FALCON;
        else if(seal == 2)
            dlcSeal = BaseClass.BALLISTICIAN;
        else if(seal == 3)
            dlcSeal = BaseClass.WITCH;
        else if(seal == 4)
            dlcSeal = BaseClass.LODESTAR;
        else if(seal == 5)
            dlcSeal = BaseClass.VANGUARD;
        else if(seal == 6)
            dlcSeal = BaseClass.GRANDMASTER;
        else if(seal == 7)
            dlcSeal = BaseClass.GREAT_LORD;
    }
    public String toString(){
        if(!string.equals("")){
            return string;
        }
        String unit = "";
        BaseClass baseClass = classSets[0];
        String aquisition = "";
        baseClass = classSets[(int)(Math.random()*(classSets.length))];
        if(Math.random()*100 < 30 && dlcSeal != null)
            baseClass = dlcSeal;
        else if(Math.random()*100 < 30 && aPlusSupport != null && canBorrowAPlusClass()){
             baseClass = getBorrow(false);
             aquisition = " (A+ " + aPlusSupport.getName() + ")";
        }
        else if(Math.random()*100 < 30 && sSupport != null && canBorrowSClass()){
             baseClass = getBorrow(true);
             aquisition = " (S " + sSupport.getName() + ")";
        }
        if(baseClass.canPromote()){
            unit = baseClass.getPromotes()[(int)(Math.random()*(baseClass.getPromotes().length))].name(female);
        }
        else
            unit = baseClass.name(female);
        for(int x = 0; x < classSets.length; x++){
            if(classSets[x].getPromotes() != null){
                for(int y = 0; y < classSets[x].getPromotes().length; y++){
                    if(unit.equals(classSets[x].getPromotes()[y].name(female)))
                        aquisition = "";
                }
            }
        }
        if(secondGen){
            if(variableParent.isSecondGen())
                unit += " " + variableParent.getVariableParent().getName() + "!" + variableParent.getName() + "!" + name;
            else
                unit += " " + variableParent.getName() + "!" + name;
        }
        else
            unit += " " + name;
        if(avatar){
            String build = "";
            if(female)
                build += "FeMU, ";
            else
                build += "MaMU, ";
            build += "+" + boon.toString() + "/-" + bane.toString() + ", ";
            if(classSets[1] == BaseClass.SPEAR_FIGHTER)
                build += "Lancer ";
            else if(classSets[1] == BaseClass.SHRINE_MAIDEN && female)
                build += "Priestess ";
            else if(classSets[1] == BaseClass.WYVERN_RIDER)
                build += "Dragon ";
            else if(classSets[1] == BaseClass.DARK_MAGE)
                build += "Mage ";
            else
                build += classSets[1].name(female) + " ";
            build += "Talent";
            if(!aquisition.equals("")){
                if(aquisition.charAt(2) == 'S')
                    build +=  ", S " + sSupport.getName();
                else
                    build += ", A " + aPlusSupport.getName();
            }
            string = unit + " (" + build + ")";
            return string;
        }
        string = unit + aquisition;
        return string;
    }
}
