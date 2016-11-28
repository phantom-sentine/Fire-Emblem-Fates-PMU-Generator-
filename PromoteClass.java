
/**
 * Enumeration class PromoteClass - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PromoteClass
{
    NOHR_NOBLE,
    HOSHIDO_NOBLE,
    PALADIN,
    GREAT_KNIGHT,
    GENERAL,
    BERSERKER,
    HERO,
    BOW_KNIGHT,
    ADVENTURER,
    WYVERN_LORD,
    MALIG_KNIGHT,
    SORCERER,
    DARK_KNIGHT,
    STRATEGIST,
    MAID("BULTER"),
    WOLFSSEGNER,
    SWORDMASTER,
    MASTER_OF_ARMS,
    MERCHANT,
    MECHANIST,
    MASTER_NINJA,
    ONI_CHIEFTAN,
    BLACKSMITH,
    SPEAR_MASTER,
    BASARA,
    ONMYOJI,
    PRIESTESS("GREAT_MASTER"),
    FALCON_KNIGHT,
    KINSHI_KNIGHT,
    SNIPER,
    NINE_TAILS;
    
    private final String maleName;
    PromoteClass(){
        maleName = this.toString();
    }
    PromoteClass(String maleName) {
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
}
