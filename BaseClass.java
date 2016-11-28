public enum BaseClass
{
    RV_NOHR_PRINCESS(new PromoteClass[] {PromoteClass.NOHR_NOBLE,PromoteClass.HOSHIDO_NOBLE},"NOHR_PRINCE"),
    CQ_NOHR_PRINCESS(new PromoteClass[] {PromoteClass.NOHR_NOBLE},"NOHR_PRINCE"),
    BR_NOHR_PRINCESS(new PromoteClass[] {PromoteClass.HOSHIDO_NOBLE},"NOHR_PRINCE"),
    CAVALIER(new PromoteClass[] {PromoteClass.PALADIN,PromoteClass.GREAT_KNIGHT}),
    KNIGHT(new PromoteClass[] {PromoteClass.GREAT_KNIGHT,PromoteClass.GENERAL}),
    FIGHTER(new PromoteClass[] {PromoteClass.BERSERKER,PromoteClass.HERO}),
    MERCENARY(new PromoteClass[] {PromoteClass.HERO,PromoteClass.BOW_KNIGHT}),
    OUTLAW(new PromoteClass[] {PromoteClass.BOW_KNIGHT,PromoteClass.ADVENTURER}),
    WYVERN_RIDER(new PromoteClass[] {PromoteClass.WYVERN_LORD,PromoteClass.MALIG_KNIGHT}),
    DARK_MAGE(new PromoteClass[] {PromoteClass.SORCERER,PromoteClass.DARK_KNIGHT}),
    TROUBADOUR(new PromoteClass[] {PromoteClass.MAID,PromoteClass.STRATEGIST}),
    WOLFSKIN(new PromoteClass[] {PromoteClass.WOLFSSEGNER}),
    SAMURAI(new PromoteClass[] {PromoteClass.SWORDMASTER,PromoteClass.MASTER_OF_ARMS}),
    VILLAGER(new PromoteClass[] {PromoteClass.MASTER_OF_ARMS,PromoteClass.MERCHANT}),
    APOTHECARY(new PromoteClass[] {PromoteClass.MERCHANT,PromoteClass.MECHANIST}),
    NINJA(new PromoteClass[] {PromoteClass.MECHANIST,PromoteClass.MASTER_NINJA}),
    ONI_SAVAGE(new PromoteClass[] {PromoteClass.ONI_CHIEFTAN,PromoteClass.BLACKSMITH}),
    SPEAR_FIGHTER(new PromoteClass[] {PromoteClass.SPEAR_MASTER,PromoteClass.BASARA}),
    DIVINER(new PromoteClass[] {PromoteClass.BASARA,PromoteClass.ONMYOJI}),
    SHRINE_MAIDEN(new PromoteClass[] {PromoteClass.ONMYOJI,PromoteClass.PRIESTESS},"MONK"),
    SKY_KNIGHT(new PromoteClass[] {PromoteClass.FALCON_KNIGHT,PromoteClass.KINSHI_KNIGHT}),
    ARCHER(new PromoteClass[] {PromoteClass.KINSHI_KNIGHT,PromoteClass.SNIPER}),
    KITSUNE(new PromoteClass[] {PromoteClass.NINE_TAILS}),
    SONGSTRESS,
    DREAD_FIGHTER,
    DARK_FALCON,
    BALLISTICIAN,
    WITCH,
    LODESTAR,
    VANGUARD,
    GREAT_LORD,
    GRANDMASTER;
    
    private final PromoteClass[] promotions;
    private final String maleName;
    BaseClass(){
        promotions = new PromoteClass[0];
        maleName = this.toString();
    }
    BaseClass(PromoteClass[] promotions){
        this.promotions = promotions;
        maleName = this.toString();
    }
    BaseClass(PromoteClass[] promotions, String maleName){
        this.promotions = promotions;
        this.maleName = maleName;
    }
    public String name(boolean female){
        String name;
        if(female)
            name = this.toString();
        else
            name = maleName;
        name = name.replace('_',' ');
        for(int x = 1; x < name.length() - 1; x++)
            if(!name.substring(x - 1,x).equals(" "))
                name = name.substring(0,x) + name.substring(x,x+1).toLowerCase() + name.substring(x+1);
        name = name.substring(0,name.length()-1) + name.substring(name.length()-1,name.length()).toLowerCase();
        return name;
    }
    public boolean canPromote(){
        return promotions.length > 0;
    }
    public PromoteClass[] getPromotes(){
        return promotions;
    }
    public static BaseClass getParallel(BaseClass baseClass){
        if(baseClass == BaseClass.CAVALIER)
            return BaseClass.NINJA;
        if(baseClass == BaseClass.KNIGHT)
            return BaseClass.SPEAR_FIGHTER;
        if(baseClass == BaseClass.FIGHTER)
            return BaseClass.ONI_SAVAGE;
        if(baseClass == BaseClass.MERCENARY)
            return BaseClass.SAMURAI;
        if(baseClass == BaseClass.OUTLAW)
            return BaseClass.ARCHER;
        if(baseClass == BaseClass.SAMURAI)
            return BaseClass.MERCENARY;
        if(baseClass == BaseClass.ONI_SAVAGE)
            return BaseClass.FIGHTER;
        if(baseClass == BaseClass.SPEAR_FIGHTER)
            return BaseClass.KNIGHT;
        if(baseClass == BaseClass.DIVINER)
            return BaseClass.DARK_MAGE;
        if(baseClass == BaseClass.SKY_KNIGHT)
            return BaseClass.WYVERN_RIDER;
        if(baseClass == BaseClass.ARCHER)
            return BaseClass.OUTLAW;
        if(baseClass == BaseClass.WYVERN_RIDER)
            return BaseClass.SKY_KNIGHT;
        if(baseClass == BaseClass.NINJA)
            return BaseClass.CAVALIER;
        if(baseClass == BaseClass.DARK_MAGE)
            return BaseClass.DIVINER;
        if(baseClass == BaseClass.WOLFSKIN)
            return BaseClass.OUTLAW;
        if(baseClass == BaseClass.KITSUNE)
            return BaseClass.APOTHECARY;
        if(baseClass == BaseClass.SONGSTRESS)
            return BaseClass.TROUBADOUR;
        if(baseClass == BaseClass.VILLAGER)
            return BaseClass.APOTHECARY;
        return null;
    }
}
