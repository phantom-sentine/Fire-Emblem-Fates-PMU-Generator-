import java.util.*;
public class FEFatesPMU
{
    public static Unit[] generate(int route, int numRoutesOwned, boolean annaOnTheRun, boolean royalRoyale, boolean ballisticianBlitz, boolean witchesTrial,
    boolean vanguardDawn, boolean hiddenTruths1, boolean marthAmiibo, boolean ikeAmiibo, boolean lucinaAmiibo, boolean robinAmiibo){
        // Routes: Conquest 0, Birthright 1, Revelations 2
                
        BaseClass[] talents = new BaseClass[] {BaseClass.CAVALIER,BaseClass.KNIGHT,BaseClass.FIGHTER,BaseClass.MERCENARY,BaseClass.OUTLAW,
            BaseClass.WYVERN_RIDER,BaseClass.DARK_MAGE,BaseClass.TROUBADOUR,BaseClass.SAMURAI,BaseClass.APOTHECARY,BaseClass.NINJA,
            BaseClass.ONI_SAVAGE,BaseClass.SPEAR_FIGHTER,BaseClass.DIVINER,BaseClass.SHRINE_MAIDEN,BaseClass.SKY_KNIGHT,BaseClass.ARCHER};
        BoonBane[] boonBane = new BoonBane[] {BoonBane.Str,BoonBane.Mag,BoonBane.Skl,BoonBane.Spd,BoonBane.Def,BoonBane.Res,BoonBane.Luck, BoonBane.HP};
        
        BaseClass talent = talents[(int)(Math.random()*talents.length)];
        BoonBane boon = boonBane[(int)(Math.random()*boonBane.length)];
        BoonBane bane = null;
        while(bane == null || bane == boon)
            bane = boonBane[(int)(Math.random()*boonBane.length)];
        boolean female = true;
        if((int)(Math.random()*100) > 50)
            female = false;
        
        Unit avatar;
        if(route == 0)
            avatar = new Unit(muName(female),female,new BaseClass[] {BaseClass.CQ_NOHR_PRINCESS,talent},boon,bane);
        else if(route == 1)
            avatar = new Unit(muName(female),female,new BaseClass[] {BaseClass.BR_NOHR_PRINCESS,talent},boon,bane);
        else
            avatar = new Unit(muName(female),female,new BaseClass[] {BaseClass.RV_NOHR_PRINCESS,talent},boon,bane);
        
        //First Gen
        //All Routes
        Unit felicia = new Unit("Felicia",true,new BaseClass[] {BaseClass.TROUBADOUR,BaseClass.MERCENARY});
        Unit jakob = new Unit("Jakob",false,new BaseClass[] {BaseClass.TROUBADOUR,BaseClass.CAVALIER});
        Unit kaze = new Unit("Kaze",false,new BaseClass[] {BaseClass.NINJA,BaseClass.SAMURAI});
        Unit azura = new Unit("Azura",true,new BaseClass[] {BaseClass.SONGSTRESS,BaseClass.SKY_KNIGHT});
        Unit silas = new Unit("Silas",false,new BaseClass[] {BaseClass.CAVALIER,BaseClass.MERCENARY});
        Unit shura = new Unit("Shura",false,new BaseClass[] {BaseClass.OUTLAW,BaseClass.NINJA,BaseClass.FIGHTER});
        Unit izana = new Unit("Izana",false,new BaseClass[] {BaseClass.SHRINE_MAIDEN,BaseClass.SAMURAI,BaseClass.APOTHECARY});
        Unit mozu = new Unit("Mozu",true,new BaseClass[] {BaseClass.VILLAGER,BaseClass.ARCHER});
        //Conquest
        Unit gunter = new Unit("Gunter",false,new BaseClass[] {BaseClass.CAVALIER,BaseClass.MERCENARY,BaseClass.WYVERN_RIDER});
        Unit elise = new Unit("Elise",true,new BaseClass[] {BaseClass.TROUBADOUR,BaseClass.WYVERN_RIDER});
        Unit arthur = new Unit("Arthur",false,new BaseClass[] {BaseClass.FIGHTER,BaseClass.CAVALIER});
        Unit effie = new Unit("Effie",true,new BaseClass[] {BaseClass.KNIGHT,BaseClass.TROUBADOUR});
        Unit odin = new Unit("Odin",false,new BaseClass[] {BaseClass.DARK_MAGE,BaseClass.SAMURAI});
        Unit niles = new Unit("Niles",false,new BaseClass[] {BaseClass.OUTLAW,BaseClass.DARK_MAGE});
        Unit nyx = new Unit("Nyx",true,new BaseClass[] {BaseClass.DARK_MAGE,BaseClass.OUTLAW});
        Unit camilla = new Unit("Camilla",true,new BaseClass[] {BaseClass.WYVERN_RIDER,BaseClass.DARK_MAGE});
        Unit selena = new Unit("Selena",true,new BaseClass[] {BaseClass.MERCENARY,BaseClass.SKY_KNIGHT});
        Unit beruka = new Unit("Beruka",true,new BaseClass[] {BaseClass.WYVERN_RIDER,BaseClass.FIGHTER});
        Unit laslow = new Unit("Laslow",false,new BaseClass[] {BaseClass.MERCENARY,BaseClass.NINJA});
        Unit peri = new Unit("Peri",true,new BaseClass[] {BaseClass.CAVALIER,BaseClass.DARK_MAGE});
        Unit benny = new Unit("Benny",false,new BaseClass[] {BaseClass.KNIGHT,BaseClass.FIGHTER});
        Unit charlotte = new Unit("Charlotte",true,new BaseClass[] {BaseClass.FIGHTER,BaseClass.TROUBADOUR});
        Unit leo = new Unit("Leo",false,new BaseClass[] {BaseClass.DARK_MAGE,BaseClass.TROUBADOUR});
        Unit keaton = new Unit("Keaton",false,new BaseClass[] {BaseClass.WOLFSKIN,BaseClass.FIGHTER});
        Unit xander = new Unit("Xander",false,new BaseClass[] {BaseClass.CAVALIER,BaseClass.WYVERN_RIDER});
        Unit flora = new Unit("Flora",true,new BaseClass[] {BaseClass.TROUBADOUR,BaseClass.DARK_MAGE,BaseClass.MERCENARY});
        //Birthright
        Unit rinkah = new Unit("Rinkah",true,new BaseClass[] {BaseClass.ONI_SAVAGE,BaseClass.NINJA});
        Unit sakura = new Unit("Sakura",true,new BaseClass[] {BaseClass.SHRINE_MAIDEN,BaseClass.SKY_KNIGHT});
        Unit hana = new Unit("Hana",true,new BaseClass[] {BaseClass.SAMURAI,BaseClass.SHRINE_MAIDEN});
        Unit subaki = new Unit("Subaki",false,new BaseClass[] {BaseClass.SKY_KNIGHT,BaseClass.SAMURAI});
        Unit saizo = new Unit("Saizo",false,new BaseClass[] {BaseClass.NINJA,BaseClass.SAMURAI});
        Unit orochi = new Unit("Orochi",true,new BaseClass[] {BaseClass.DIVINER,BaseClass.APOTHECARY});
        Unit hinoka = new Unit("Hinoka",true,new BaseClass[] {BaseClass.SKY_KNIGHT,BaseClass.SPEAR_FIGHTER});
        Unit azama = new Unit("Azama",false,new BaseClass[] {BaseClass.SHRINE_MAIDEN,BaseClass.APOTHECARY});
        Unit setsuna = new Unit("Setsuna",true,new BaseClass[] {BaseClass.ARCHER,BaseClass.NINJA});
        Unit hayato = new Unit("Hayato",false,new BaseClass[] {BaseClass.DIVINER,BaseClass.ONI_SAVAGE});
        Unit oboro = new Unit("Oboro",true,new BaseClass[] {BaseClass.SPEAR_FIGHTER,BaseClass.APOTHECARY});
        Unit hinata = new Unit("Hinata",false,new BaseClass[] {BaseClass.SAMURAI,BaseClass.ONI_SAVAGE});
        Unit takumi = new Unit("Takumi",false,new BaseClass[] {BaseClass.ARCHER,BaseClass.SPEAR_FIGHTER});
        Unit kagero = new Unit("Kagero",true,new BaseClass[] {BaseClass.NINJA,BaseClass.DIVINER});
        Unit reina = new Unit("Reina",true,new BaseClass[] {BaseClass.SKY_KNIGHT,BaseClass.DIVINER,BaseClass.NINJA});
        Unit kaden = new Unit("Kaden",false,new BaseClass[] {BaseClass.KITSUNE,BaseClass.DIVINER});
        Unit ryoma = new Unit("Ryoma",false,new BaseClass[] {BaseClass.SAMURAI,BaseClass.SKY_KNIGHT});
        Unit scarlet = new Unit("Scarlet",true,new BaseClass[] {BaseClass.WYVERN_RIDER,BaseClass.OUTLAW,BaseClass.KNIGHT});
        Unit yukimura = new Unit("Yukimura",false,new BaseClass[] {BaseClass.APOTHECARY,BaseClass.SAMURAI,BaseClass.SHRINE_MAIDEN});
        //Revelations
        Unit fuga = new Unit("Fuga",false,new BaseClass[] {BaseClass.SAMURAI,BaseClass.ONI_SAVAGE,BaseClass.SHRINE_MAIDEN});
        //DLC
        Unit anna = new Unit("Anna",true,new BaseClass[] {BaseClass.OUTLAW,BaseClass.TROUBADOUR,BaseClass.APOTHECARY});
        //Amiibo
        Unit marth = new Unit("Marth",false,new BaseClass[] {BaseClass.LODESTAR});
        Unit ike = new Unit("Ike",false,new BaseClass[] {BaseClass.VANGUARD});
        Unit lucina = new Unit("Lucina",true,new BaseClass[] {BaseClass.GREAT_LORD});
        Unit robin = new Unit("Robin",false,new BaseClass[] {BaseClass.GRANDMASTER});
        
        //Second Gen
        //All Routes
        Unit kana = new Unit("Kana",true,new BaseClass[] {avatar.getClassSets()[0],talent},avatar);
        if(female)
            kana = new Unit("Kana",false,new BaseClass[] {avatar.getClassSets()[0],talent},avatar);
        Unit shigure = new Unit("Shigure",false,new BaseClass[] {BaseClass.SKY_KNIGHT,BaseClass.TROUBADOUR},azura);
        Unit dwyer = new Unit("Dwyer",false,new BaseClass[] {BaseClass.TROUBADOUR,BaseClass.CAVALIER},jakob);
        Unit sophie = new Unit("Sophie",true,new BaseClass[] {BaseClass.CAVALIER,BaseClass.MERCENARY},silas);
        Unit midori = new Unit("Midori",true,new BaseClass[] {BaseClass.APOTHECARY,BaseClass.NINJA},kaze);
        //Conquest
        Unit siegbert = new Unit("Siegbert",false,new BaseClass[] {BaseClass.CAVALIER,BaseClass.WYVERN_RIDER},xander);
        Unit forrest = new Unit("Forrest",false,new BaseClass[] {BaseClass.TROUBADOUR,BaseClass.DARK_MAGE},leo);
        Unit ignatius = new Unit("Ignatius",false,new BaseClass[] {BaseClass.KNIGHT,BaseClass.FIGHTER},benny);
        Unit velouria = new Unit("Velouria",true,new BaseClass[] {BaseClass.WOLFSKIN,BaseClass.FIGHTER},keaton);
        Unit percy = new Unit("Percy",false,new BaseClass[] {BaseClass.WYVERN_RIDER,BaseClass.FIGHTER},arthur);
        Unit ophelia = new Unit("Ophelia",true,new BaseClass[] {BaseClass.DARK_MAGE,BaseClass.SAMURAI},odin);
        Unit soleil = new Unit("Soleil",true,new BaseClass[] {BaseClass.MERCENARY,BaseClass.NINJA},laslow);
        Unit nina = new Unit("Nina",true,new BaseClass[] {BaseClass.OUTLAW,BaseClass.DARK_MAGE},niles);
        //Birthright
        Unit shiro = new Unit("Shiro",false,new BaseClass[] {BaseClass.SPEAR_FIGHTER,BaseClass.SAMURAI},ryoma);
        Unit kiragi = new Unit("Kiragi",false,new BaseClass[] {BaseClass.ARCHER,BaseClass.SPEAR_FIGHTER},takumi);
        Unit asugi = new Unit("Asugi",false,new BaseClass[] {BaseClass.NINJA,BaseClass.SAMURAI},saizo);
        Unit selkie = new Unit("Selkie",true,new BaseClass[] {BaseClass.KITSUNE,BaseClass.DIVINER},kaden);
        Unit hisame = new Unit("Hisame",false,new BaseClass[] {BaseClass.SAMURAI,BaseClass.ONI_SAVAGE},hinata);
        Unit mitama = new Unit("Mitama",true,new BaseClass[] {BaseClass.SHRINE_MAIDEN,BaseClass.APOTHECARY},azama);
        Unit caeldori = new Unit("Caeldori",true,new BaseClass[] {BaseClass.SKY_KNIGHT,BaseClass.SAMURAI},subaki);
        Unit rhajat = new Unit("Rhajat",true,new BaseClass[] {BaseClass.DIVINER,BaseClass.ONI_SAVAGE},hayato);
        
        if(route == 0){
            felicia.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            jakob.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            kaze.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            azura.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            silas.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            mozu.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            elise.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,keaton});
            arthur.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            effie.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            odin.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            niles.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            nyx.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            camilla.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,keaton});
            selena.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            beruka.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            laslow.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            peri.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            benny.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            charlotte.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander});
            leo.setSSupports(new Unit[]{felicia,azura,mozu,effie,nyx,selena,beruka,peri,charlotte});
            keaton.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte});
            xander.setSSupports(new Unit[]{felicia,azura,mozu,effie,nyx,selena,beruka,peri,charlotte});
            if(female)
                avatar.setSSupports(new Unit[] {gunter,jakob,kaze,silas,shura,izana,arthur,odin,niles,laslow,benny,leo,keaton,xander,shigure,
                    dwyer,siegbert,forrest,ignatius,percy});
            else if(!female && !annaOnTheRun)
                avatar.setSSupports(new Unit[]{felicia,azura,mozu,effie,niles,nyx,selena,beruka,peri,charlotte,flora,sophie,midori,velouria,ophelia,
                     soleil,nina});
            else
                avatar.setSSupports(new Unit[]{felicia,azura,mozu,effie,niles,nyx,selena,beruka,peri,charlotte,flora,sophie,midori,velouria,ophelia,
                     soleil,nina,anna});
        }
        else if(route == 1){
            felicia.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato});
            jakob.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            kaze.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            azura.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato});
            silas.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            rinkah.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato});
            sakura.setSSupports(new Unit[] {jakob,silas,kaze,saizo,kaden,hinata,azama,subaki,hayato});
            hana.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato});
            subaki.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            saizo.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            orochi.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato});
            hinoka.setSSupports(new Unit[] {jakob,silas,kaze,saizo,kaden,hinata,azama,subaki,hayato});
            azama.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            setsuna.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato});
            hayato.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            oboro.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato});
            hinata.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            takumi.setSSupports(new Unit[] {felicia,azura,mozu,rinkah,orochi,kagero,hana,oboro});
            kagero.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato});
            kaden.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro});
            ryoma.setSSupports(new Unit[] {felicia,azura,mozu,rinkah,orochi,kagero,hana,oboro});
            if(female)
                avatar.setSSupports(new Unit[] {jakob,silas,kaze,shura,izana,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,yukimura,shigure,
                    dwyer,shiro,kiragi,asugi,hisame,rhajat});
            else if(!female && !annaOnTheRun)
                avatar.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,reina,hana,oboro,scarlet,sophie,midori,
                    selkie,mitama,caeldori,rhajat});
            else
                avatar.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,reina,hana,oboro,scarlet,sophie,midori,
                    selkie,mitama,caeldori,rhajat,anna});
        }
        if(route == 2){
            felicia.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,ryoma,takumi,saizo,kaden,hinata,azama,
                subaki,hayato});
            jakob.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,hinoka,sakura,rinkah,orochi,kagero,
                hana,setsuna,oboro});
            kaze.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,hinoka,sakura,rinkah,orochi,kagero,
                hana,setsuna,oboro});
            azura.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,ryoma,takumi,saizo,kaden,hinata,azama,
                subaki,hayato});
            silas.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,hinoka,sakura,rinkah,orochi,kagero,
                hana,setsuna,oboro});
            mozu.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,ryoma,takumi,saizo,kaden,hinata,azama,
                subaki,hayato});
            elise.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,keaton,ryoma,takumi});
            arthur.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,kagero,setsuna});
            effie.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,hayato,azama});
            odin.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,orochi,kagero});
            niles.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,oboro,setsuna});
            nyx.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,hayato,subaki});
            camilla.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,keaton,ryoma,takumi});
            selena.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,subaki,hinata});
            beruka.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,azama,saizo});
            laslow.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,hana,orochi});
            peri.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,hinata,kaden});
            benny.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,rinkah,oboro});
            charlotte.setSSupports(new Unit[] {jakob,kaze,silas,arthur,odin,niles,laslow,benny,leo,keaton,xander,saizo,kaden});
            leo.setSSupports(new Unit[]{felicia,azura,mozu,effie,nyx,selena,beruka,peri,charlotte,hinoka,sakura});
            keaton.setSSupports(new Unit[]{felicia,azura,mozu,elise,effie,nyx,camilla,selena,beruka,peri,charlotte,rinkah,hana});
            xander.setSSupports(new Unit[]{felicia,azura,mozu,effie,nyx,selena,beruka,peri,charlotte,hinoka,sakura});
            sakura.setSSupports(new Unit[] {jakob,silas,kaze,saizo,kaden,hinata,azama,subaki,hayato,xander,leo});
            hana.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,laslow,keaton});
            subaki.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro,selena,nyx});
            saizo.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro,charlotte,beruka});
            orochi.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,laslow,odin});
            hinoka.setSSupports(new Unit[] {jakob,silas,kaze,saizo,kaden,hinata,azama,subaki,hayato,xander,leo});
            azama.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro,effie,beruka});
            setsuna.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,niles,arthur});
            hayato.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro,effie,nyx});
            oboro.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,benny,niles});
            hinata.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro,peri,selena});
            takumi.setSSupports(new Unit[] {felicia,azura,mozu,rinkah,orochi,kagero,hana,oboro,camilla,elise});
            kagero.setSSupports(new Unit[] {jakob,silas,kaze,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,odin,arthur});
            kaden.setSSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,hana,oboro,peri,charlotte});
            ryoma.setSSupports(new Unit[] {felicia,azura,mozu,rinkah,orochi,kagero,hana,oboro,camilla,elise});
            if(female)
                avatar.setSSupports(new Unit[] {gunter,jakob,kaze,silas,shura,arthur,odin,niles,laslow,benny,leo,keaton,xander,shigure,dwyer,
                    siegbert,forrest,ignatius,percy,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,shiro,kiragi,asugi,hisame,rhajat,fuga});
            else if(!female && !annaOnTheRun)
                avatar.setSSupports(new Unit[]{felicia,azura,mozu,effie,niles,nyx,selena,beruka,peri,charlotte,flora,sophie,midori,velouria,ophelia,
                     soleil,nina,hinoka,sakura,rinkah,orochi,kagero,reina,hana,oboro,scarlet,selkie,mitama,caeldori,rhajat});
            else
                avatar.setSSupports(new Unit[]{felicia,azura,mozu,effie,niles,nyx,selena,beruka,peri,charlotte,flora,sophie,midori,velouria,ophelia,
                     soleil,nina,hinoka,sakura,rinkah,orochi,kagero,reina,hana,oboro,scarlet,selkie,mitama,caeldori,rhajat,anna});
        }
        
        if(route == 0){
            gunter.setAPlusSupports(new Unit[] {jakob});
            felicia.setAPlusSupports(new Unit[] {peri,flora});
            jakob.setAPlusSupports(new Unit[] {gunter,silas});
            kaze.setAPlusSupports(new Unit[] {silas,xander});
            azura.setAPlusSupports(new Unit[] {elise});
            silas.setAPlusSupports(new Unit[] {jakob,kaze});
            mozu.setAPlusSupports(new Unit[] {effie,nyx});
            elise.setAPlusSupports(new Unit[] {camilla,azura,effie});
            arthur.setAPlusSupports(new Unit[] {benny,keaton,niles});
            effie.setAPlusSupports(new Unit[] {elise,mozu,nyx});
            odin.setAPlusSupports(new Unit[] {leo,laslow,niles});
            niles.setAPlusSupports(new Unit[] {leo,odin,arthur});
            nyx.setAPlusSupports(new Unit[] {mozu,charlotte,effie});
            camilla.setAPlusSupports(new Unit[] {elise,beruka,selena});
            selena.setAPlusSupports(new Unit[] {camilla,beruka,peri});
            beruka.setAPlusSupports(new Unit[] {camilla,charlotte,selena});
            laslow.setAPlusSupports(new Unit[] {xander,odin,keaton});
            peri.setAPlusSupports(new Unit[] {felicia,charlotte,selena});
            benny.setAPlusSupports(new Unit[] {keaton,arthur});
            charlotte.setAPlusSupports(new Unit[] {peri,beruka,nyx});
            leo.setAPlusSupports(new Unit[] {xander,odin,niles});
            keaton.setAPlusSupports(new Unit[] {benny,arthur,laslow});
            xander.setAPlusSupports(new Unit[] {kaze,laslow,leo});
            flora.setAPlusSupports(new Unit[] {felicia});
            if(!female)
                avatar.setAPlusSupports(new Unit[] {gunter,jakob,kaze,silas,shura,izana,arthur,odin,laslow,benny,leo,keaton,xander,shigure,
                    dwyer,siegbert,forrest,ignatius,percy});
            else if(female && !annaOnTheRun)
                avatar.setAPlusSupports(new Unit[]{felicia,azura,mozu,effie,nyx,selena,beruka,peri,charlotte,flora,sophie,midori,velouria,ophelia,
                     soleil,nina});
            else
                avatar.setAPlusSupports(new Unit[]{felicia,azura,mozu,effie,nyx,selena,beruka,peri,charlotte,flora,sophie,midori,velouria,ophelia,
                     soleil,nina,anna});
        }
        if(route == 1){
            felicia.setAPlusSupports(new Unit[] {hana});
            jakob.setAPlusSupports(new Unit[] {silas,takumi});
            kaze.setAPlusSupports(new Unit[] {saizo,silas});
            azura.setAPlusSupports(new Unit[] {hinoka,sakura});
            silas.setAPlusSupports(new Unit[] {ryoma,jakob,kaze});
            mozu.setAPlusSupports(new Unit[] {oboro});
            rinkah.setAPlusSupports(new Unit[] {orochi,kagero,oboro});
            sakura.setAPlusSupports(new Unit[] {hinoka,hana,azura});
            hana.setAPlusSupports(new Unit[] {sakura,setsuna});
            subaki.setAPlusSupports(new Unit[] {azama,saizo,hinata});
            saizo.setAPlusSupports(new Unit[] {ryoma,subaki,kaze});
            orochi.setAPlusSupports(new Unit[] {rinkah,kagero,oboro});
            hinoka.setAPlusSupports(new Unit[] {sakura,azura,setsuna});
            hayato.setAPlusSupports(new Unit[] {kaden,azama});
            oboro.setAPlusSupports(new Unit[] {orochi,rinkah,mozu});
            hinata.setAPlusSupports(new Unit[] {takumi,kaden,subaki});
            takumi.setAPlusSupports(new Unit[] {ryoma,hinata,jakob});
            kagero.setAPlusSupports(new Unit[] {orochi,rinkah,setsuna});
            kaden.setAPlusSupports(new Unit[] {hinata,azama,hayato});
            ryoma.setAPlusSupports(new Unit[] {saizo,silas,takumi});
            if(!female)
                avatar.setAPlusSupports(new Unit[] {jakob,silas,kaze,shura,izana,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,yukimura,shigure,
                    dwyer,shiro,kiragi,asugi,hisame});
            else if(female && !annaOnTheRun)
                avatar.setAPlusSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,reina,hana,oboro,scarlet,sophie,midori,
                    selkie,mitama,caeldori});
            else
                avatar.setAPlusSupports(new Unit[] {felicia,azura,mozu,hinoka,sakura,rinkah,orochi,kagero,reina,hana,oboro,scarlet,sophie,midori,
                    selkie,mitama,caeldori,anna});
        }
        if(route == 2){
            felicia.setAPlusSupports(new Unit[] {hana,peri,flora});
            jakob.setAPlusSupports(new Unit[] {silas,takumi});
            kaze.setAPlusSupports(new Unit[] {silas,xander,saizo});
            azura.setAPlusSupports(new Unit[] {elise,sakura,hinoka});
            silas.setAPlusSupports(new Unit[] {jakob,kaze,ryoma});
            mozu.setAPlusSupports(new Unit[] {effie,nyx,oboro});
            elise.setAPlusSupports(new Unit[] {camilla,azura,effie,sakura});
            arthur.setAPlusSupports(new Unit[] {benny,keaton,niles,azama});
            effie.setAPlusSupports(new Unit[] {elise,mozu,nyx,hana});
            odin.setAPlusSupports(new Unit[] {leo,laslow,niles,hinata});
            niles.setAPlusSupports(new Unit[] {leo,odin,arthur,subaki});
            nyx.setAPlusSupports(new Unit[] {mozu,charlotte,effie,orochi});
            camilla.setAPlusSupports(new Unit[] {elise,beruka,selena,hinoka});
            selena.setAPlusSupports(new Unit[] {camilla,beruka,peri,setsuna});
            beruka.setAPlusSupports(new Unit[] {camilla,charlotte,selena,oboro});
            laslow.setAPlusSupports(new Unit[] {xander,odin,keaton,saizo});
            peri.setAPlusSupports(new Unit[] {felicia,charlotte,selena,kagero});
            benny.setAPlusSupports(new Unit[] {keaton,arthur,hayato});
            charlotte.setAPlusSupports(new Unit[] {peri,beruka,nyx,rinkah});
            leo.setAPlusSupports(new Unit[] {xander,odin,niles,takumi});
            keaton.setAPlusSupports(new Unit[] {benny,arthur,laslow,kaden});
            xander.setAPlusSupports(new Unit[] {kaze,laslow,leo,ryoma});
            flora.setAPlusSupports(new Unit[] {felicia});
            rinkah.setAPlusSupports(new Unit[] {orochi,kagero,oboro,charlotte});
            sakura.setAPlusSupports(new Unit[] {hinoka,hana,azura,elise});
            hana.setAPlusSupports(new Unit[] {sakura,setsuna,effie});
            subaki.setAPlusSupports(new Unit[] {azama,saizo,hinata,niles});
            saizo.setAPlusSupports(new Unit[] {ryoma,subaki,kaze,laslow});
            orochi.setAPlusSupports(new Unit[] {rinkah,kagero,oboro,nyx});
            hinoka.setAPlusSupports(new Unit[] {sakura,azura,setsuna,camilla});
            hayato.setAPlusSupports(new Unit[] {kaden,azama,benny,fuga});
            oboro.setAPlusSupports(new Unit[] {orochi,rinkah,mozu,beruka});
            hinata.setAPlusSupports(new Unit[] {takumi,kaden,subaki,odin});
            takumi.setAPlusSupports(new Unit[] {ryoma,hinata,jakob,leo});
            kagero.setAPlusSupports(new Unit[] {orochi,rinkah,setsuna,peri});
            kaden.setAPlusSupports(new Unit[] {hinata,azama,hayato,keaton});
            ryoma.setAPlusSupports(new Unit[] {saizo,silas,takumi,xander});
            fuga.setAPlusSupports(new Unit[] {hayato});
            if(!female)
                avatar.setAPlusSupports(new Unit[] {gunter,jakob,kaze,silas,shura,arthur,odin,laslow,benny,leo,keaton,xander,shigure,dwyer,
                    siegbert,forrest,ignatius,percy,ryoma,takumi,saizo,kaden,hinata,azama,subaki,hayato,shiro,kiragi,asugi,hisame,fuga});
            else if(female && !annaOnTheRun)
                avatar.setAPlusSupports(new Unit[]{felicia,azura,mozu,effie,nyx,selena,beruka,peri,charlotte,flora,sophie,midori,velouria,ophelia,
                     soleil,nina,hinoka,sakura,rinkah,orochi,kagero,reina,hana,oboro,scarlet,selkie,mitama,caeldori});
            else
                avatar.setAPlusSupports(new Unit[]{felicia,azura,mozu,effie,nyx,selena,beruka,peri,charlotte,flora,sophie,midori,velouria,ophelia,
                     soleil,nina,hinoka,sakura,rinkah,orochi,kagero,reina,hana,oboro,scarlet,selkie,mitama,caeldori,anna});
        }
        
        ArrayList<Unit> roster = new ArrayList<Unit>();
        roster.add(felicia);
        roster.add(jakob);
        roster.add(kaze);
        roster.add(azura);
        roster.add(silas);
        roster.add(shura);
        roster.add(mozu);
        if(route == 0 || route == 2){
            roster.add(elise);
            roster.add(arthur);
            roster.add(effie);
            roster.add(odin);
            roster.add(niles);
            roster.add(nyx);
            roster.add(camilla);
            roster.add(selena);
            roster.add(beruka);
            roster.add(laslow);
            roster.add(peri);
            roster.add(benny);
            roster.add(charlotte);
            roster.add(leo);
            roster.add(keaton);
            roster.add(xander);
            roster.add(flora);
        }
        if(route == 1  || route == 2){
            roster.add(rinkah);
            roster.add(sakura);
            roster.add(hana);
            roster.add(subaki);
            roster.add(saizo);
            roster.add(orochi);
            roster.add(hinoka);
            roster.add(azama);
            roster.add(setsuna);
            roster.add(hayato);
            roster.add(oboro);
            roster.add(hinata);
            roster.add(takumi);
            roster.add(kagero);
            roster.add(reina);
            roster.add(kaden);
            roster.add(ryoma);
        }
        if(route == 0 || route == 1){
            roster.add(izana);
        }
        if(route == 0){
            roster.add(gunter);
        }
        if(route == 1){
            roster.add(scarlet);
            roster.add(yukimura);
        }
        if(route == 2)
            roster.add(fuga);
        if(annaOnTheRun)
            roster.add(anna);
        if(marthAmiibo)
            roster.add(marth);
        if(ikeAmiibo)
            roster.add(ike);
        if(lucinaAmiibo)
            roster.add(lucina);
        if(robinAmiibo)
            roster.add(robin);
        
        Collections.shuffle(roster);
        
        avatar.pickSSupportPartner();
        avatar.pickAPlusSupportPartner();
        if(avatar.getSSupportPartner().isSecondGen())
            avatar.getSSupportPartner().getFixedParent().pickSSupportPartner();
        if(avatar.getAPlusSupportPartner().isSecondGen())
            avatar.getAPlusSupportPartner().getFixedParent().pickSSupportPartner();
        
        for(int x = 0; x < roster.size(); x++){
            if(!roster.get(x).hasSSupportPartner() && roster.get(x).hasLegalSRankPartner()){
                roster.get(x).pickSSupportPartner();
            }
            roster.get(x).pickAPlusSupportPartner();
        }

        ArrayList<Unit> kanaAPlus = new ArrayList<Unit>();
        ArrayList<Unit> shigureAPlus = new ArrayList<Unit>();
        ArrayList<Unit> dwyerAPlus = new ArrayList<Unit>();
        ArrayList<Unit> sophieAPlus = new ArrayList<Unit>();
        ArrayList<Unit> midoriAPlus = new ArrayList<Unit>();
        
        ArrayList<Unit> siegbertAPlus = new ArrayList<Unit>();
        ArrayList<Unit> forrestAPlus = new ArrayList<Unit>();
        ArrayList<Unit> ignatiusAPlus = new ArrayList<Unit>();
        ArrayList<Unit> velouriaAPlus = new ArrayList<Unit>();
        ArrayList<Unit> percyAPlus = new ArrayList<Unit>();
        ArrayList<Unit> opheliaAPlus = new ArrayList<Unit>();
        ArrayList<Unit> soleilAPlus = new ArrayList<Unit>();
        ArrayList<Unit> ninaAPlus = new ArrayList<Unit>();
        
        ArrayList<Unit> shiroAPlus = new ArrayList<Unit>();
        ArrayList<Unit> kiragiAPlus = new ArrayList<Unit>();
        ArrayList<Unit> asugiAPlus = new ArrayList<Unit>();
        ArrayList<Unit> selkieAPlus = new ArrayList<Unit>();
        ArrayList<Unit> hisameAPlus = new ArrayList<Unit>();
        ArrayList<Unit> mitamaAPlus = new ArrayList<Unit>();
        ArrayList<Unit> caeldoriAPlus = new ArrayList<Unit>();
        ArrayList<Unit> rhajatAPlus = new ArrayList<Unit>();
        
        ArrayList<Unit> kanaS = new ArrayList<Unit>();
        ArrayList<Unit> shigureS = new ArrayList<Unit>();
        ArrayList<Unit> dwyerS = new ArrayList<Unit>();
        ArrayList<Unit> sophieS = new ArrayList<Unit>();
        ArrayList<Unit> midoriS = new ArrayList<Unit>();
        
        ArrayList<Unit> siegbertS = new ArrayList<Unit>();
        ArrayList<Unit> forrestS = new ArrayList<Unit>();
        ArrayList<Unit> ignatiusS = new ArrayList<Unit>();
        ArrayList<Unit> velouriaS = new ArrayList<Unit>();
        ArrayList<Unit> percyS = new ArrayList<Unit>();
        ArrayList<Unit> opheliaS = new ArrayList<Unit>();
        ArrayList<Unit> soleilS = new ArrayList<Unit>();
        ArrayList<Unit> ninaS = new ArrayList<Unit>();
        
        ArrayList<Unit> shiroS = new ArrayList<Unit>();
        ArrayList<Unit> kiragiS = new ArrayList<Unit>();
        ArrayList<Unit> asugiS = new ArrayList<Unit>();
        ArrayList<Unit> selkieS = new ArrayList<Unit>();
        ArrayList<Unit> hisameS = new ArrayList<Unit>();
        ArrayList<Unit> mitamaS = new ArrayList<Unit>();
        ArrayList<Unit> caeldoriS = new ArrayList<Unit>();
        ArrayList<Unit> rhajatS = new ArrayList<Unit>();
        
        if(kana.hasTwoParents() && !kana.hasSameSexParents()){
            roster.add(kana);
            if(female){
                siegbertAPlus.add(kana);
                percyAPlus.add(kana);
                if(sophie.getVariableParent() != null && !sophie.getVariableParent().equals(avatar))
                    sophieS.add(kana);
                if(midori.getVariableParent() != null && !midori.getVariableParent().equals(avatar))
                    midoriS.add(kana);
                if(velouria.getVariableParent() != null && !velouria.getVariableParent().equals(avatar))
                    velouriaS.add(kana);
                if(ophelia.getVariableParent() != null && !ophelia.getVariableParent().equals(avatar))
                    opheliaS.add(kana);
                if(soleil.getVariableParent() != null && !soleil.getVariableParent().equals(avatar))
                    soleilS.add(kana);
                if(nina.getVariableParent() != null && !nina.getVariableParent().equals(avatar))
                    ninaS.add(kana);
                if(selkie.getVariableParent() != null && !selkie.getVariableParent().equals(avatar))
                    selkieS.add(kana);
                if(mitama.getVariableParent() != null && !mitama.getVariableParent().equals(avatar))
                    mitamaS.add(kana);
                if(caeldori.getVariableParent() != null && !caeldori.getVariableParent().equals(avatar))
                    caeldoriS.add(kana);
                if(rhajat.getVariableParent() != null && !rhajat.getVariableParent().equals(avatar))
                    rhajatS.add(kana);
            }
            else{
                midoriAPlus.add(kana);
                velouriaAPlus.add(kana);
                if(shigure.getVariableParent() != null && !shigure.getVariableParent().equals(avatar))
                    shigureS.add(kana);
                dwyerS.add(kana);
                siegbertS.add(kana);
                forrestS.add(kana);
                ignatiusS.add(kana);
                percyS.add(kana);
                shiroS.add(kana);
                kiragiS.add(kana);
                asugiS.add(kana);
                hisameS.add(kana);
            }
        }
        if(shigure.hasTwoParents()){
            roster.add(shigure);
            forrestAPlus.add(shigure);
            if(kana.getVariableParent() != null && !female && !kana.getVariableParent().equals(azura))
                kanaS.add(shigure);
            if(sophie.getVariableParent() != null && !sophie.getVariableParent().equals(azura))
                sophieS.add(shigure);
            if (midori.getVariableParent() != null && !midori.getVariableParent().equals(azura))
                midoriS.add(shigure);
            if(velouria.getVariableParent() != null && !velouria.getVariableParent().equals(azura))
                velouriaS.add(shigure);
            if(ophelia.getVariableParent() != null && !ophelia.getVariableParent().equals(azura))
                opheliaS.add(shigure);
            if(soleil.getVariableParent() != null && !soleil.getVariableParent().equals(azura))
                soleilS.add(shigure);
            if(nina.getVariableParent() != null && !nina.getVariableParent().equals(azura))
                ninaS.add(shigure);
            if(selkie.getVariableParent() != null && !selkie.getVariableParent().equals(azura))
                selkieS.add(shigure);
            if(mitama.getVariableParent() != null && !mitama.getVariableParent().equals(azura))
                mitamaS.add(shigure);
            if(caeldori.getVariableParent() != null && !caeldori.getVariableParent().equals(azura))
                caeldoriS.add(shigure);
            if(rhajat.getVariableParent() != null && !rhajat.getVariableParent().equals(azura))
                rhajatS.add(shigure);
        }
        if(dwyer.hasTwoParents()){
           roster.add(dwyer);
           percyAPlus.add(dwyer);
           if(!female && !dwyer.getVariableParent().equals(avatar))
               kanaS.add(dwyer);
           sophieS.add(dwyer);
           midoriS.add(dwyer);
           velouriaS.add(dwyer);
           opheliaS.add(dwyer);
           soleilS.add(dwyer);
           ninaS.add(dwyer);
           selkieS.add(dwyer);
           mitamaS.add(dwyer);
           caeldoriS.add(dwyer);
           rhajatS.add(dwyer);
        }
        if(sophie.hasTwoParents()){
           roster.add(sophie);
           velouriaAPlus.add(sophie);
           soleilAPlus.add(sophie);
           if(female && !sophie.getVariableParent().equals(avatar))
               kanaS.add(sophie);
           shigureS.add(sophie);
           dwyerS.add(sophie);
           siegbertS.add(sophie);
           forrestS.add(sophie);
           ignatiusS.add(sophie);
           percyS.add(sophie);
           shiroS.add(sophie);
           kiragiS.add(sophie);
           asugiS.add(sophie);
           hisameS.add(sophie);
        }
        if(midori.hasTwoParents()){
           roster.add(midori);
           if(!female)
               kanaAPlus.add(midori);
           opheliaAPlus.add(midori);
           if(female && !midori.getVariableParent().equals(avatar))
               kanaS.add(midori);
           shigureS.add(midori);
           dwyerS.add(midori);
           siegbertS.add(midori);
           forrestS.add(midori);
           ignatiusS.add(midori);
           percyS.add(midori);
           shiroS.add(sophie);
           kiragiS.add(sophie);
           asugiS.add(sophie);
           hisameS.add(sophie);
        }
        if(siegbert.hasTwoParents()){
           roster.add(siegbert);
           if(female)
               kanaAPlus.add(siegbert);
           forrestAPlus.add(siegbert);
           ignatiusAPlus.add(siegbert);
           if(!female && !siegbert.getVariableParent().equals(avatar))
               kanaS.add(siegbert);
           sophieS.add(siegbert);
           midoriS.add(siegbert);
           velouriaS.add(siegbert);
           opheliaS.add(siegbert);
           soleilS.add(siegbert);
           ninaS.add(siegbert);
        }
        if(forrest.hasTwoParents()){
           roster.add(forrest);
           siegbertAPlus.add(forrest);
           shigureAPlus.add(forrest);
           ignatiusAPlus.add(forrest);
           if(!female && !forrest.getVariableParent().equals(avatar))
               kanaS.add(forrest);
           sophieS.add(forrest);
           midoriS.add(forrest);
           velouriaS.add(forrest);
           opheliaS.add(forrest);
           soleilS.add(forrest);
           ninaS.add(forrest);
        }
        if(ignatius.hasTwoParents()){
           roster.add(ignatius);
           siegbertAPlus.add(ignatius);
           forrestAPlus.add(ignatius);
           percyAPlus.add(ignatius);
           if(!female && !ignatius.getVariableParent().equals(avatar))
               kanaS.add(ignatius);
           sophieS.add(ignatius);
           midoriS.add(ignatius);
           velouriaS.add(ignatius);
           opheliaS.add(ignatius);
           soleilS.add(ignatius);
           ninaS.add(ignatius);
        }
        if(velouria.hasTwoParents()){
           roster.add(velouria);
           sophieAPlus.add(velouria);
           if(!female)
               kanaAPlus.add(velouria);
           ninaAPlus.add(velouria);
           if(female && !velouria.getVariableParent().equals(avatar))
               kanaS.add(velouria);
           shigureS.add(velouria);
           dwyerS.add(velouria);
           siegbertS.add(velouria);
           forrestS.add(velouria);
           ignatiusS.add(velouria);
           percyS.add(velouria);
        }
        if(percy.hasTwoParents()){
           roster.add(percy);
           ignatiusAPlus.add(percy);
           dwyerAPlus.add(percy);
           if(female)
               kanaAPlus.add(percy);
           if(!female && !percy.getVariableParent().equals(avatar))
               kanaS.add(percy);
           sophieS.add(percy);
           midoriS.add(percy);
           velouriaS.add(percy);
           opheliaS.add(percy);
           soleilS.add(percy);
           ninaS.add(percy);
        }
        if(ophelia.hasTwoParents()){
           roster.add(ophelia);
           midoriAPlus.add(ophelia);
           soleilAPlus.add(ophelia);
           if(female && !ophelia.getVariableParent().equals(avatar))
               kanaS.add(ophelia);
           shigureS.add(ophelia);
           dwyerS.add(ophelia);
           siegbertS.add(ophelia);
           forrestS.add(ophelia);
           ignatiusS.add(ophelia);
           percyS.add(ophelia);
        }
        if(soleil.hasTwoParents()){
           roster.add(soleil);
           opheliaAPlus.add(soleil);
           sophieAPlus.add(soleil);
           ninaAPlus.add(soleil);
           if(female && !soleil.getVariableParent().equals(avatar))
               kanaS.add(soleil);
           shigureS.add(soleil);
           dwyerS.add(soleil);
           siegbertS.add(soleil);
           forrestS.add(soleil);
           ignatiusS.add(soleil);
           percyS.add(soleil);
        }
        if(nina.hasTwoParents() && !nina.hasSameSexParents()){
           roster.add(nina);
           soleilAPlus.add(nina);
           velouriaAPlus.add(nina);
           if(female && !nina.getVariableParent().equals(avatar))
               kanaS.add(nina);
           shigureS.add(nina);
           dwyerS.add(nina);
           siegbertS.add(nina);
           forrestS.add(nina);
           ignatiusS.add(nina);
           percyS.add(nina);
        }
        if(shiro.hasTwoParents()){
            roster.add(shiro);
            kiragiAPlus.add(shiro);
            asugiAPlus.add(shiro);
            if(female)
                kanaAPlus.add(shiro);
            if(!female && !shiro.getVariableParent().equals(avatar))
               kanaS.add(shiro);
            sophieS.add(shiro);
            midoriS.add(shiro);
            selkieS.add(shiro);
            mitamaS.add(shiro);
            caeldoriS.add(shiro);
            rhajatS.add(shiro);
        }
        if(kiragi.hasTwoParents()){
            shiroAPlus.add(kiragi);
            hisameAPlus.add(kiragi);
            dwyerAPlus.add(kiragi);
            if(female)
                kanaAPlus.add(kiragi);
            if(!female && !kiragi.getVariableParent().equals(avatar))
               kanaS.add(kiragi);
            sophieS.add(kiragi);
            midoriS.add(kiragi);
            selkieS.add(kiragi);
            mitamaS.add(kiragi);
            caeldoriS.add(kiragi);
            rhajatS.add(kiragi);
        }
        if(asugi.hasTwoParents()){
            shiroAPlus.add(asugi);
            hisameAPlus.add(asugi);
            dwyerAPlus.add(asugi);
            if(female)
                kanaAPlus.add(asugi);
            if(!female && !asugi.getVariableParent().equals(avatar))
               kanaS.add(asugi);
            sophieS.add(asugi);
            midoriS.add(asugi);
            selkieS.add(asugi);
            mitamaS.add(asugi);
            caeldoriS.add(asugi);
            rhajatS.add(asugi);
        }
        if(selkie.hasTwoParents()){
            rhajatAPlus.add(selkie);
            mitamaAPlus.add(selkie);
            if(!female)
                kanaAPlus.add(selkie);
            if(female && !selkie.getVariableParent().equals(avatar))
               kanaS.add(selkie);
            shigureS.add(selkie);
            dwyerS.add(selkie);
            shiroS.add(selkie);
            kiragiS.add(selkie);
            hisameS.add(selkie);
        }
        if(hisame.hasTwoParents()){
            kiragiAPlus.add(hisame);
            asugiAPlus.add(hisame);
            shigureAPlus.add(hisame);
            if(!female && !hisame.getVariableParent().equals(avatar))
               kanaS.add(hisame);
            sophieS.add(hisame);
            midoriS.add(hisame);
            selkieS.add(hisame);
            mitamaS.add(hisame);
            caeldoriS.add(hisame);
            rhajatS.add(hisame);
        }
        if(mitama.hasTwoParents()){
            caeldoriAPlus.add(mitama);
            rhajatAPlus.add(mitama);
            if(!female)
                kanaAPlus.add(mitama);
            if(female && !mitama.getVariableParent().equals(avatar))
               kanaS.add(mitama);
            shigureS.add(mitama);
            dwyerS.add(mitama);
            shiroS.add(mitama);
            kiragiS.add(mitama);
            hisameS.add(mitama);
        }
        if(caeldori.hasTwoParents()){
            mitamaAPlus.add(caeldori);
            rhajatAPlus.add(caeldori);
            sophieAPlus.add(caeldori);
            if(female && !caeldori.getVariableParent().equals(avatar))
               kanaS.add(caeldori);
            shigureS.add(caeldori);
            dwyerS.add(caeldori);
            shiroS.add(caeldori);
            kiragiS.add(caeldori);
            hisameS.add(caeldori);
        }
        if(rhajat.hasTwoParents()){
            caeldoriAPlus.add(rhajat);
            mitamaAPlus.add(rhajat);
            selkieAPlus.add(rhajat);
            if(female && !rhajat.getVariableParent().equals(avatar))
               kanaS.add(rhajat);
            shigureS.add(rhajat);
            dwyerS.add(rhajat);
            shiroS.add(rhajat);
            kiragiS.add(rhajat);
            hisameS.add(rhajat);
        }
        
        kana.setAPlusSupports(kanaAPlus.toArray(new Unit[kanaAPlus.size()]));
        shigure.setAPlusSupports(shigureAPlus.toArray(new Unit[shigureAPlus.size()]));
        dwyer.setAPlusSupports(dwyerAPlus.toArray(new Unit[dwyerAPlus.size()]));
        sophie.setAPlusSupports(sophieAPlus.toArray(new Unit[sophieAPlus.size()]));
        midori.setAPlusSupports(midoriAPlus.toArray(new Unit[midoriAPlus.size()]));
        siegbert.setAPlusSupports(siegbertAPlus.toArray(new Unit[siegbertAPlus.size()]));
        forrest.setAPlusSupports(forrestAPlus.toArray(new Unit[forrestAPlus.size()]));
        ignatius.setAPlusSupports(ignatiusAPlus.toArray(new Unit[ignatiusAPlus.size()]));
        velouria.setAPlusSupports(velouriaAPlus.toArray(new Unit[velouriaAPlus.size()]));
        percy.setAPlusSupports(percyAPlus.toArray(new Unit[percyAPlus.size()]));
        ophelia.setAPlusSupports(opheliaAPlus.toArray(new Unit[opheliaAPlus.size()]));
        soleil.setAPlusSupports(soleilAPlus.toArray(new Unit[soleilAPlus.size()]));
        nina.setAPlusSupports(ninaAPlus.toArray(new Unit[ninaAPlus.size()]));
        
        kana.setSSupports(kanaS.toArray(new Unit[kanaS.size()]));
        shigure.setSSupports(shigureS.toArray(new Unit[shigureS.size()]));
        dwyer.setSSupports(dwyerS.toArray(new Unit[dwyerS.size()]));
        sophie.setSSupports(sophieS.toArray(new Unit[sophieS.size()]));
        midori.setSSupports(midoriS.toArray(new Unit[midoriS.size()]));
        siegbert.setSSupports(siegbertS.toArray(new Unit[siegbertS.size()]));
        forrest.setSSupports(forrestS.toArray(new Unit[forrestS.size()]));
        ignatius.setSSupports(ignatiusS.toArray(new Unit[ignatiusS.size()]));
        velouria.setSSupports(velouriaS.toArray(new Unit[velouriaS.size()]));
        percy.setSSupports(percyS.toArray(new Unit[percyS.size()]));
        ophelia.setSSupports(opheliaS.toArray(new Unit[opheliaS.size()]));
        soleil.setSSupports(soleilS.toArray(new Unit[soleilS.size()]));
        nina.setSSupports(ninaS.toArray(new Unit[ninaS.size()]));
        
        Collections.shuffle(roster);
        
        // 0 = Dread Fighter; 1 = Dark Falcon; 2 = Ballistician; 3 = Witch; 4 = Lodestar; 5 = Vanguard; 6 = Grandmaster; 7 = Great Lord
        Integer[] dlcSeals = new Integer[8];
        for(int x = 0; x < dlcSeals.length; x++){
            dlcSeals[x] = new Integer(0);
        }
        if(numRoutesOwned > 1)
            dlcSeals[0] += 2;
        if(numRoutesOwned > 2)
            dlcSeals[1] += 2;
        if(royalRoyale){
            dlcSeals[0] += 99;
            dlcSeals[1] += 99;
        }
        if(!ballisticianBlitz || !witchesTrial){
            if((int)(Math.random()*100) > 50)
                dlcSeals[2]++;
            else
                dlcSeals[3]++;
        }
        else if(!ballisticianBlitz && witchesTrial)
            dlcSeals[2]++;
        else
            dlcSeals[3]++;
        if(ballisticianBlitz)
            dlcSeals[2] += 99;
        if(witchesTrial)
            dlcSeals[3] += 99;
        dlcSeals[4]++;
        dlcSeals[7]++;
        if(vanguardDawn)
            dlcSeals[5] += 99;
        if(hiddenTruths1)
            dlcSeals[6] += 99;
            
        if((int)(Math.random()*100) < 8 && dlcSeals[0] > 0){
            avatar.giveDlcSeal(0);
            dlcSeals[0]--;
        }
        else if((int)(Math.random()*100) < 8 && dlcSeals[1] > 0){
            avatar.giveDlcSeal(1);
            dlcSeals[2]--;
        }
        else if(!avatar.isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[2] > 0){
            avatar.giveDlcSeal(2);
            dlcSeals[2]--;
        }
        else if(avatar.isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[3] > 0){
            avatar.giveDlcSeal(3);
            dlcSeals[3]--;
        }
        else if(!avatar.isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[4] > 0){
            avatar.giveDlcSeal(4);
            dlcSeals[4]--;
        }
        else if(!avatar.isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[5] > 0){
            avatar.giveDlcSeal(5);
            dlcSeals[5]--;
        }
        else if(!avatar.isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[6] > 0){
            avatar.giveDlcSeal(6);
            dlcSeals[6]--;
        }
        else if(avatar.isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[7] > 0){
            avatar.giveDlcSeal(7);
            dlcSeals[7]--;
        }
        
        for(int x = 0; x < roster.size(); x++){
            if((int)(Math.random()*100) < 8 && dlcSeals[0] > 0){
                roster.get(x).giveDlcSeal(0);
                dlcSeals[0]--;
            }
            else if((int)(Math.random()*100) < 8 && dlcSeals[1] > 0){
                roster.get(x).giveDlcSeal(1);
                dlcSeals[2]--;
            }
            else if(!roster.get(x).isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[2] > 0){
                roster.get(x).giveDlcSeal(2);
                dlcSeals[2]--;
            }
            else if(roster.get(x).isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[3] > 0){
                roster.get(x).giveDlcSeal(3);
                dlcSeals[3]--;
            }
            else if(!roster.get(x).isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[4] > 0){
                roster.get(x).giveDlcSeal(4);
                dlcSeals[4]--;
            }
            else if(!roster.get(x).isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[5] > 0){
                roster.get(x).giveDlcSeal(5);
                dlcSeals[5]--;
            }
            else if(!roster.get(x).isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[6] > 0){
                roster.get(x).giveDlcSeal(6);
                dlcSeals[6]--;
            }
            else if(roster.get(x).isFemale() && (int)(Math.random()*100) < 8 && dlcSeals[7] > 0){
                roster.get(x).giveDlcSeal(7);
                dlcSeals[7]--;
            }
            if(roster.get(x).hasLegalSRankPartner()){
                roster.get(x).pickSSupportPartner();
            }
            roster.get(x).pickAPlusSupportPartner();
        }
        
        //if(route == 0)
        //    System.out.println("Fire Emblem Fates: Conquest PMU");
        //if(route == 1)
        //    System.out.println("Fire Emblem Fates: Birthright PMU");
        //if(route == 2)
        //    System.out.println("Fire Emblem Fates: Revelations PMU");
        //System.out.println("---");
        //System.out.println(avatar.toString());
        ArrayList<Unit> picks = new ArrayList<Unit>();
        picks.add(avatar);
        for(int x = 0; x < 15; x++){
            int num = (int)(Math.random()*(roster.size()));
            Unit pick = roster.get(num);
            picks.add(pick);
            //System.out.println(pick.toString());
            roster.remove(num);
        }
        return picks.toArray(new Unit[picks.size()]);
    }
    private static String muName(boolean female){
        String[] maleNames = new String[] {"Aamir", "Aaron", "Abbey", "Abbie", "Abbot", "Abbott", "Abby", "Abdel", "Abdul", "Abdulkarim", "Abdullah", "Abe", "Abel", "Abelard", "Abner", "Abraham", "Abram", "Ace", "Adair", "Adam", "Adams", "Addie", "Adger", "Aditya", "Adlai", "Adnan", "Adolf", "Adolfo", "Adolph", "Adolphe", "Adolpho", "Adolphus", "Adrian", "Adrick", "Adrien", "Agamemnon", "Aguinaldo", "Aguste", "Agustin", "Aharon", "Ahmad", "Ahmed", "Ahmet", "Ajai", "Ajay", "Al", "Alaa", "Alain", "Alan", "Alasdair", "Alastair", "Albatros", "Albert", "Alberto", "Albrecht", "Alden", "Aldis", "Aldo", "Aldric", "Aldrich", "Aldus", "Aldwin", "Alec", "Aleck", "Alejandro", "Aleks", "Aleksandrs", "Alessandro", "Alex", "Alexander", "Alexei", "Alexis", "Alf", "Alfie", "Alfonse", "Alfonso", "Alfonzo", "Alford", "Alfred", "Alfredo", "Algernon", "Ali", "Alic", "Alister", "Alix", "Allah", "Allan", "Allen", "Alley", "Allie", "Allin", "Allyn", "Alonso", "Alonzo", "Aloysius", "Alphonse", "Alphonso", "Alston", "Alton", "Alvin", "Alwin", "Amadeus", "Ambros", "Ambrose", "Ambrosi", "Ambrosio", "Ambrosius", "Amery", "Amory", "Amos", "Anatol", "Anatole", "Anatollo", "Anatoly", "Anders", "Andie", "Andonis", "Andre", "Andrea", "Andreas", "Andrej", "Andres", "Andrew", "Andrey", "Andri", "Andros", "Andrus", "Andrzej", "Andy", "Angel", "Angelico", "Angelo", "Angie", "Angus", "Ansel", "Ansell", "Anselm", "Anson", "Anthony", "Antin", "Antoine", "Anton", "Antone", "Antoni", "Antonin", "Antonino", "Antonio", "Antonius", "Antony", "Anurag", "Apollo", "Apostolos", "Aram", "Archibald", "Archibold", "Archie", "Archon", "Archy", "Arel", "Ari", "Arie", "Ariel", "Aristotle", "Arlo", "Armand", "Armando", "Armond", "Armstrong", "Arne", "Arnie", "Arnold", "Arnoldo", "Aron", "Arron", "Art", "Arther", "Arthur", "Artie", "Artur", "Arturo", "Arvie", "Arvin", "Arvind", "Arvy", "Ash", "Ashby", "Ashish", "Ashley", "Ashton", "Aub", "Aube", "Aubert", "Aubrey", "Augie", "August", "Augustin", "Augustine", "Augusto", "Augustus", "Austen", "Austin", "Ave", "Averell", "Averil", "Averill", "Avery", "Avi", "Avraham", "Avram", "Avrom", "Axel", "Aylmer", "Aziz", "Bailey", "Bailie", "Baillie", "Baily", "Baird", "Baldwin", "Bancroft", "Barbabas", "Barclay", "Bard", "Barde", "Barn", "Barnabas", "Barnabe", "Barnaby", "Barnard", "Barnebas", "Barnett", "Barney", "Barnie", "Barny", "Baron", "Barr", "Barret", "Barrett", "Barri", "Barrie", "Barris", "Barron", "Barry", "Bart", "Bartel", "Barth", "Barthel", "Bartholemy", "Bartholomeo", "Bartholomeus", "Bartholomew", "Bartie", "Bartlet", "Bartlett", "Bartolemo", "Bartolomei", "Bartolomeo", "Barton", "Barty", "Bary", "Basil", "Batholomew", "Baxter", "Bay", "Bayard", "Beale", "Bealle", "Bear", "Bearnard", "Beau", "Beaufort", "Beauregard", "Beck", "Bela", "Ben", "Benedict", "Bengt", "Benito", "Benjamen", "Benjamin", "Benji", "Benjie", "Benjy", "Benn", "Bennet", "Bennett", "Bennie", "Benny", "Benson", "Bentley", "Benton", "Beowulf", "Berchtold", "Berk", "Berke", "Berkeley", "Berkie", "Berkley", "Bernard", "Bernardo", "Bernd", "Bernhard", "Bernie", "Bert", "Bertie", "Bertram", "Bertrand", "Bharat", "Biff", "Bill", "Billie", "Billy", "Bing", "Binky", "Bishop", "Bjorn", "Bjorne", "Blaine", "Blair", "Blake", "Blare", "Blayne", "Bo", "Bob", "Bobbie", "Bobby", "Bogart", "Bogdan", "Boniface", "Boris", "Boyce", "Boyd", "Brad", "Braden", "Bradford", "Bradley", "Bradly", "Brady", "Brandon", "Brandy", "Brant", "Brendan", "Brent", "Bret", "Brett", "Brewer", "Brewster", "Brian", "Brice", "Briggs", "Brinkley", "Britt", "Brock", "Broddie", "Broddy", "Broderic", "Broderick", "Brodie", "Brody", "Bronson", "Brook", "Brooke", "Brooks", "Bruce", "Bruno", "Bryan", "Bryant", "Bryce", "Bryn", "Bryon", "Bubba", "Buck", "Bucky", "Bud", "Buddy", "Burgess", "Burke", "Burl", "Burnaby", "Burt", "Burton", "Buster", "Butch", "Butler", "Byram", "Byron", "Caesar", "Cain", "Cal", "Caldwell", "Caleb", "Calhoun", "Calvin", "Cam", "Cameron", "Cammy", "Carey", "Carl", "Carleigh", "Carlie", "Carlin", "Carlo", "Carlos", "Carlton", "Carlyle", "Carmine", "Carroll", "Carson", "Carsten", "Carter", "Cary", "Caryl", "Case", "Casey", "Caspar", "Casper", "Cass", "Cat", "Cecil", "Cesar", "Chad", "Chadd", "Chaddie", "Chaddy", "Chadwick", "Chaim", "Chalmers", "Chan", "Chance", "Chancey", "Chanderjit", "Chandler", "Chane", "Chariot", "Charles", "Charleton", "Charley", "Charlie", "Charlton", "Chas", "Chase", "Chaunce", "Chauncey", "Che", "Chelton", "Chen", "Chester", "Cheston", "Chet", "Chev", "Chevalier", "Chevy", "Chip", "Chris", "Chrissy", "Christ", "Christian", "Christiano", "Christie", "Christof", "Christofer", "Christoph", "Christophe", "Christopher", "Christorpher", "Christos", "Christy", "Chrisy", "Chuck", "Churchill", "Clair", "Claire", "Clancy", "Clarance", "Clare", "Clarence", "Clark", "Clarke", "Claude", "Claudio", "Claudius", "Claus", "Clay", "Clayborn", "Clayborne", "Claybourne", "Clayton", "Cleland", "Clem", "Clemens", "Clement", "Clemente", "Clemmie", "Cletus", "Cleveland", "Cliff", "Clifford", "Clifton", "Clint", "Clinten", "Clinton", "Clive", "Clyde", "Cob", "Cobb", "Cobbie", "Cobby", "Cody", "Colbert", "Cole", "Coleman", "Colin", "Collin", "Collins", "Conan", "Connie", "Connolly", "Connor", "Conrad", "Conroy", "Constantin", "Constantine", "Constantinos", "Conway", "Cooper", "Corbin", "Corby", "Corey", "Corky", "Cornelius", "Cornellis", "Corrie", "Cortese", "Corwin", "Cory", "Cosmo", "Costa", "Courtney", "Craig", "Crawford", "Creighton", "Cris", "Cristopher", "Curt", "Curtice", "Curtis", "Cy", "Cyril", "Cyrill", "Cyrille", "Cyrillus", "Cyrus", "Dabney", "Daffy", "Dale", "Dallas", "Dalton", "Damian", "Damien", "Damon", "Dan", "Dana", "Dane", "Dani", "Danie", "Daniel", "Dannie", "Danny", "Dante", "Darby", "Darcy", "Daren", "Darian", "Darien", "Darin", "Dario", "Darius", "Darrel", "Darrell", "Darren", "Darrick", "Darrin", "Darryl", "Darth", "Darwin", "Daryl", "Daryle", "Dave", "Davey", "David", "Davidde", "Davide", "Davidson", "Davie", "Davin", "Davis", "Davon", "Davoud", "Davy", "Dawson", "Dean", "Deane", "Del", "Delbert", "Dell", "Delmar", "Demetre", "Demetri", "Demetris", "Demetrius", "Demosthenis", "Denis", "Dennie", "Dennis", "Denny", "Derby", "Derek", "Derick", "Derk", "Derrek", "Derrick", "Derrin", "Derrol", "Derron", "Deryl", "Desmond", "Desmund", "Devin", "Devon", "Dewey", "Dewitt", "Dexter", "Dick", "Dickey", "Dickie", "Diego", "Dieter", "Dietrich", "Dillon", "Dimitri", "Dimitrios", "Dimitris", "Dimitrou", "Dimitry", "Dino", "Dion", "Dionis", "Dionysus", "Dirk", "Dmitri", "Dom", "Domenic", "Domenico", "Dominic", "Dominick", "Dominique", "Don", "Donal", "Donald", "Donn", "Donnie", "Donny", "Donovan", "Dorian", "Dory", "Doug", "Douggie", "Dougie", "Douglas", "Douglass", "Douglis", "Dov", "Doyle", "Drake", "Drew", "Dru", "Dryke", "Duane", "Dudley", "Duffie", "Duffy", "Dugan", "Duke", "Dunc", "Duncan", "Dunstan", "Durand", "Durant", "Durante", "Durward", "Dustin", "Dwain", "Dwaine", "Dwane", "Dwayne", "Dwight", "Dylan", "Dyson", "Earl", "Earle", "Easton", "Eben", "Ebeneser", "Ebenezer", "Eberhard", "Ed", "Eddie", "Eddy", "Edgar", "Edgardo", "Edie", "Edmond", "Edmund", "Edouard", "Edsel", "Eduard", "Eduardo", "Edward", "Edwin", "Efram", "Egbert", "Ehud", "Elbert", "Elden", "Eldon", "Eli", "Elias", "Elihu", "Elijah", "Eliot", "Eliott", "Elisha", "Elliot", "Elliott", "Ellis", "Ellsworth", "Ellwood", "Elmer", "Elmore", "Elnar", "Elric", "Elroy", "Elton", "Elvin", "Elvis", "Elwin", "Elwood", "Elwyn", "Ely", "Emanuel", "Emerson", "Emery", "Emil", "Emile", "Emilio", "Emmanuel", "Emmery", "Emmet", "Emmett", "Emmit", "Emmott", "Emmy", "Emory", "Ender", "Engelbart", "Engelbert", "Englebart", "Englebert", "Enoch", "Enrico", "Enrique", "Ephraim", "Ephram", "Ephrayim", "Ephrem", "Er", "Erasmus", "Erastus", "Erek", "Erhard", "Erhart", "Eric", "Erich", "Erick", "Erik", "Erin", "Erl", "Ernest", "Ernesto", "Ernie", "Ernst", "Erny", "Errol", "Ervin", "Erwin", "Esau", "Esme", "Esteban", "Ethan", "Ethelbert", "Ethelred", "Etienne", "Euclid", "Eugen", "Eugene", "Eustace", "Ev", "Evan", "Evelyn", "Everard", "Everett", "Ewan", "Ewart", "Ez", "Ezechiel", "Ezekiel", "Ezra", "Fabian", "Fabio", "Fairfax", "Farley", "Fazeel", "Federico", "Felice", "Felicio", "Felipe", "Felix", "Ferd", "Ferdie", "Ferdinand", "Ferdy", "Fergus", "Ferguson", "Ferinand", "Fernando", "Fidel", "Filbert", "Filip", "Filipe", "Filmore", "Finley", "Finn", "Fitz", "Fitzgerald", "Flem", "Fleming", "Flemming", "Fletch", "Fletcher", "Flin", "Flinn", "Flint", "Flipper", "Florian", "Floyd", "Flynn", "Fons", "Fonsie", "Fonz", "Fonzie", "Forbes", "Ford", "Forest", "Forester", "Forrest", "Forrester", "Forster", "Foster", "Fowler", "Fox", "Fran", "Francesco", "Francis", "Francisco", "Francois", "Frank", "Frankie", "Franklin", "Franklyn", "Franky", "Frans", "Franz", "Fraser", "Frazier", "Fred", "Freddie", "Freddy", "Frederic", "Frederich", "Frederick", "Frederico", "Frederik", "Fredric", "Fredrick", "Freeman", "Freemon", "Fremont", "French", "Friedric", "Friedrich", "Friedrick", "Fritz", "Fulton", "Fyodor", "Gabe", "Gabriel", "Gabriele", "Gabriell", "Gabriello", "Gail", "Gale", "Galen", "Gallagher", "Gamaliel", "Garcia", "Garcon", "Gardener", "Gardiner", "Gardner", "Garey", "Garfield", "Garfinkel", "Garold", "Garp", "Garret", "Garrett", "Garrot", "Garrott", "Garry", "Garth", "Garv", "Garvey", "Garvin", "Garvy", "Garwin", "Garwood", "Gary", "Gaspar", "Gasper", "Gaston", "Gav", "Gaven", "Gavin", "Gavriel", "Gay", "Gayle", "Gearard", "Gene", "Geo", "Geof", "Geoff", "Geoffrey", "Geoffry", "Georg", "George", "Georges", "Georgia", "Georgie", "Georgy", "Gerald", "Geraldo", "Gerard", "Gere", "Gerhard", "Gerhardt", "Geri", "Germaine", "Gerold", "Gerome", "Gerrard", "Gerri", "Gerrit", "Gerry", "Gershom", "Gershon", "Giacomo", "Gian", "Giancarlo", "Giavani", "Gibb", "Gideon", "Giff", "Giffard", "Giffer", "Giffie", "Gifford", "Giffy", "Gil", "Gilbert", "Gilberto", "Gilburt", "Giles", "Gill", "Gilles", "Ginger", "Gino", "Giordano", "Giorgi", "Giorgio", "Giovanne", "Giovanni", "Giraldo", "Giraud", "Giuseppe", "Glen", "Glenn", "Glynn", "Godard", "Godart", "Goddard", "Goddart", "Godfree", "Godfrey", "Godfry", "Godwin", "Gomer", "Gonzales", "Gonzalo", "Goober", "Goose", "Gordan", "Gordie", "Gordon", "Grace", "Grady", "Graehme", "Graeme", "Graham", "Graig", "Grant", "Granville", "Greg", "Gregg", "Greggory", "Gregor", "Gregorio", "Gregory", "Gretchen", "Griff", "Griffin", "Griffith", "Griswold", "Grove", "Grover", "Guido", "Guillaume", "Guillermo", "Gunner", "Gunter", "Gunther", "Gus", "Gustaf", "Gustav", "Gustave", "Gustavo", "Gustavus", "Guthrey", "Guthrie", "Guthry", "Guy", "Hadleigh", "Hadley", "Hadrian", "Hagan", "Hagen", "Hailey", "Hakeem", "Hakim", "Hal", "Hale", "Haleigh", "Haley", "Hall", "Hallam", "Halvard", "Ham", "Hamel", "Hamid", "Hamil", "Hamilton", "Hamish", "Hamlen", "Hamlet", "Hamlin", "Hammad", "Hamnet", "Han", "Hanan", "Hanford", "Hank", "Hannibal", "Hans", "Hans-Peter", "Hansel", "Hanson", "Harald", "Harcourt", "Hari", "Harlan", "Harland", "Harley", "Harlin", "Harman", "Harmon", "Harold", "Harris", "Harrison", "Harrold", "Harry", "Hart", "Hartley", "Hartwell", "Harv", "Harvard", "Harvey", "Harvie", "Harwell", "Hasheem", "Hashim", "Haskel", "Haskell", "Hassan", "Hastings", "Hasty", "Haven", "Hayden", "Haydon", "Hayes", "Hayward", "Haywood", "Hazel", "Heath", "Heathcliff", "Hebert", "Hector", "Heinrich", "Heinz", "Helmuth", "Henderson", "Hendrick", "Hendrik", "Henri", "Henrie", "Henrik", "Henrique", "Henry", "Herb", "Herbert", "Herbie", "Herby", "Hercule", "Hercules", "Herculie", "Herman", "Hermann", "Hermon", "Hermy", "Hernando", "Herold", "Herrick", "Herrmann", "Hersch", "Herschel", "Hersh", "Hershel", "Herve", "Hervey", "Hew", "Hewe", "Hewet", "Hewett", "Hewie", "Hewitt", "Heywood", "Hezekiah", "Higgins", "Hilary", "Hilbert", "Hill", "Hillard", "Hillary", "Hillel", "Hillery", "Hilliard", "Hilton", "Hiralal", "Hiram", "Hiro", "Hirsch", "Hobart", "Hodge", "Hogan", "Hollis", "Holly", "Homer", "Horace", "Horacio", "Horatio", "Horatius", "Horst", "Howard", "Howie", "Hoyt", "Hubert", "Hudson", "Huey", "Hugh", "Hugo", "Humbert", "Humphrey", "Hunt", "Hunter", "Huntington", "Huntlee", "Huntley", "Hurley", "Husain", "Husein", "Hussein", "Hy", "Hyatt", "Hyman", "Hymie", "Iago", "Iain", "Ian", "Ibrahim", "Ichabod", "Iggie", "Iggy", "Ignace", "Ignacio", "Ignacius", "Ignatius", "Ignaz", "Ignazio", "Igor", "Ike", "Ikey", "Immanuel", "Ingamar", "Ingelbert", "Ingemar", "Inglebert", "Ingmar", "Ingram", "Inigo", "Ira", "Irvin", "Irvine", "Irving", "Irwin", "Isa", "Isaac", "Isaak", "Isador", "Isadore", "Isaiah", "Ishmael", "Isidore", "Ismail", "Israel", "Istvan", "Ivan", "Ivor", "Izaak", "Izak", "Izzy", "Jabez", "Jack", "Jackie", "Jackson", "Jacob", "Jacques", "Jae", "Jaime", "Jake", "Jakob", "James", "Jameson", "Jamey", "Jamie", "Jan", "Janos", "Janus", "Jared", "Jarrett", "Jarvis", "Jason", "Jasper", "Javier", "Jay", "Jean", "Jean-Christophe", "Jean-Francois", "Jean-Lou", "Jean-Luc", "Jean-Marc", "Jean-Paul", "Jean-Pierre", "Jeb", "Jed", "Jedediah", "Jef", "Jeff", "Jefferey", "Jefferson", "Jeffery", "Jeffie", "Jeffrey", "Jeffry", "Jefry", "Jehu", "Jennings", "Jens", "Jephthah", "Jerald", "Jeramie", "Jere", "Jereme", "Jeremiah", "Jeremias", "Jeremie", "Jeremy", "Jermain", "Jermaine", "Jermayne", "Jerold", "Jerome", "Jeromy", "Jerri", "Jerrie", "Jerrold", "Jerrome", "Jerry", "Jervis", "Jerzy", "Jess", "Jesse", "Jessee", "Jessey", "Jessie", "Jesus", "Jeth", "Jethro", "Jim", "Jimbo", "Jimmie", "Jimmy", "Jo", "Joab", "Joachim", "Joao", "Joaquin", "Job", "Jock", "Jodi", "Jodie", "Jody", "Joe", "Joel", "Joey", "Johan", "Johann", "Johannes", "John", "John-David", "John-Patrick", "Johnathan", "Johnathon", "Johnnie", "Johnny", "Johny", "Jon", "Jonah", "Jonas", "Jonathan", "Jonathon", "Jonny", "Jordan", "Jordon", "Jordy", "Jorge", "Jory", "Jose", "Josef", "Joseph", "Josephus", "Josh", "Joshua", "Joshuah", "Josiah", "Jotham", "Juan", "Juanita", "Jud", "Judah", "Judas", "Judd", "Jude", "Judith", "Judson", "Judy", "Juergen", "Jule", "Jules", "Julian", "Julie", "Julio", "Julius", "Justin", "Justis", "Kaiser", "Kaleb", "Kalil", "Kalle", "Kalman", "Kalvin", "Kam", "Kane", "Kareem", "Karel", "Karim", "Karl", "Karsten", "Kaspar", "Keefe", "Keenan", "Keene", "Keil", "Keith", "Kellen", "Kelley", "Kelly", "Kelsey", "Kelvin", "Kelwin", "Ken", "Kendal", "Kendall", "Kendrick", "Kenn", "Kennedy", "Kenneth", "Kenny", "Kent", "Kenton", "Kenyon", "Kermie", "Kermit", "Kerry", "Kevan", "Kevin", "Kim", "Kimball", "Kimmo", "Kin", "Kincaid", "King", "Kingsley", "Kingsly", "Kingston", "Kip", "Kirby", "Kirk", "Kit", "Klaus", "Klee", "Knox", "Konrad", "Konstantin", "Kory", "Kostas", "Kraig", "Kris", "Krishna", "Kristian", "Kristopher", "Kristos", "Kurt", "Kurtis", "Kyle", "Laird", "Lamar", "Lambert", "Lamont", "Lance", "Lancelot", "Lane", "Langston", "Lanny", "Larry", "Lars", "Laurance", "Lauren", "Laurence", "Laurens", "Laurent", "Laurie", "Lawerence", "Lawrence", "Lawson", "Lawton", "Lay", "Layton", "Lazar", "Lazare", "Lazaro", "Lazarus", "Lazlo", "Lee", "Lefty", "Leif", "Leigh", "Leighton", "Leland", "Lem", "Lemar", "Lemmie", "Lemmy", "Lemuel", "Len", "Lenard", "Lennie", "Lenny", "Leo", "Leon", "Leonard", "Leonardo", "Leonerd", "Leonhard", "Leonid", "Leonidas", "Leopold", "Leroy", "Les", "Lesley", "Leslie", "Lester", "Lev", "Levi", "Levin", "Levon", "Levy", "Lew", "Lewis", "Lex", "Liam", "Lin", "Lincoln", "Lind", "Lindsay", "Lindsey", "Lindy", "Linoel", "Linus", "Lion", "Lionel", "Lionello", "Llewellyn", "Lloyd", "Locke", "Lockwood", "Logan", "Lon", "Lonnie", "Lonny", "Loren", "Lorenzo", "Lorne", "Lorrie", "Lothar", "Lou", "Louie", "Louis", "Lovell", "Lowell", "Lucas", "Luce", "Lucian", "Luciano", "Lucien", "Lucio", "Lucius", "Ludvig", "Ludwig", "Luigi", "Luis", "Lukas", "Luke", "Luther", "Lyle", "Lyn", "Lyndon", "Lynn", "Mac", "Mace", "Mack", "Mackenzie", "Maddie", "Maddy", "Madison", "Magnum", "Magnus", "Mahesh", "Mahmoud", "Mahmud", "Maison", "Major", "Malcolm", "Manfred", "Manish", "Manny", "Manuel", "Marc", "Marcel", "Marcello", "Marcellus", "Marcelo", "Marchall", "Marcio", "Marco", "Marcos", "Marcus", "Marietta", "Marilu", "Mario", "Marion", "Marius", "Mark", "Marko", "Markos", "Markus", "Marlin", "Marlo", "Marlon", "Marlow", "Marlowe", "Marmaduke", "Marsh", "Marshal", "Marshall", "Mart", "Martainn", "Marten", "Martie", "Martin", "Martino", "Marty", "Martyn", "Marv", "Marve", "Marven", "Marvin", "Marwin", "Mason", "Mateo", "Mathew", "Mathias", "Matias", "Matt", "Matteo", "Matthaeus", "Mattheus", "Matthew", "Matthias", "Matthieu", "Matthiew", "Matthus", "Mattias", "Mattie", "Matty", "Maurice", "Mauricio", "Maurie", "Maurise", "Maurits", "Mauritz", "Maury", "Max", "Maxfield", "Maxie", "Maxim", "Maximilian", "Maximilien", "Maxwell", "Mayer", "Maynard", "Maynord", "Mayor", "Mead", "Meade", "Meier", "Meir", "Mel", "Melvin", "Melvyn", "Menard", "Mendel", "Mendie", "Meredeth", "Meredith", "Merell", "Merill", "Merle", "Merlin", "Merrel", "Merrick", "Merril", "Merrill", "Merry", "Merv", "Mervin", "Merwin", "Meryl", "Meyer", "Mic", "Micah", "Michael", "Michail", "Michal", "Michale", "Micheal", "Micheil", "Michel", "Michele", "Mick", "Mickey", "Mickie", "Micky", "Miguel", "Mika", "Mikael", "Mike", "Mikel", "Mikey", "Mikhail", "Miles", "Millicent", "Milo", "Milt", "Milton", "Mischa", "Mitch", "Mitchael", "Mitchel", "Mitchell", "Moe", "Mohamad", "Mohamed", "Mohammad", "Mohammed", "Mohan", "Moise", "Moises", "Moishe", "Monroe", "Montague", "Monte", "Montgomery", "Monty", "Moore", "Mordecai", "Morgan", "Morlee", "Morley", "Morly", "Morrie", "Morris", "Morry", "Morse", "Mort", "Morten", "Mortie", "Mortimer", "Morton", "Morty", "Mose", "Moses", "Moshe", "Moss", "Muffin", "Mugsy", "Muhammad", "Munmro", "Munroe", "Murdoch", "Murdock", "Murphy", "Murray", "Mustafa", "Myke", "Myles", "Mylo", "Myron", "Nahum", "Napoleon", "Nat", "Natale", "Nate", "Nathan", "Nathanael", "Nathanial", "Nathaniel", "Nathanil", "Neal", "Neale", "Neall", "Nealon", "Nealson", "Nealy", "Ned", "Neddie", "Neddy", "Neel", "Neil", "Nels", "Nelsen", "Nelson", "Nero", "Neron", "Nester", "Nestor", "Nev", "Nevil", "Nevile", "Neville", "Nevin", "Nevins", "Newton", "Niall", "Niccolo", "Nicholas", "Nichole", "Nichols", "Nick", "Nickey", "Nickie", "Nickolas", "Nicky", "Nico", "Nicolas", "Niels", "Nigel", "Niki", "Nikita", "Nikki", "Nikolai", "Nikos", "Niles", "Nils", "Nilson", "Niven", "Noach", "Noah", "Noam", "Noble", "Noe", "Noel", "Nolan", "Noland", "Norbert", "Norm", "Norman", "Normand", "Normie", "Norris", "Northrop", "Northrup", "Norton", "Norwood", "Nunzio", "Obadiah", "Obadias", "Oberon", "Obie", "Octavius", "Odell", "Odie", "Odin", "Odysseus", "Olaf", "Olag", "Ole", "Oleg", "Olin", "Oliver", "Olivier", "Olle", "Ollie", "Omar", "Oral", "Oran", "Orazio", "Orbadiah", "Oren", "Orin", "Orion", "Orlando", "Orren", "Orrin", "Orson", "Orton", "Orville", "Osbert", "Osborn", "Osborne", "Osbourn", "Osbourne", "Oscar", "Osgood", "Osmond", "Osmund", "Ossie", "Oswald", "Oswell", "Otes", "Othello", "Otho", "Otis", "Otto", "Owen", "Ozzie", "Ozzy", "Pablo", "Pace", "Paco", "Paddie", "Paddy", "Padraig", "Page", "Paige", "Pail", "Palmer", "Paolo", "Park", "Parke", "Parker", "Parnell", "Parrnell", "Parry", "Parsifal", "Partha", "Pascal", "Pascale", "Pasquale", "Pat", "Pate", "Patel", "Paten", "Patin", "Paton", "Patric", "Patrice", "Patricio", "Patrick", "Patrik", "Patsy", "Pattie", "Patty", "Paul", "Paulo", "Pavel", "Pearce", "Pedro", "Peirce", "Pembroke", "Pen", "Penn", "Pennie", "Penny", "Penrod", "Pepe", "Pepillo", "Pepito", "Perceval", "Percival", "Percy", "Perry", "Pete", "Peter", "Petey", "Petr", "Peyter", "Peyton", "Phil", "Philbert", "Philip", "Phillip", "Phillipe", "Phillipp", "Phineas", "Phip", "Pierce", "Pierre", "Pierson", "Piet", "Pieter", "Pietro", "Piggy", "Pincas", "Pinchas", "Pincus", "Piotr", "Pip", "Plato", "Pooh", "Porter", "Poul", "Powell", "Praneetf", "Prasad", "Prasun", "Prent", "Prentice", "Prentiss", "Prescott", "Preston", "Price", "Prince", "Pryce", "Puff", "Purcell", "Putnam", "Pyotr", "Quent", "Quentin", "Quiggly", "Quigly", "Quigman", "Quill", "Quillan", "Quincey", "Quincy", "Quinlan", "Quinn", "Quint", "Quintin", "Quinton", "Quintus", "Rab", "Rabbi", "Rabi", "Rad", "Radcliffe", "Rafael", "Rafe", "Ragnar", "Raimund", "Rainer", "Raj", "Rajeev", "Raleigh", "Ralf", "Ralph", "Ram", "Ramesh", "Ramon", "Ramsay", "Ramsey", "Rand", "Randal", "Randall", "Randell", "Randi", "Randie", "Randolf", "Randolph", "Randy", "Ransell", "Ransom", "Raoul", "Raphael", "Raul", "Ravi", "Ravil", "Rawley", "Ray", "Raymond", "Raymund", "Raymundo", "Raynard", "Rayner", "Raynor", "Reagan", "Red", "Redford", "Redmond", "Reece", "Reed", "Rees", "Reese", "Reg", "Regan", "Regen", "Reggie", "Reggis", "Reggy", "Reginald", "Reginauld", "Reid", "Reilly", "Reinhard", "Reinhold", "Rem", "Remington", "Remus", "Renado", "Renaldo", "Renard", "Renato", "Renaud", "Renault", "Rene", "Reube", "Reuben", "Reuven", "Rex", "Rey", "Reynard", "Reynold", "Reynolds", "Reza", "Rhett", "Ric", "Ricard", "Ricardo", "Riccardo", "Rice", "Rich", "Richard", "Richardo", "Richie", "Richmond", "Richy", "Rick", "Rickard", "Rickey", "Ricki", "Rickie", "Ricky", "Rik", "Rikki", "Riley", "Rinaldo", "Ripley", "Ritch", "Ritchie", "Roarke", "Rob", "Robb", "Robbert", "Robbie", "Robert", "Roberto", "Robin", "Robinson", "Rochester", "Rock", "Rockwell", "Rocky", "Rod", "Rodd", "Roddie", "Roddy", "Roderic", "Roderich", "Roderick", "Roderigo", "Rodge", "Rodger", "Rodney", "Rodolfo", "Rodolph", "Rodolphe", "Rodrick", "Rodrigo", "Rodrique", "Rog", "Roger", "Rogers", "Roice", "Roland", "Rolando", "Rolf", "Rolfe", "Rolland", "Rollin", "Rollins", "Rollo", "Rolph", "Romain", "Roman", "Romeo", "Ron", "Ronald", "Ronen", "Roni", "Ronnie", "Ronny", "Roosevelt", "Rory", "Roscoe", "Ross", "Roth", "Rourke", "Rowland", "Roy", "Royal", "Royce", "Rube", "Ruben", "Rubin", "Ruby", "Rudd", "Ruddie", "Ruddy", "Rudie", "Rudiger", "Rudolf", "Rudolfo", "Rudolph", "Rudy", "Rudyard", "Rufe", "Rufus", "Rupert", "Ruperto", "Russ", "Russel", "Russell", "Rustie", "Rustin", "Rusty", "Rutger", "Rutherford", "Rutledge", "Rutter", "Ryan", "Sal", "Salem", "Salim", "Salman", "Salmon", "Salomo", "Salomon", "Salomone", "Salvador", "Salvatore", "Salvidor", "Sam", "Sammie", "Sammy", "Sampson", "Samson", "Samuel", "Samuele", "Sancho", "Sander", "Sanders", "Sanderson", "Sandor", "Sandro", "Sandy", "Sanford", "Sanson", "Sansone", "Sarge", "Sargent", "Sascha", "Sasha", "Saul", "Sauncho", "Saunder", "Saunders", "Saunderson", "Saundra", "Saw", "Sawyer", "Sawyere", "Sax", "Saxe", "Saxon", "Say", "Sayer", "Sayers", "Sayre", "Sayres", "Scarface", "Schroeder", "Schuyler", "Scot", "Scott", "Scotti", "Scottie", "Scotty", "Seamus", "Sean", "Sebastian", "Sebastiano", "Sebastien", "See", "Selby", "Selig", "Serge", "Sergeant", "Sergei", "Sergent", "Sergio", "Seth", "Seymour", "Shadow", "Shaine", "Shalom", "Shamus", "Shanan", "Shane", "Shannan", "Shannon", "Shaughn", "Shaun", "Shaw", "Shawn", "Shay", "Shayne", "Shea", "Sheff", "Sheffie", "Sheffield", "Sheffy", "Shelby", "Shelden", "Sheldon", "Shell", "Shelley", "Shelton", "Shem", "Shep", "Shepard", "Shepherd", "Sheppard", "Shepperd", "Sheridan", "Sherlock", "Sherlocke", "Sherman", "Sherwin", "Sherwood", "Sherwynd", "Shimon", "Shlomo", "Sholom", "Shorty", "Shurlock", "Shurlocke", "Shurwood", "Si", "Sibyl", "Sid", "Siddhartha", "Sidnee", "Sidney", "Siegfried", "Siffre", "Sig", "Sigfrid", "Sigfried", "Sigmund", "Silas", "Silvain", "Silvan", "Silvano", "Silvanus", "Silvester", "Silvio", "Sim", "Simeon", "Simmonds", "Simon", "Simone", "Sinclair", "Sinclare", "Sivert", "Siward", "Skell", "Skelly", "Skip", "Skipp", "Skipper", "Skippie", "Skippy", "Skipton", "Sky", "Skye", "Skylar", "Skyler", "Slade", "Slim", "Sloan", "Sloane", "Sly", "Smith", "Smitty", "Socrates", "Sol", "Sollie", "Solly", "Solomon", "Somerset", "Son", "Sonnie", "Sonny", "Sparky", "Spence", "Spencer", "Spense", "Spenser", "Spike", "Spiro", "Spiros", "Spud", "Srinivas", "Stacy", "Staffard", "Stafford", "Staford", "Stan", "Standford", "Stanfield", "Stanford", "Stanislaw", "Stanleigh", "Stanley", "Stanly", "Stanton", "Stanwood", "Stavros", "Stearn", "Stearne", "Stefan", "Stefano", "Steffen", "Stephan", "Stephanus", "Stephen", "Sterling", "Stern", "Sterne", "Steve", "Steven", "Stevie", "Stevy", "Stew", "Steward", "Stewart", "Stig", "Stillman", "Stillmann", "Sting", "Stinky", "Stirling", "Stu", "Stuart", "Sturgis", "Sullivan", "Sully", "Sumner", "Sunny", "Sutherland", "Sutton", "Sven", "Swen", "Syd", "Sydney", "Sylvan", "Sylvester", "Tab", "Tabb", "Tabbie", "Tabby", "Taber", "Tabor", "Tad", "Tadd", "Taddeo", "Taddeus", "Tadeas", "Tailor", "Tait", "Taite", "Talbert", "Talbot", "Tallie", "Tally", "Tam", "Tamas", "Tammie", "Tammy", "Tan", "Tann", "Tanner", "Tanney", "Tannie", "Tanny", "Tarrance", "Tarrant", "Tarzan", "Tate", "Taylor", "Teador", "Ted", "Tedd", "Teddie", "Teddy", "Tedie", "Tedman", "Tedmund", "Tedrick", "Temp", "Temple", "Templeton", "Teodoor", "Teodor", "Teodorico", "Teodoro", "Terence", "Terencio", "Terrance", "Terrel", "Terrell", "Terrence", "Terri", "Terrill", "Terry", "Thacher", "Thad", "Thaddeus", "Thaddius", "Thaddus", "Thadeus", "Thain", "Thaine", "Thane", "Tharen", "Thatch", "Thatcher", "Thaxter", "Thayne", "Thebault", "Thedric", "Thedrick", "Theo", "Theobald", "Theodor", "Theodore", "Theodoric", "Theophyllus", "Thibaud", "Thibaut", "Thom", "Thomas", "Thor", "Thorn", "Thorndike", "Thornie", "Thornton", "Thorny", "Thorpe", "Thorstein", "Thorsten", "Thorvald", "Thurstan", "Thurston", "Tibold", "Tiebold", "Tiebout", "Tiler", "Tim", "Timmie", "Timmy", "Timothee", "Timotheus", "Timothy", "Tirrell", "Tito", "Titos", "Titus", "Tobe", "Tobiah", "Tobias", "Tobie", "Tobin", "Tobit", "Toby", "Tod", "Todd", "Toddie", "Toddy", "Tom", "Tomas", "Tome", "Tomkin", "Tomlin", "Tommie", "Tommy", "Tonnie", "Tony", "Tore", "Torey", "Torin", "Torr", "Torrance", "Torre", "Torrence", "Torrey", "Torrin", "Torry", "Town", "Towney", "Townie", "Townsend", "Towny", "Trace", "Tracey", "Tracie", "Tracy", "Traver", "Travers", "Travis", "Tray", "Tre", "Tremain", "Tremaine", "Tremayne", "Trent", "Trenton", "Trev", "Trevar", "Trever", "Trevor", "Trey", "Trip", "Tristan", "Troy", "Truman", "Tuck", "Tucker", "Tuckie", "Tucky", "Tudor", "Tull", "Tulley", "Tully", "Turner", "Ty", "Tybalt", "Tye", "Tyler", "Tymon", "Tymothy", "Tynan", "Tyrone", "Tyrus", "Tyson", "Udale", "Udall", "Udell", "Ugo", "Ulberto", "Uli", "Ulick", "Ulises", "Ulric", "Ulrich", "Ulrick", "Ulysses", "Umberto", "Upton", "Urbain", "Urban", "Urbano", "Urbanus", "Uri", "Uriah", "Uriel", "Urson", "Vachel", "Vaclav", "Vail", "Val", "Valdemar", "Vale", "Valentin", "Valentine", "Van", "Vance", "Vasili", "Vasilis", "Vasily", "Vassili", "Vassily", "Vaughan", "Vaughn", "Venkat", "Verge", "Vergil", "Vern", "Verne", "Vernen", "Verney", "Vernon", "Vernor", "Vic", "Vick", "Victor", "Vijay", "Vilhelm", "Vin", "Vince", "Vincent", "Vincents", "Vinnie", "Vinny", "Vinod", "Virge", "Virgie", "Virgil", "Virgilio", "Vite", "Vito", "Vlad", "Vladamir", "Vladimir", "Voltaire", "Von", "Wade", "Wadsworth", "Wain", "Waine", "Wainwright", "Wait", "Waite", "Waiter", "Wake", "Wakefield", "Wald", "Waldemar", "Walden", "Waldo", "Waldon", "Waleed", "Walker", "Wallace", "Wallache", "Wallas", "Wallie", "Wallis", "Wally", "Walsh", "Walt", "Walter", "Walther", "Walton", "Wang", "Ward", "Warde", "Warden", "Ware", "Waring", "Warner", "Warren", "Wash", "Washington", "Wat", "Waverley", "Waverly", "Way", "Waylan", "Wayland", "Waylen", "Waylin", "Waylon", "Wayne", "Web", "Webb", "Weber", "Webster", "Weidar", "Weider", "Welbie", "Welby", "Welch", "Wells", "Welsh", "Wendall", "Wendel", "Wendell", "Werner", "Wes", "Wesley", "Weslie", "West", "Westbrook", "Westbrooke", "Westleigh", "Westley", "Weston", "Weylin", "Wheeler", "Whit", "Whitaker", "Whitby", "Whitman", "Whitney", "Whittaker", "Wiatt", "Wilber", "Wilbert", "Wilbur", "Wilburn", "Wilburt", "Wilden", "Wildon", "Wilek", "Wiley", "Wilfred", "Wilfrid", "Wilhelm", "Will", "Willard", "Willdon", "Willem", "Willey", "Willi", "William", "Willie", "Willis", "Willmott", "Willy", "Wilmar", "Wilmer", "Wilson", "Wilt", "Wilton", "Win", "Windham", "Winfield", "Winford", "Winfred", "Winifield", "Winn", "Winnie", "Winny", "Winslow", "Winston", "Winthrop", "Winton", "Wit", "Witold", "Wittie", "Witty", "Wojciech", "Wolf", "Wolfgang", "Wolfie", "Wolfram", "Wolfy", "Woochang", "Wood", "Woodie", "Woodman", "Woodrow", "Woody", "Worden", "Worth", "Worthington", "Worthy", "Wright", "Wyatan", "Wyatt", "Wye", "Wylie", "Wyn", "Wyndham", "Wynn", "Wynton", "Xavier", "Xenos", "Xerxes", "Xever", "Ximenes", "Ximenez", "Xymenes", "Yaakov", "Yacov", "Yale", "Yanaton", "Yance", "Yancey", "Yancy", "Yank", "Yankee", "Yard", "Yardley", "Yehudi", "Yigal", "Yule", "Yuri", "Yves", "Zach", "Zacharia", "Zachariah", "Zacharias", "Zacharie", "Zachary", "Zacherie", "Zachery", "Zack", "Zackariah", "Zak", "Zalman", "Zane", "Zared", "Zary", "Zeb", "Zebadiah", "Zebedee", "Zebulen", "Zebulon", "Zechariah", "Zed", "Zedekiah", "Zeke", "Zelig", "Zerk", "Zeus", "Zippy", "Zollie", "Zolly", "Zorro", "Rahul", "Shumeet", "Vibhu"};
        String[] femaleNames = new String[] {"Abagael", "Abagail", "Abbe", "Abbey", "Abbi", "Abbie", "Abby", "Abigael", "Abigail", "Abigale", "Abra", "Acacia", "Ada", "Adah", "Adaline", "Adara", "Addie", "Addis", "Adel", "Adela", "Adelaide", "Adele", "Adelice", "Adelina", "Adelind", "Adeline", "Adella", "Adelle", "Adena", "Adey", "Adi", "Adiana", "Adina", "Adora", "Adore", "Adoree", "Adorne", "Adrea", "Adria", "Adriaens", "Adrian", "Adriana", "Adriane", "Adrianna", "Adrianne", "Adrien", "Adriena", "Adrienne", "Aeriel", "Aeriela", "Aeriell", "Ag", "Agace", "Agata", "Agatha", "Agathe", "Aggi", "Aggie", "Aggy", "Agna", "Agnella", "Agnes", "Agnese", "Agnesse", "Agneta", "Agnola", "Agretha", "Aida", "Aidan", "Aigneis", "Aila", "Aile", "Ailee", "Aileen", "Ailene", "Ailey", "Aili", "Ailina", "Ailyn", "Aime", "Aimee", "Aimil", "Aina", "Aindrea", "Ainslee", "Ainsley", "Ainslie", "Ajay", "Alaine", "Alameda", "Alana", "Alanah", "Alane", "Alanna", "Alayne", "Alberta", "Albertina", "Albertine", "Albina", "Alecia", "Aleda", "Aleece", "Aleecia", "Aleen", "Alejandra", "Alejandrina", "Alena", "Alene", "Alessandra", "Aleta", "Alethea", "Alex", "Alexa", "Alexandra", "Alexandrina", "Alexi", "Alexia", "Alexina", "Alexine", "Alexis", "Alfie", "Alfreda", "Ali", "Alia", "Alica", "Alice", "Alicea", "Alicia", "Alida", "Alidia", "Alina", "Aline", "Alis", "Alisa", "Alisha", "Alison", "Alissa", "Alisun", "Alix", "Aliza", "Alla", "Alleen", "Allegra", "Allene", "Alli", "Allianora", "Allie", "Allina", "Allis", "Allison", "Allissa", "Allsun", "Ally", "Allyce", "Allyn", "Allys", "Allyson", "Alma", "Almeda", "Almeria", "Almeta", "Almira", "Almire", "Aloise", "Aloisia", "Aloysia", "Alpa", "Alta", "Althea", "Alvera", "Alvina", "Alvinia", "Alvira", "Alyce", "Alyda", "Alys", "Alysa", "Alyse", "Alysia", "Alyson", "Alyss", "Alyssa", "Amabel", "Amabelle", "Amalea", "Amalee", "Amaleta", "Amalia", "Amalie", "Amalita", "Amalle", "Amanda", "Amandi", "Amandie", "Amandy", "Amara", "Amargo", "Amata", "Amber", "Amberly", "Ambrosia", "Ambur", "Ame", "Amelia", "Amelie", "Amelina", "Ameline", "Amelita", "Ami", "Amie", "Amity", "Ammamaria", "Amy", "Ana", "Anabel", "Anabella", "Anabelle", "Anais", "Analiese", "Analise", "Anallese", "Anallise", "Anastasia", "Anastasie", "Anastassia", "Anatola", "Andee", "Andi", "Andie", "Andra", "Andrea", "Andreana", "Andree", "Andrei", "Andria", "Andriana", "Andriette", "Andromache", "Andromeda", "Andy", "Anestassia", "Anet", "Anett", "Anetta", "Anette", "Ange", "Angel", "Angela", "Angele", "Angelia", "Angelica", "Angelika", "Angelina", "Angeline", "Angelique", "Angelita", "Angelle", "Angie", "Angil", "Angy", "Ania", "Anica", "Anissa", "Anita", "Anitra", "Anja", "Anjanette", "Anjela", "Ann", "Ann-Mari", "Ann-Marie", "Anna", "Anna-Diana", "Anna-Diane", "Anna-Maria", "Annabal", "Annabel", "Annabela", "Annabell", "Annabella", "Annabelle", "Annadiana", "Annadiane", "Annalee", "Annalena", "Annaliese", "Annalisa", "Annalise", "Annalyse", "Annamari", "Annamaria", "Annamarie", "Anne", "Anne-Corinne", "Anne-Mar", "Anne-Marie", "Annecorinne", "Anneliese", "Annelise", "Annemarie", "Annetta", "Annette", "Anni", "Annice", "Annie", "Annissa", "Annmaria", "Annmarie", "Annnora", "Annora", "Anny", "Anselma", "Ansley", "Anstice", "Anthe", "Anthea", "Anthia", "Antoinette", "Antonella", "Antonetta", "Antonia", "Antonie", "Antonietta", "Antonina", "Anya", "Aphrodite", "Appolonia", "April", "Aprilette", "Ara", "Arabel", "Arabela", "Arabele", "Arabella", "Arabelle", "Arda", "Ardath", "Ardeen", "Ardelia", "Ardelis", "Ardella", "Ardelle", "Arden", "Ardene", "Ardenia", "Ardine", "Ardis", "Ardith", "Ardra", "Ardyce", "Ardys", "Ardyth", "Aretha", "Ariadne", "Ariana", "Arianne", "Aridatha", "Ariel", "Ariela", "Ariella", "Arielle", "Arlana", "Arlee", "Arleen", "Arlen", "Arlena", "Arlene", "Arleta", "Arlette", "Arleyne", "Arlie", "Arliene", "Arlina", "Arlinda", "Arline", "Arly", "Arlyn", "Arlyne", "Aryn", "Ashely", "Ashlee", "Ashleigh", "Ashlen", "Ashley", "Ashli", "Ashlie", "Ashly", "Asia", "Astra", "Astrid", "Astrix", "Atalanta", "Athena", "Athene", "Atlanta", "Atlante", "Auberta", "Aubine", "Aubree", "Aubrette", "Aubrey", "Aubrie", "Aubry", "Audi", "Audie", "Audra", "Audre", "Audrey", "Audrie", "Audry", "Audrye", "Audy", "Augusta", "Auguste", "Augustina", "Augustine", "Aura", "Aurea", "Aurel", "Aurelea", "Aurelia", "Aurelie", "Auria", "Aurie", "Aurilia", "Aurlie", "Auroora", "Aurora", "Aurore", "Austin", "Austina", "Austine", "Ava", "Aveline", "Averil", "Averyl", "Avie", "Avis", "Aviva", "Avivah", "Avril", "Avrit", "Ayn", "Bab", "Babara", "Babette", "Babita", "Babs", "Bambi", "Bambie", "Bamby", "Barb", "Barbabra", "Barbara", "Barbara-Anne", "Barbaraanne", "Barbe", "Barbee", "Barbette", "Barbey", "Barbi", "Barbie", "Barbra", "Barby", "Bari", "Barrie", "Barry", "Basia", "Bathsheba", "Batsheva", "Bea", "Beatrice", "Beatrisa", "Beatrix", "Beatriz", "Beau", "Bebe", "Becca", "Becka", "Becki", "Beckie", "Becky", "Bee", "Beilul", "Beitris", "Bekki", "Bel", "Belia", "Belicia", "Belinda", "Belita", "Bell", "Bella", "Bellamy", "Bellanca", "Belle", "Bellina", "Belva", "Belvia", "Bendite", "Benedetta", "Benedicta", "Benedikta", "Benetta", "Benita", "Benni", "Bennie", "Benny", "Benoite", "Berenice", "Beret", "Berget", "Berna", "Bernadene", "Bernadette", "Bernadina", "Bernadine", "Bernardina", "Bernardine", "Bernelle", "Bernete", "Bernetta", "Bernette", "Berni", "Bernice", "Bernie", "Bernita", "Berny", "Berri", "Berrie", "Berry", "Bert", "Berta", "Berte", "Bertha", "Berthe", "Berti", "Bertie", "Bertina", "Bertine", "Berty", "Beryl", "Beryle", "Bess", "Bessie", "Bessy", "Beth", "Bethanne", "Bethany", "Bethena", "Bethina", "Betsey", "Betsy", "Betta", "Bette", "Bette-Ann", "Betteann", "Betteanne", "Betti", "Bettie", "Bettina", "Bettine", "Betty", "Bettye", "Beulah", "Bev", "Beverie", "Beverlee", "Beverlie", "Beverly", "Bevvy", "Bianca", "Bianka", "Biddy", "Bidget", "Bill", "Billi", "Billie", "Billy", "Binni", "Binnie", "Binny", "Bird", "Birdie", "Birgit", "Birgitta", "Blair", "Blaire", "Blake", "Blakelee", "Blakeley", "Blanca", "Blanch", "Blancha", "Blanche", "Blinni", "Blinnie", "Blinny", "Bliss", "Blisse", "Blithe", "Blondell", "Blondelle", "Blondie", "Blondy", "Blythe", "Bo", "Bobbette", "Bobbi", "Bobbie", "Bobby", "Bobette", "Bobina", "Bobine", "Bobinette", "Bonita", "Bonnee", "Bonni", "Bonnie", "Bonny", "Brana", "Brandais", "Brande", "Brandea", "Brandi", "Brandice", "Brandie", "Brandise", "Brandy", "Brea", "Breanne", "Brear", "Bree", "Breena", "Bren", "Brena", "Brenda", "Brenn", "Brenna", "Brett", "Bria", "Briana", "Brianna", "Brianne", "Bride", "Bridget", "Bridgett", "Bridgette", "Bridie", "Brier", "Brietta", "Brigid", "Brigida", "Brigit", "Brigitta", "Brigitte", "Brina", "Briney", "Briny", "Brit", "Brita", "Britaney", "Britani", "Briteny", "Britney", "Britni", "Britt", "Britta", "Brittan", "Brittany", "Britte", "Brittney", "Brook", "Brooke", "Brooks", "Brunella", "Brunhilda", "Brunhilde", "Bryana", "Bryn", "Bryna", "Brynn", "Brynna", "Brynne", "Buffy", "Bunni", "Bunnie", "Bunny", "Burta", "Cabrina", "Cacilia", "Cacilie", "Caitlin", "Caitrin", "Cal", "Calida", "Calla", "Calley", "Calli", "Callida", "Callie", "Cally", "Calypso", "Cam", "Camala", "Camel", "Camella", "Camellia", "Cameo", "Cami", "Camila", "Camile", "Camilla", "Camille", "Cammi", "Cammie", "Cammy", "Canada", "Candace", "Candi", "Candice", "Candida", "Candide", "Candie", "Candis", "Candra", "Candy", "Cappella", "Caprice", "Cara", "Caralie", "Caren", "Carena", "Caresa", "Caressa", "Caresse", "Carey", "Cari", "Caria", "Carie", "Caril", "Carilyn", "Carin", "Carina", "Carine", "Cariotta", "Carissa", "Carita", "Caritta", "Carla", "Carlee", "Carleen", "Carlen", "Carlena", "Carlene", "Carley", "Carli", "Carlie", "Carlin", "Carlina", "Carline", "Carlisle", "Carlita", "Carlota", "Carlotta", "Carly", "Carlye", "Carlyn", "Carlynn", "Carlynne", "Carma", "Carmel", "Carmela", "Carmelia", "Carmelina", "Carmelita", "Carmella", "Carmelle", "Carmen", "Carmina", "Carmine", "Carmita", "Carmon", "Caro", "Carol", "Carol-Jean", "Carola", "Carolan", "Carolann", "Carole", "Carolee", "Caroleen", "Carolie", "Carolin", "Carolina", "Caroline", "Caroljean", "Carolyn", "Carolyne", "Carolynn", "Caron", "Carree", "Carri", "Carrie", "Carrissa", "Carrol", "Carroll", "Carry", "Cary", "Caryl", "Caryn", "Casandra", "Casey", "Casi", "Casia", "Casie", "Cass", "Cassandra", "Cassandre", "Cassandry", "Cassaundra", "Cassey", "Cassi", "Cassie", "Cassondra", "Cassy", "Cat", "Catarina", "Cate", "Caterina", "Catha", "Catharina", "Catharine", "Cathe", "Cathee", "Catherin", "Catherina", "Catherine", "Cathi", "Cathie", "Cathleen", "Cathlene", "Cathrin", "Cathrine", "Cathryn", "Cathy", "Cathyleen", "Cati", "Catie", "Catina", "Catlaina", "Catlee", "Catlin", "Catrina", "Catriona", "Caty", "Cayla", "Cecelia", "Cecil", "Cecile", "Ceciley", "Cecilia", "Cecilla", "Cecily", "Ceil", "Cele", "Celene", "Celesta", "Celeste", "Celestia", "Celestina", "Celestine", "Celestyn", "Celestyna", "Celia", "Celie", "Celina", "Celinda", "Celine", "Celinka", "Celisse", "Celle", "Cesya", "Chad", "Chanda", "Chandal", "Chandra", "Channa", "Chantal", "Chantalle", "Charil", "Charin", "Charis", "Charissa", "Charisse", "Charita", "Charity", "Charla", "Charlean", "Charleen", "Charlena", "Charlene", "Charline", "Charlot", "Charlott", "Charlotta", "Charlotte", "Charmain", "Charmaine", "Charmane", "Charmian", "Charmine", "Charmion", "Charo", "Charyl", "Chastity", "Chelsae", "Chelsea", "Chelsey", "Chelsie", "Chelsy", "Cher", "Chere", "Cherey", "Cheri", "Cherianne", "Cherice", "Cherida", "Cherie", "Cherilyn", "Cherilynn", "Cherin", "Cherise", "Cherish", "Cherlyn", "Cherri", "Cherrita", "Cherry", "Chery", "Cherye", "Cheryl", "Cheslie", "Chiarra", "Chickie", "Chicky", "Chiquita", "Chloe", "Chloette", "Chloris", "Chris", "Chriss", "Chrissa", "Chrissie", "Chrissy", "Christa", "Christabel", "Christabella", "Christabelle", "Christal", "Christalle", "Christan", "Christean", "Christel", "Christen", "Christi", "Christian", "Christiana", "Christiane", "Christie", "Christin", "Christina", "Christine", "Christy", "Christyna", "Chrysa", "Chrysler", "Chrystal", "Chryste", "Chrystel", "Ciara", "Cicely", "Cicily", "Ciel", "Cilka", "Cinda", "Cindee", "Cindelyn", "Cinderella", "Cindi", "Cindie", "Cindra", "Cindy", "Cinnamon", "Cissie", "Cissy", "Clair", "Claire", "Clara", "Clarabelle", "Clare", "Claresta", "Clareta", "Claretta", "Clarette", "Clarey", "Clari", "Claribel", "Clarice", "Clarie", "Clarinda", "Clarine", "Clarisa", "Clarissa", "Clarisse", "Clarita", "Clary", "Claude", "Claudelle", "Claudetta", "Claudette", "Claudia", "Claudie", "Claudina", "Claudine", "Clea", "Clem", "Clemence", "Clementia", "Clementina", "Clementine", "Clemmie", "Clemmy", "Cleo", "Cleopatra", "Clerissa", "Cleva", "Clio", "Clo", "Cloe", "Cloris", "Clotilda", "Clovis", "Codee", "Codi", "Codie", "Cody", "Coleen", "Colene", "Coletta", "Colette", "Colleen", "Collete", "Collette", "Collie", "Colline", "Colly", "Con", "Concettina", "Conchita", "Concordia", "Conney", "Conni", "Connie", "Conny", "Consolata", "Constance", "Constancia", "Constancy", "Constanta", "Constantia", "Constantina", "Constantine", "Consuela", "Consuelo", "Cookie", "Cora", "Corabel", "Corabella", "Corabelle", "Coral", "Coralie", "Coraline", "Coralyn", "Cordelia", "Cordelie", "Cordey", "Cordie", "Cordula", "Cordy", "Coreen", "Corella", "Corena", "Corenda", "Corene", "Coretta", "Corette", "Corey", "Cori", "Corie", "Corilla", "Corina", "Corine", "Corinna", "Corinne", "Coriss", "Corissa", "Corliss", "Corly", "Cornela", "Cornelia", "Cornelle", "Cornie", "Corny", "Correna", "Correy", "Corri", "Corrianne", "Corrie", "Corrina", "Corrine", "Corrinne", "Corry", "Cortney", "Cory", "Cosetta", "Cosette", "Courtenay", "Courtney", "Cresa", "Cris", "Crissie", "Crissy", "Crista", "Cristabel", "Cristal", "Cristen", "Cristi", "Cristie", "Cristin", "Cristina", "Cristine", "Cristionna", "Cristy", "Crysta", "Crystal", "Crystie", "Cyb", "Cybal", "Cybel", "Cybelle", "Cybil", "Cybill", "Cyndi", "Cyndy", "Cynthea", "Cynthia", "Cynthie", "Cynthy", "Dacey", "Dacia", "Dacie", "Dacy", "Dael", "Daffi", "Daffie", "Daffy", "Dafna", "Dagmar", "Dahlia", "Daile", "Daisey", "Daisi", "Daisie", "Daisy", "Dale", "Dalenna", "Dalia", "Dalila", "Dallas", "Daloris", "Damara", "Damaris", "Damita", "Dana", "Danell", "Danella", "Danelle", "Danette", "Dani", "Dania", "Danica", "Danice", "Daniel", "Daniela", "Daniele", "Daniella", "Danielle", "Danika", "Danila", "Danit", "Danita", "Danna", "Danni", "Dannie", "Danny", "Dannye", "Danya", "Danyelle", "Danyette", "Daphene", "Daphna", "Daphne", "Dara", "Darb", "Darbie", "Darby", "Darcee", "Darcey", "Darci", "Darcie", "Darcy", "Darda", "Dareen", "Darell", "Darelle", "Dari", "Daria", "Darice", "Darla", "Darleen", "Darlene", "Darline", "Darryl", "Darsey", "Darsie", "Darya", "Daryl", "Daryn", "Dasha", "Dasi", "Dasie", "Dasya", "Datha", "Daune", "Daveen", "Daveta", "Davida", "Davina", "Davine", "Davita", "Dawn", "Dawna", "Dayle", "Dayna", "Dea", "Deana", "Deane", "Deanna", "Deanne", "Deb", "Debbi", "Debbie", "Debbra", "Debby", "Debee", "Debera", "Debi", "Debor", "Debora", "Deborah", "Debra", "Dede", "Dedie", "Dedra", "Dee", "Dee", "Dee", "Deeann", "Deeanne", "Deedee", "Deena", "Deerdre", "Dehlia", "Deidre", "Deina", "Deirdre", "Del", "Dela", "Delaney", "Delcina", "Delcine", "Delia", "Delila", "Delilah", "Delinda", "Dell", "Della", "Delly", "Delora", "Delores", "Deloria", "Deloris", "Delphina", "Delphine", "Delphinia", "Demeter", "Demetra", "Demetria", "Demetris", "Dena", "Deni", "Denice", "Denise", "Denna", "Denni", "Dennie", "Denny", "Deny", "Denys", "Denyse", "Deonne", "Desaree", "Desdemona", "Desirae", "Desiree", "Desiri", "Deva", "Devan", "Devi", "Devin", "Devina", "Devinne", "Devon", "Devondra", "Devonna", "Devonne", "Devora", "Dew", "Di", "Diahann", "Diamond", "Dian", "Diana", "Diandra", "Diane", "Diane-Marie", "Dianemarie", "Diann", "Dianna", "Dianne", "Diannne", "Didi", "Dido", "Diena", "Dierdre", "Dina", "Dinah", "Dinnie", "Dinny", "Dion", "Dione", "Dionis", "Dionne", "Dita", "Dix", "Dixie", "Dode", "Dodi", "Dodie", "Dody", "Doe", "Doll", "Dolley", "Dolli", "Dollie", "Dolly", "Dolora", "Dolores", "Dolorita", "Doloritas", "Dominica", "Dominique", "Dona", "Donella", "Donelle", "Donetta", "Donia", "Donica", "Donielle", "Donna", "Donnajean", "Donnamarie", "Donni", "Donnie", "Donny", "Dora", "Doralia", "Doralin", "Doralyn", "Doralynn", "Doralynne", "Dorcas", "Dore", "Doreen", "Dorelia", "Dorella", "Dorelle", "Dorena", "Dorene", "Doretta", "Dorette", "Dorey", "Dori", "Doria", "Dorian", "Dorice", "Dorie", "Dorine", "Doris", "Dorisa", "Dorise", "Dorit", "Dorita", "Doro", "Dorolice", "Dorolisa", "Dorotea", "Doroteya", "Dorothea", "Dorothee", "Dorothy", "Dorree", "Dorri", "Dorrie", "Dorris", "Dorry", "Dorthea", "Dorthy", "Dory", "Dosi", "Dot", "Doti", "Dotti", "Dottie", "Dotty", "Dove", "Drea", "Drew", "Dulce", "Dulcea", "Dulci", "Dulcia", "Dulciana", "Dulcie", "Dulcine", "Dulcinea", "Dulcy", "Dulsea", "Dusty", "Dyan", "Dyana", "Dyane", "Dyann", "Dyanna", "Dyanne", "Dyna", "Dynah", "E'Lane", "Eada", "Eadie", "Eadith", "Ealasaid", "Eartha", "Easter", "Eba", "Ebba", "Ebonee", "Ebony", "Eda", "Eddi", "Eddie", "Eddy", "Ede", "Edee", "Edeline", "Eden", "Edi", "Edie", "Edin", "Edita", "Edith", "Editha", "Edithe", "Ediva", "Edna", "Edwina", "Edy", "Edyth", "Edythe", "Effie", "Eileen", "Eilis", "Eimile", "Eirena", "Ekaterina", "Elaina", "Elaine", "Elana", "Elane", "Elayne", "Elberta", "Elbertina", "Elbertine", "Eleanor", "Eleanora", "Eleanore", "Electra", "Elena", "Elene", "Eleni", "Elenore", "Eleonora", "Eleonore", "Elfie", "Elfreda", "Elfrida", "Elfrieda", "Elga", "Elianora", "Elianore", "Elicia", "Elie", "Elinor", "Elinore", "Elisa", "Elisabet", "Elisabeth", "Elisabetta", "Elise", "Elisha", "Elissa", "Elita", "Eliza", "Elizabet", "Elizabeth", "Elka", "Elke", "Ella", "Elladine", "Elle", "Ellen", "Ellene", "Ellette", "Elli", "Ellie", "Ellissa", "Elly", "Ellyn", "Ellynn", "Elmira", "Elna", "Elnora", "Elnore", "Eloisa", "Eloise", "Elonore", "Elora", "Elsa", "Elsbeth", "Else", "Elsey", "Elsi", "Elsie", "Elsinore", "Elspeth", "Elsy", "Elva", "Elvera", "Elvina", "Elvira", "Elwina", "Elwira", "Elyn", "Elyse", "Elysee", "Elysha", "Elysia", "Elyssa", "Em", "Ema", "Emalee", "Emalia", "Emanuela", "Emelda", "Emelia", "Emelina", "Emeline", "Emelita", "Emelyne", "Emera", "Emilee", "Emili", "Emilia", "Emilie", "Emiline", "Emily", "Emlyn", "Emlynn", "Emlynne", "Emma", "Emmalee", "Emmaline", "Emmalyn", "Emmalynn", "Emmalynne", "Emmeline", "Emmey", "Emmi", "Emmie", "Emmy", "Emmye", "Emogene", "Emyle", "Emylee", "Endora", "Engracia", "Enid", "Enrica", "Enrichetta", "Enrika", "Enriqueta", "Enya", "Eolanda", "Eolande", "Eran", "Erda", "Erena", "Erica", "Ericha", "Ericka", "Erika", "Erin", "Erina", "Erinn", "Erinna", "Erma", "Ermengarde", "Ermentrude", "Ermina", "Erminia", "Erminie", "Erna", "Ernaline", "Ernesta", "Ernestine", "Ertha", "Eryn", "Esma", "Esmaria", "Esme", "Esmeralda", "Esmerelda", "Essa", "Essie", "Essy", "Esta", "Estel", "Estele", "Estell", "Estella", "Estelle", "Ester", "Esther", "Estrella", "Estrellita", "Ethel", "Ethelda", "Ethelin", "Ethelind", "Etheline", "Ethelyn", "Ethyl", "Etta", "Etti", "Ettie", "Etty", "Eudora", "Eugenia", "Eugenie", "Eugine", "Eula", "Eulalie", "Eunice", "Euphemia", "Eustacia", "Eva", "Evaleen", "Evangelia", "Evangelin", "Evangelina", "Evangeline", "Evania", "Evanne", "Eve", "Eveleen", "Evelina", "Eveline", "Evelyn", "Evette", "Evey", "Evie", "Evita", "Evonne", "Evvie", "Evvy", "Evy", "Eyde", "Eydie", "Fabrianne", "Fabrice", "Fae", "Faina", "Faith", "Fallon", "Fan", "Fanchette", "Fanchon", "Fancie", "Fancy", "Fanechka", "Fania", "Fanni", "Fannie", "Fanny", "Fanya", "Fara", "Farah", "Farand", "Farica", "Farra", "Farrah", "Farrand", "Fatima", "Faun", "Faunie", "Faustina", "Faustine", "Fawn", "Fawna", "Fawne", "Fawnia", "Fay", "Faydra", "Faye", "Fayette", "Fayina", "Fayre", "Fayth", "Faythe", "Federica", "Fedora", "Felecia", "Felicdad", "Felice", "Felicia", "Felicity", "Felicle", "Felipa", "Felisha", "Felita", "Feliza", "Fenelia", "Feodora", "Ferdinanda", "Ferdinande", "Fern", "Fernanda", "Fernande", "Fernandina", "Ferne", "Fey", "Fiann", "Fianna", "Fidela", "Fidelia", "Fidelity", "Fifi", "Fifine", "Filia", "Filide", "Filippa", "Fina", "Fiona", "Fionna", "Fionnula", "Fiorenze", "Fleur", "Fleurette", "Flo", "Flor", "Flora", "Florance", "Flore", "Florella", "Florence", "Florencia", "Florentia", "Florenza", "Florette", "Flori", "Floria", "Florice", "Florida", "Florie", "Florina", "Florinda", "Floris", "Florri", "Florrie", "Florry", "Flory", "Flossi", "Flossie", "Flossy", "Flower", "Fortuna", "Fortune", "Fran", "France", "Francene", "Frances", "Francesca", "Francesmary", "Francine", "Francis", "Francisca", "Franciska", "Francoise", "Francyne", "Frank", "Frankie", "Franky", "Franni", "Frannie", "Franny", "Frayda", "Fred", "Freda", "Freddi", "Freddie", "Freddy", "Fredelia", "Frederica", "Fredericka", "Fredi", "Fredia", "Fredra", "Fredrika", "Freida", "Frieda", "Friederike", "Fulvia", "Gabbey", "Gabbi", "Gabbie", "Gabey", "Gabi", "Gabie", "Gabriel", "Gabriela", "Gabriell", "Gabriella", "Gabrielle", "Gabriellia", "Gabrila", "Gaby", "Gae", "Gael", "Gail", "Gale", "Gale", "Galina", "Garland", "Garnet", "Garnette", "Gates", "Gavra", "Gavrielle", "Gay", "Gayla", "Gayle", "Gayleen", "Gaylene", "Gaynor", "Gelya", "Gen", "Gena", "Gene", "Geneva", "Genevieve", "Genevra", "Genia", "Genna", "Genni", "Gennie", "Gennifer", "Genny", "Genovera", "Genvieve", "George", "Georgeanna", "Georgeanne", "Georgena", "Georgeta", "Georgetta", "Georgette", "Georgia", "Georgiamay", "Georgiana", "Georgianna", "Georgianne", "Georgie", "Georgina", "Georgine", "Gera", "Geralda", "Geraldina", "Geraldine", "Gerda", "Gerhardine", "Geri", "Gerianna", "Gerianne", "Gerladina", "Germain", "Germaine", "Germana", "Gerri", "Gerrie", "Gerrilee", "Gerry", "Gert", "Gerta", "Gerti", "Gertie", "Gertrud", "Gertruda", "Gertrude", "Gertrudis", "Gerty", "Giacinta", "Giana", "Gianina", "Gianna", "Gigi", "Gilberta", "Gilberte", "Gilbertina", "Gilbertine", "Gilda", "Gill", "Gillan", "Gilli", "Gillian", "Gillie", "Gilligan", "Gilly", "Gina", "Ginelle", "Ginevra", "Ginger", "Ginni", "Ginnie", "Ginnifer", "Ginny", "Giorgia", "Giovanna", "Gipsy", "Giralda", "Gisela", "Gisele", "Gisella", "Giselle", "Gizela", "Glad", "Gladi", "Gladis", "Gladys", "Gleda", "Glen", "Glenda", "Glenine", "Glenn", "Glenna", "Glennie", "Glennis", "Glori", "Gloria", "Gloriana", "Gloriane", "Glorianna", "Glory", "Glyn", "Glynda", "Glynis", "Glynnis", "Godiva", "Golda", "Goldarina", "Goldi", "Goldia", "Goldie", "Goldina", "Goldy", "Grace", "Gracia", "Gracie", "Grata", "Gratia", "Gratiana", "Gray", "Grayce", "Grazia", "Gredel", "Greer", "Greta", "Gretal", "Gretchen", "Grete", "Gretel", "Grethel", "Gretna", "Gretta", "Grier", "Griselda", "Grissel", "Guendolen", "Guenevere", "Guenna", "Guglielma", "Gui", "Guillema", "Guillemette", "Guinevere", "Guinna", "Gunilla", "Gunvor", "Gus", "Gusella", "Gussi", "Gussie", "Gussy", "Gusta", "Gusti", "Gustie", "Gusty", "Gwen", "Gwendolen", "Gwendolin", "Gwendolyn", "Gweneth", "Gwenette", "Gwenn", "Gwenneth", "Gwenni", "Gwennie", "Gwenny", "Gwenora", "Gwenore", "Gwyn", "Gwyneth", "Gwynne", "Gypsy", "Hadria", "Hailee", "Haily", "Haleigh", "Halette", "Haley", "Hali", "Halie", "Halimeda", "Halley", "Halli", "Hallie", "Hally", "Hana", "Hanna", "Hannah", "Hanni", "Hannibal", "Hannie", "Hannis", "Hanny", "Happy", "Harlene", "Harley", "Harli", "Harlie", "Harmonia", "Harmonie", "Harmony", "Harri", "Harrie", "Harriet", "Harriett", "Harrietta", "Harriette", "Harriot", "Harriott", "Hatti", "Hattie", "Hatty", "Havivah", "Hayley", "Hazel", "Heath", "Heather", "Heda", "Hedda", "Heddi", "Heddie", "Hedi", "Hedvig", "Hedwig", "Hedy", "Heida", "Heide", "Heidi", "Heidie", "Helaina", "Helaine", "Helen", "Helen-Elizabeth", "Helena", "Helene", "Helga", "Helge", "Helise", "Hellene", "Helli", "Heloise", "Helsa", "Helyn", "Hendrika", "Henka", "Henrie", "Henrieta", "Henrietta", "Henriette", "Henryetta", "Hephzibah", "Hermia", "Hermina", "Hermine", "Herminia", "Hermione", "Herta", "Hertha", "Hester", "Hesther", "Hestia", "Hetti", "Hettie", "Hetty", "Hilarie", "Hilary", "Hilda", "Hildagard", "Hildagarde", "Hilde", "Hildegaard", "Hildegarde", "Hildy", "Hillary", "Hilliary", "Hinda", "Holley", "Holli", "Hollie", "Holly", "Holly-Anne", "Hollyanne", "Honey", "Honor", "Honoria", "Hope", "Horatia", "Hortense", "Hortensia", "Hulda", "Hyacinth", "Hyacintha", "Hyacinthe", "Hyacinthia", "Hyacinthie", "Hynda", "Ianthe", "Ibbie", "Ibby", "Ida", "Idalia", "Idalina", "Idaline", "Idell", "Idelle", "Idette", "Ike", "Ikey", "Ilana", "Ileana", "Ileane", "Ilene", "Ilise", "Ilka", "Illa", "Ilona", "Ilsa", "Ilse", "Ilysa", "Ilyse", "Ilyssa", "Imelda", "Imogen", "Imogene", "Imojean", "Ina", "Inci", "Indira", "Ines", "Inesita", "Inessa", "Inez", "Inga", "Ingaberg", "Ingaborg", "Inge", "Ingeberg", "Ingeborg", "Inger", "Ingrid", "Ingunna", "Inna", "Ioana", "Iolande", "Iolanthe", "Iona", "Iormina", "Ira", "Irena", "Irene", "Irina", "Iris", "Irita", "Irma", "Isa", "Isabeau", "Isabel", "Isabelita", "Isabella", "Isabelle", "Isador", "Isadora", "Isadore", "Isahella", "Iseabal", "Isidora", "Isis", "Isobel", "Issi", "Issie", "Issy", "Ivett", "Ivette", "Ivie", "Ivonne", "Ivory", "Ivy", "Izabel", "Izzi", "Jacenta", "Jacinda", "Jacinta", "Jacintha", "Jacinthe", "Jackelyn", "Jacki", "Jackie", "Jacklin", "Jacklyn", "Jackquelin", "Jackqueline", "Jacky", "Jaclin", "Jaclyn", "Jacquelin", "Jacqueline", "Jacquelyn", "Jacquelynn", "Jacquenetta", "Jacquenette", "Jacquetta", "Jacquette", "Jacqui", "Jacquie", "Jacynth", "Jada", "Jade", "Jaime", "Jaimie", "Jaine", "Jaleh", "Jami", "Jamie", "Jamima", "Jammie", "Jan", "Jana", "Janaya", "Janaye", "Jandy", "Jane", "Janean", "Janeczka", "Janeen", "Janel", "Janela", "Janella", "Janelle", "Janene", "Janenna", "Janessa", "Janet", "Janeta", "Janetta", "Janette", "Janeva", "Janey", "Jania", "Janice", "Janie", "Janifer", "Janina", "Janine", "Janis", "Janith", "Janka", "Janna", "Jannel", "Jannelle", "Janot", "Jany", "Jaquelin", "Jaquelyn", "Jaquenetta", "Jaquenette", "Jaquith", "Jasmin", "Jasmina", "Jasmine", "Jayme", "Jaymee", "Jayne", "Jaynell", "Jazmin", "Jean", "Jeana", "Jeane", "Jeanelle", "Jeanette", "Jeanie", "Jeanine", "Jeanna", "Jeanne", "Jeannette", "Jeannie", "Jeannine", "Jehanna", "Jelene", "Jemie", "Jemima", "Jemimah", "Jemmie", "Jemmy", "Jen", "Jena", "Jenda", "Jenelle", "Jenette", "Jeni", "Jenica", "Jeniece", "Jenifer", "Jeniffer", "Jenilee", "Jenine", "Jenn", "Jenna", "Jennee", "Jennette", "Jenni", "Jennica", "Jennie", "Jennifer", "Jennilee", "Jennine", "Jenny", "Jeraldine", "Jeralee", "Jere", "Jeri", "Jermaine", "Jerrie", "Jerrilee", "Jerrilyn", "Jerrine", "Jerry", "Jerrylee", "Jess", "Jessa", "Jessalin", "Jessalyn", "Jessamine", "Jessamyn", "Jesse", "Jesselyn", "Jessi", "Jessica", "Jessie", "Jessika", "Jessy", "Jewel", "Jewell", "Jewelle", "Jill", "Jillana", "Jillane", "Jillayne", "Jilleen", "Jillene", "Jilli", "Jillian", "Jillie", "Jilly", "Jinny", "Jo", "Jo", "Ann", "Jo-Ann", "Jo-Anne", "JoAnn", "JoAnne", "Joan", "Joana", "Joane", "Joanie", "Joann", "Joanna", "Joanne", "Joannes", "Jobey", "Jobi", "Jobie", "Jobina", "Joby", "Jobye", "Jobyna", "Jocelin", "Joceline", "Jocelyn", "Jocelyne", "Jodee", "Jodi", "Jodie", "Jody", "Joela", "Joelie", "Joell", "Joella", "Joelle", "Joellen", "Joelly", "Joellyn", "Joelynn", "Joete", "Joey", "Johanna", "Johannah", "Johnette", "Johnna", "Joice", "Jojo", "Jolee", "Joleen", "Jolene", "Joletta", "Joli", "Jolie", "Joline", "Joly", "Jolyn", "Jolynn", "Jonell", "Joni", "Jonie", "Jonis", "Jordain", "Jordan", "Jordana", "Jordanna", "Jorey", "Jori", "Jorie", "Jorrie", "Jorry", "Joscelin", "Josee", "Josefa", "Josefina", "Joselyn", "Josepha", "Josephina", "Josephine", "Josey", "Josi", "Josie", "Joslyn", "Josselyn", "Josy", "Jourdan", "Joy", "Joya", "Joyan", "Joyann", "Joyce", "Joycelin", "Joye", "Joyous", "Juana", "Juanita", "Jude", "Judi", "Judie", "Judith", "Juditha", "Judy", "Judye", "Julee", "Juli", "Julia", "Juliana", "Juliane", "Juliann", "Julianna", "Julianne", "Julie", "Julienne", "Juliet", "Julieta", "Julietta", "Juliette", "Julina", "Juline", "Julissa", "Julita", "June", "Junette", "Junia", "Junie", "Junina", "Justin", "Justina", "Justine", "Jyoti", "Kacey", "Kacie", "Kacy", "Kai", "Kaia", "Kaila", "Kaile", "Kailey", "Kaitlin", "Kaitlyn", "Kaitlynn", "Kaja", "Kakalina", "Kala", "Kaleena", "Kali", "Kalie", "Kalila", "Kalina", "Kalinda", "Kalindi", "Kalli", "Kally", "Kameko", "Kamila", "Kamilah", "Kamillah", "Kandace", "Kandy", "Kania", "Kanya", "Kara", "Kara-Lynn", "Karalee", "Karalynn", "Kare", "Karee", "Karel", "Karen", "Karena", "Kari", "Karia", "Karie", "Karil", "Karilynn", "Karin", "Karina", "Karine", "Kariotta", "Karisa", "Karissa", "Karita", "Karla", "Karlee", "Karleen", "Karlen", "Karlene", "Karlie", "Karlotta", "Karlotte", "Karly", "Karlyn", "Karmen", "Karna", "Karol", "Karola", "Karole", "Karolina", "Karoline", "Karoly", "Karon", "Karrah", "Karrie", "Karry", "Kary", "Karyl", "Karylin", "Karyn", "Kasey", "Kass", "Kassandra", "Kassey", "Kassi", "Kassia", "Kassie", "Kaster", "Kat", "Kata", "Katalin", "Kate", "Katee", "Katerina", "Katerine", "Katey", "Kath", "Katha", "Katharina", "Katharine", "Katharyn", "Kathe", "Katheleen", "Katherina", "Katherine", "Katheryn", "Kathi", "Kathie", "Kathleen", "Kathlene", "Kathlin", "Kathrine", "Kathryn", "Kathryne", "Kathy", "Kathye", "Kati", "Katie", "Katina", "Katine", "Katinka", "Katleen", "Katlin", "Katrina", "Katrine", "Katrinka", "Katti", "Kattie", "Katuscha", "Katusha", "Katy", "Katya", "Kay", "Kaycee", "Kaye", "Kayla", "Kayle", "Kaylee", "Kayley", "Kaylil", "Kaylyn", "Kee", "Keeley", "Keelia", "Keely", "Kelcey", "Kelci", "Kelcie", "Kelcy", "Kelila", "Kellen", "Kelley", "Kelli", "Kellia", "Kellie", "Kellina", "Kellsie", "Kelly", "Kellyann", "Kelsey", "Kelsi", "Kelsy", "Kendra", "Kendre", "Kenna", "Keren", "Keri", "Keriann", "Kerianne", "Kerri", "Kerrie", "Kerrill", "Kerrin", "Kerry", "Kerstin", "Kesley", "Keslie", "Kessia", "Kessiah", "Ketti", "Kettie", "Ketty", "Kevina", "Kevyn", "Ki", "Kia", "Kiah", "Kial", "Kiele", "Kiersten", "Kikelia", "Kiley", "Kim", "Kimberlee", "Kimberley", "Kimberli", "Kimberly", "Kimberlyn", "Kimbra", "Kimmi", "Kimmie", "Kimmy", "Kinna", "Kip", "Kipp", "Kippie", "Kippy", "Kira", "Kirbee", "Kirbie", "Kirby", "Kiri", "Kirsten", "Kirsteni", "Kirsti", "Kirstie", "Kirstin", "Kirstyn", "Kissee", "Kissiah", "Kissie", "Kit", "Kitti", "Kittie", "Kitty", "Kizzee", "Kizzie", "Klara", "Klarika", "Klarrisa", "Konstance", "Konstanze", "Koo", "Kora", "Koral", "Koralle", "Kordula", "Kore", "Korella", "Koren", "Koressa", "Kori", "Korie", "Korney", "Korrie", "Korry", "Kourtney", "Kris", "Krissie", "Krissy", "Krista", "Kristal", "Kristan", "Kriste", "Kristel", "Kristen", "Kristi", "Kristien", "Kristin", "Kristina", "Kristine", "Kristy", "Kristyn", "Krysta", "Krystal", "Krystalle", "Krystle", "Krystyna", "Kyla", "Kyle", "Kylen", "Kylie", "Kylila", "Kylynn", "Kym", "Kynthia", "Kyrstin", "La", "Lacee", "Lacey", "Lacie", "Lacy", "Ladonna", "Laetitia", "Laila", "Laina", "Lainey", "Lamb", "Lana", "Lane", "Lanette", "Laney", "Lani", "Lanie", "Lanita", "Lanna", "Lanni", "Lanny", "Lara", "Laraine", "Lari", "Larina", "Larine", "Larisa", "Larissa", "Lark", "Laryssa", "Latashia", "Latia", "Latisha", "Latrena", "Latrina", "Laura", "Lauraine", "Laural", "Lauralee", "Laure", "Lauree", "Laureen", "Laurel", "Laurella", "Lauren", "Laurena", "Laurene", "Lauretta", "Laurette", "Lauri", "Laurianne", "Laurice", "Laurie", "Lauryn", "Lavena", "Laverna", "Laverne", "Lavina", "Lavinia", "Lavinie", "Layla", "Layne", "Layney", "Lea", "Leah", "Leandra", "Leann", "Leanna", "Leanne", "Leanor", "Leanora", "Lebbie", "Leda", "Lee", "LeeAnn", "Leeann", "Leeanne", "Leela", "Leelah", "Leena", "Leesa", "Leese", "Legra", "Leia", "Leiah", "Leigh", "Leigha", "Leila", "Leilah", "Leisha", "Lela", "Lelah", "Leland", "Lelia", "Lena", "Lenee", "Lenette", "Lenka", "Lenna", "Lenora", "Lenore", "Leodora", "Leoine", "Leola", "Leoline", "Leona", "Leonanie", "Leone", "Leonelle", "Leonie", "Leonora", "Leonore", "Leontine", "Leontyne", "Leora", "Leorah", "Leshia", "Lesley", "Lesli", "Leslie", "Lesly", "Lesya", "Leta", "Lethia", "Leticia", "Letisha", "Letitia", "Letta", "Letti", "Lettie", "Letty", "Leyla", "Lezlie", "Lia", "Lian", "Liana", "Liane", "Lianna", "Lianne", "Lib", "Libbey", "Libbi", "Libbie", "Libby", "Licha", "Lida", "Lidia", "Lil", "Lila", "Lilah", "Lilas", "Lilia", "Lilian", "Liliane", "Lilias", "Lilith", "Lilla", "Lilli", "Lillian", "Lillis", "Lilllie", "Lilly", "Lily", "Lilyan", "Lin", "Lina", "Lind", "Linda", "Lindi", "Lindie", "Lindsay", "Lindsey", "Lindsy", "Lindy", "Linea", "Linell", "Linet", "Linette", "Linn", "Linnea", "Linnell", "Linnet", "Linnie", "Linzy", "Liora", "Liorah", "Lira", "Lisa", "Lisabeth", "Lisandra", "Lisbeth", "Lise", "Lisetta", "Lisette", "Lisha", "Lishe", "Lissa", "Lissi", "Lissie", "Lissy", "Lita", "Liuka", "Livia", "Liz", "Liza", "Lizabeth", "Lizbeth", "Lizette", "Lizzie", "Lizzy", "Loella", "Lois", "Loise", "Lola", "Lolande", "Loleta", "Lolita", "Lolly", "Lona", "Lonee", "Loni", "Lonna", "Lonni", "Lonnie", "Lora", "Lorain", "Loraine", "Loralee", "Loralie", "Loralyn", "Loree", "Loreen", "Lorelei", "Lorelle", "Loren", "Lorena", "Lorene", "Lorenza", "Loretta", "Lorettalorna", "Lorette", "Lori", "Loria", "Lorianna", "Lorianne", "Lorie", "Lorilee", "Lorilyn", "Lorinda", "Lorine", "Lorita", "Lorna", "Lorne", "Lorraine", "Lorrayne", "Lorri", "Lorrie", "Lorrin", "Lorry", "Lory", "Lotta", "Lotte", "Lotti", "Lottie", "Lotty", "Lou", "Louella", "Louisa", "Louise", "Louisette", "Love", "Luana", "Luanna", "Luce", "Luci", "Lucia", "Luciana", "Lucie", "Lucienne", "Lucila", "Lucilia", "Lucille", "Lucina", "Lucinda", "Lucine", "Lucita", "Lucky", "Lucretia", "Lucy", "Luella", "Luelle", "Luisa", "Luise", "Lula", "Lulita", "Lulu", "Luna", "Lura", "Lurette", "Lurleen", "Lurlene", "Lurline", "Lusa", "Lust", "Lyda", "Lydia", "Lydie", "Lyn", "Lynda", "Lynde", "Lyndel", "Lyndell", "Lyndsay", "Lyndsey", "Lyndsie", "Lyndy", "Lynea", "Lynelle", "Lynett", "Lynette", "Lynn", "Lynna", "Lynne", "Lynnea", "Lynnell", "Lynnelle", "Lynnet", "Lynnett", "Lynnette", "Lynsey", "Lysandra", "Lyssa", "Mab", "Mabel", "Mabelle", "Mable", "Mada", "Madalena", "Madalyn", "Maddalena", "Maddi", "Maddie", "Maddy", "Madel", "Madelaine", "Madeleine", "Madelena", "Madelene", "Madelin", "Madelina", "Madeline", "Madella", "Madelle", "Madelon", "Madelyn", "Madge", "Madlen", "Madlin", "Madona", "Madonna", "Mady", "Mae", "Maegan", "Mag", "Magda", "Magdaia", "Magdalen", "Magdalena", "Magdalene", "Maggee", "Maggi", "Maggie", "Maggy", "Magna", "Mahala", "Mahalia", "Maia", "Maible", "Maiga", "Mair", "Maire", "Mairead", "Maisey", "Maisie", "Mala", "Malanie", "Malcah", "Malena", "Malia", "Malina", "Malinda", "Malinde", "Malissa", "Malissia", "Malka", "Malkah", "Mallissa", "Mallorie", "Mallory", "Malorie", "Malory", "Malva", "Malvina", "Malynda", "Mame", "Mamie", "Manda", "Mandi", "Mandie", "Mandy", "Manon", "Manya", "Mara", "Marabel", "Marcela", "Marcelia", "Marcella", "Marcelle", "Marcellina", "Marcelline", "Marchelle", "Marci", "Marcia", "Marcie", "Marcile", "Marcille", "Marcy", "Mareah", "Maren", "Marena", "Maressa", "Marga", "Margalit", "Margalo", "Margaret", "Margareta", "Margarete", "Margaretha", "Margarethe", "Margaretta", "Margarette", "Margarita", "Margaux", "Marge", "Margeaux", "Margery", "Marget", "Margette", "Margi", "Margie", "Margit", "Marglerite", "Margo", "Margot", "Margret", "Marguerite", "Margurite", "Margy", "Mari", "Maria", "Mariam", "Marian", "Mariana", "Mariann", "Marianna", "Marianne", "Maribel", "Maribelle", "Maribeth", "Marice", "Maridel", "Marie", "Marie-Ann", "Marie-Jeanne", "Marieann", "Mariejeanne", "Mariel", "Mariele", "Marielle", "Mariellen", "Marietta", "Mariette", "Marigold", "Marijo", "Marika", "Marilee", "Marilin", "Marillin", "Marilyn", "Marin", "Marina", "Marinna", "Marion", "Mariquilla", "Maris", "Marisa", "Mariska", "Marissa", "Marit", "Marita", "Maritsa", "Mariya", "Marj", "Marja", "Marje", "Marji", "Marjie", "Marjorie", "Marjory", "Marjy", "Marketa", "Marla", "Marlane", "Marleah", "Marlee", "Marleen", "Marlena", "Marlene", "Marley", "Marlie", "Marline", "Marlo", "Marlyn", "Marna", "Marne", "Marney", "Marni", "Marnia", "Marnie", "Marquita", "Marrilee", "Marris", "Marrissa", "Marry", "Marsha", "Marsiella", "Marta", "Martelle", "Martguerita", "Martha", "Marthe", "Marthena", "Marti", "Martica", "Martie", "Martina", "Martita", "Marty", "Martynne", "Mary", "Marya", "Maryangelyn", "Maryann", "Maryanna", "Maryanne", "Marybelle", "Marybeth", "Maryellen", "Maryjane", "Maryjo", "Maryl", "Marylee", "Marylin", "Marylinda", "Marylou", "Marylynne", "Maryrose", "Marys", "Marysa", "Masha", "Matelda", "Mathilda", "Mathilde", "Matilda", "Matilde", "Matti", "Mattie", "Matty", "Maud", "Maude", "Maudie", "Maura", "Maure", "Maureen", "Maureene", "Maurene", "Maurine", "Maurise", "Maurita", "Mavis", "Mavra", "Max", "Maxi", "Maxie", "Maxine", "Maxy", "May", "Maya", "Maybelle", "Mayda", "Maye", "Mead", "Meade", "Meagan", "Meaghan", "Meara", "Mechelle", "Meg", "Megan", "Megen", "Meggan", "Meggi", "Meggie", "Meggy", "Meghan", "Meghann", "Mehetabel", "Mei", "Meira", "Mel", "Mela", "Melamie", "Melania", "Melanie", "Melantha", "Melany", "Melba", "Melesa", "Melessa", "Melicent", "Melina", "Melinda", "Melinde", "Melisa", "Melisande", "Melisandra", "Melisenda", "Melisent", "Melissa", "Melisse", "Melita", "Melitta", "Mella", "Melli", "Mellicent", "Mellie", "Mellisa", "Mellisent", "Mellissa", "Melloney", "Melly", "Melodee", "Melodie", "Melody", "Melonie", "Melony", "Melosa", "Melva", "Mercedes", "Merci", "Mercie", "Mercy", "Meredith", "Meredithe", "Meridel", "Meridith", "Meriel", "Merilee", "Merilyn", "Meris", "Merissa", "Merl", "Merla", "Merle", "Merlina", "Merline", "Merna", "Merola", "Merralee", "Merridie", "Merrie", "Merrielle", "Merrile", "Merrilee", "Merrili", "Merrill", "Merrily", "Merry", "Mersey", "Meryl", "Meta", "Mia", "Micaela", "Michaela", "Michaelina", "Michaeline", "Michaella", "Michal", "Michel", "Michele", "Michelina", "Micheline", "Michell", "Michelle", "Micki", "Mickie", "Micky", "Midge", "Mignon", "Mignonne", "Miguela", "Miguelita", "Mildred", "Mildrid", "Milena", "Milicent", "Milissent", "Milka", "Milli", "Millicent", "Millie", "Millisent", "Milly", "Milzie", "Mimi", "Min", "Mina", "Minda", "Mindy", "Minerva", "Minetta", "Minette", "Minna", "Minni", "Minnie", "Minny", "Minta", "Miquela", "Mira", "Mirabel", "Mirabella", "Mirabelle", "Miran", "Miranda", "Mireielle", "Mireille", "Mirella", "Mirelle", "Miriam", "Mirilla", "Mirna", "Misha", "Missie", "Missy", "Misti", "Misty", "Mitra", "Mitzi", "Mmarianne", "Modesta", "Modestia", "Modestine", "Modesty", "Moina", "Moira", "Moll", "Mollee", "Molli", "Mollie", "Molly", "Mommy", "Mona", "Monah", "Monica", "Monika", "Monique", "Mora", "Moreen", "Morena", "Morgan", "Morgana", "Morganica", "Morganne", "Morgen", "Moria", "Morissa", "Morlee", "Morna", "Moselle", "Moya", "Moyna", "Moyra", "Mozelle", "Muffin", "Mufi", "Mufinella", "Muire", "Mureil", "Murial", "Muriel", "Murielle", "Myna", "Myra", "Myrah", "Myranda", "Myriam", "Myrilla", "Myrle", "Myrlene", "Myrna", "Myrta", "Myrtia", "Myrtice", "Myrtie", "Myrtle", "Nada", "Nadean", "Nadeen", "Nadia", "Nadine", "Nadiya", "Nady", "Nadya", "Nalani", "Nan", "Nana", "Nananne", "Nance", "Nancee", "Nancey", "Nanci", "Nancie", "Nancy", "Nanete", "Nanette", "Nani", "Nanice", "Nanine", "Nannette", "Nanni", "Nannie", "Nanny", "Nanon", "Naoma", "Naomi", "Nara", "Nari", "Nariko", "Nat", "Nata", "Natala", "Natalee", "Natalia", "Natalie", "Natalina", "Nataline", "Natalya", "Natasha", "Natassia", "Nathalia", "Nathalie", "Natka", "Natty", "Neala", "Neda", "Nedda", "Nedi", "Neely", "Neila", "Neile", "Neilla", "Neille", "Nela", "Nelia", "Nelie", "Nell", "Nelle", "Nelli", "Nellie", "Nelly", "Nena", "Nerissa", "Nerita", "Nert", "Nerta", "Nerte", "Nerti", "Nertie", "Nerty", "Nessa", "Nessi", "Nessie", "Nessy", "Nesta", "Netta", "Netti", "Nettie", "Nettle", "Netty", "Nevsa", "Neysa", "Nichol", "Nichole", "Nicholle", "Nicki", "Nickie", "Nicky", "Nicol", "Nicola", "Nicole", "Nicolea", "Nicolette", "Nicoli", "Nicolina", "Nicoline", "Nicolle", "Nidia", "Nike", "Niki", "Nikki", "Nikkie", "Nikoletta", "Nikolia", "Nil", "Nina", "Ninetta", "Ninette", "Ninnetta", "Ninnette", "Ninon", "Nisa", "Nissa", "Nisse", "Nissie", "Nissy", "Nita", "Nitin", "Nixie", "Noami", "Noel", "Noelani", "Noell", "Noella", "Noelle", "Noellyn", "Noelyn", "Noemi", "Nola", "Nolana", "Nolie", "Nollie", "Nomi", "Nona", "Nonah", "Noni", "Nonie", "Nonna", "Nonnah", "Nora", "Norah", "Norean", "Noreen", "Norene", "Norina", "Norine", "Norma", "Norri", "Norrie", "Norry", "Nova", "Novelia", "Nydia", "Nyssa", "Octavia", "Odele", "Odelia", "Odelinda", "Odella", "Odelle", "Odessa", "Odetta", "Odette", "Odilia", "Odille", "Ofelia", "Ofella", "Ofilia", "Ola", "Olenka", "Olga", "Olia", "Olimpia", "Olive", "Olivette", "Olivia", "Olivie", "Oliy", "Ollie", "Olly", "Olva", "Olwen", "Olympe", "Olympia", "Olympie", "Ondrea", "Oneida", "Onida", "Onlea", "Oona", "Opal", "Opalina", "Opaline", "Ophelia", "Ophelie", "Oprah", "Ora", "Oralee", "Oralia", "Oralie", "Oralla", "Oralle", "Orel", "Orelee", "Orelia", "Orelie", "Orella", "Orelle", "Oreste", "Oriana", "Orly", "Orsa", "Orsola", "Ortensia", "Otha", "Othelia", "Othella", "Othilia", "Othilie", "Ottilie", "Pacifica", "Page", "Paige", "Paloma", "Pam", "Pamela", "Pamelina", "Pamella", "Pammi", "Pammie", "Pammy", "Pandora", "Pansie", "Pansy", "Paola", "Paolina", "Parwane", "Pat", "Patience", "Patrica", "Patrice", "Patricia", "Patrizia", "Patsy", "Patti", "Pattie", "Patty", "Paula", "Paula-Grace", "Paule", "Pauletta", "Paulette", "Pauli", "Paulie", "Paulina", "Pauline", "Paulita", "Pauly", "Pavia", "Pavla", "Pearl", "Pearla", "Pearle", "Pearline", "Peg", "Pegeen", "Peggi", "Peggie", "Peggy", "Pen", "Penelopa", "Penelope", "Penni", "Pennie", "Penny", "Pepi", "Pepita", "Peri", "Peria", "Perl", "Perla", "Perle", "Perri", "Perrine", "Perry", "Persis", "Pet", "Peta", "Petra", "Petrina", "Petronella", "Petronia", "Petronilla", "Petronille", "Petunia", "Phaedra", "Phaidra", "Phebe", "Phedra", "Phelia", "Phil", "Philipa", "Philippa", "Philippe", "Philippine", "Philis", "Phillida", "Phillie", "Phillis", "Philly", "Philomena", "Phoebe", "Phylis", "Phyllida", "Phyllis", "Phyllys", "Phylys", "Pia", "Pier", "Pierette", "Pierrette", "Pietra", "Piper", "Pippa", "Pippy", "Polly", "Pollyanna", "Pooh", "Poppy", "Portia", "Pris", "Prisca", "Priscella", "Priscilla", "Prissie", "Pru", "Prudence", "Prudi", "Prudy", "Prue", "Prunella", "Queada", "Queenie", "Quentin", "Querida", "Quinn", "Quinta", "Quintana", "Quintilla", "Quintina", "Rachael", "Rachel", "Rachele", "Rachelle", "Rae", "Raf", "Rafa", "Rafaela", "Rafaelia", "Rafaelita", "Ragnhild", "Rahal", "Rahel", "Raina", "Raine", "Rakel", "Ralina", "Ramona", "Ramonda", "Rana", "Randa", "Randee", "Randene", "Randi", "Randie", "Randy", "Ranee", "Rani", "Rania", "Ranice", "Ranique", "Ranna", "Raphaela", "Raquel", "Raquela", "Rasia", "Rasla", "Raven", "Ray", "Raychel", "Raye", "Rayna", "Raynell", "Rayshell", "Rea", "Reba", "Rebbecca", "Rebe", "Rebeca", "Rebecca", "Rebecka", "Rebeka", "Rebekah", "Rebekkah", "Ree", "Reeba", "Reena", "Reeta", "Reeva", "Regan", "Reggi", "Reggie", "Regina", "Regine", "Reiko", "Reina", "Reine", "Remy", "Rena", "Renae", "Renata", "Renate", "Rene", "Renee", "Renel", "Renell", "Renelle", "Renie", "Rennie", "Reta", "Retha", "Revkah", "Rey", "Reyna", "Rhea", "Rheba", "Rheta", "Rhetta", "Rhiamon", "Rhianna", "Rhianon", "Rhoda", "Rhodia", "Rhodie", "Rhody", "Rhona", "Rhonda", "Riane", "Riannon", "Rianon", "Rica", "Ricca", "Rici", "Ricki", "Rickie", "Ricky", "Riki", "Rikki", "Rina", "Risa", "Rissa", "Rita", "Riva", "Rivalee", "Rivi", "Rivkah", "Rivy", "Roana", "Roanna", "Roanne", "Robbi", "Robbie", "Robbin", "Robby", "Robbyn", "Robena", "Robenia", "Roberta", "Robin", "Robina", "Robinet", "Robinett", "Robinetta", "Robinette", "Robinia", "Roby", "Robyn", "Roch", "Rochell", "Rochella", "Rochelle", "Rochette", "Roda", "Rodi", "Rodie", "Rodina", "Romola", "Romona", "Romonda", "Romy", "Rona", "Ronalda", "Ronda", "Ronica", "Ronna", "Ronni", "Ronnica", "Ronnie", "Ronny", "Roobbie", "Rora", "Rori", "Rorie", "Rory", "Ros", "Rosa", "Rosabel", "Rosabella", "Rosabelle", "Rosaleen", "Rosalia", "Rosalie", "Rosalind", "Rosalinda", "Rosalinde", "Rosaline", "Rosalyn", "Rosalynd", "Rosamond", "Rosamund", "Rosana", "Rosanna", "Rosanne", "Rosario", "Rose", "Roseann", "Roseanna", "Roseanne", "Roselia", "Roselin", "Roseline", "Rosella", "Roselle", "Roselyn", "Rosemaria", "Rosemarie", "Rosemary", "Rosemonde", "Rosene", "Rosetta", "Rosette", "Roshelle", "Rosie", "Rosina", "Rosita", "Roslyn", "Rosmunda", "Rosy", "Row", "Rowe", "Rowena", "Roxana", "Roxane", "Roxanna", "Roxanne", "Roxi", "Roxie", "Roxine", "Roxy", "Roz", "Rozalie", "Rozalin", "Rozamond", "Rozanna", "Rozanne", "Roze", "Rozele", "Rozella", "Rozelle", "Rozina", "Rubetta", "Rubi", "Rubia", "Rubie", "Rubina", "Ruby", "Ruella", "Ruperta", "Ruth", "Ruthann", "Ruthanne", "Ruthe", "Ruthi", "Ruthie", "Ruthy", "Ryann", "Rycca", "Saba", "Sabina", "Sabine", "Sabra", "Sabrina", "Sacha", "Sada", "Sadella", "Sadie", "Sal", "Sallee", "Salli", "Sallie", "Sally", "Sallyann", "Sallyanne", "Salome", "Sam", "Samantha", "Samara", "Samaria", "Sammy", "Samuela", "Samuella", "Sande", "Sandi", "Sandie", "Sandra", "Sandy", "Sandye", "Sapphira", "Sapphire", "Sara", "Sara-Ann", "Saraann", "Sarah", "Sarajane", "Saree", "Sarena", "Sarene", "Sarette", "Sari", "Sarina", "Sarine", "Sarita", "Sascha", "Sasha", "Sashenka", "Saudra", "Saundra", "Savina", "Sayre", "Scarlet", "Scarlett", "Scotty", "Sean", "Seana", "Secunda", "Seka", "Sela", "Selena", "Selene", "Selestina", "Selia", "Selie", "Selina", "Selinda", "Seline", "Sella", "Selle", "Selma", "Sena", "Sephira", "Serena", "Serene", "Shaina", "Shaine", "Shalna", "Shalne", "Shamit", "Shana", "Shanda", "Shandee", "Shandie", "Shandra", "Shandy", "Shane", "Shani", "Shanie", "Shanna", "Shannah", "Shannen", "Shannon", "Shanon", "Shanta", "Shantee", "Shara", "Sharai", "Shari", "Sharia", "Sharie", "Sharity", "Sharl", "Sharla", "Sharleen", "Sharlene", "Sharline", "Sharna", "Sharon", "Sharona", "Sharra", "Sharron", "Sharyl", "Shaun", "Shauna", "Shawn", "Shawna", "Shawnee", "Shay", "Shayla", "Shaylah", "Shaylyn", "Shaylynn", "Shayna", "Shayne", "Shea", "Sheba", "Sheela", "Sheelagh", "Sheelah", "Sheena", "Sheeree", "Sheila", "Sheila-Kathryn", "Sheilah", "Sheilakathryn", "Shel", "Shela", "Shelagh", "Shelba", "Shelbi", "Shelby", "Shelia", "Shell", "Shelley", "Shelli", "Shellie", "Shelly", "Shena", "Sher", "Sheree", "Sheri", "Sherie", "Sheril", "Sherill", "Sherilyn", "Sherline", "Sherri", "Sherrie", "Sherry", "Sherye", "Sheryl", "Shilpa", "Shina", "Shir", "Shira", "Shirah", "Shirl", "Shirlee", "Shirleen", "Shirlene", "Shirley", "Shirline", "Shoshana", "Shoshanna", "Shoshie", "Siana", "Sianna", "Sib", "Sibbie", "Sibby", "Sibeal", "Sibel", "Sibella", "Sibelle", "Sibilla", "Sibley", "Sibyl", "Sibylla", "Sibylle", "Sidoney", "Sidonia", "Sidonnie", "Sigrid", "Sile", "Sileas", "Silva", "Silvana", "Silvia", "Silvie", "Simona", "Simone", "Simonette", "Simonne", "Sindee", "Sinead", "Siobhan", "Sioux", "Siouxie", "Sisely", "Sisile", "Sissie", "Sissy", "Sofia", "Sofie", "Solange", "Sondra", "Sonia", "Sonja", "Sonni", "Sonnie", "Sonnnie", "Sonny", "Sonya", "Sophey", "Sophi", "Sophia", "Sophie", "Sophronia", "Sorcha", "Sosanna", "Stace", "Stacee", "Stacey", "Staci", "Stacia", "Stacie", "Stacy", "Stafani", "Star", "Starla", "Starlene", "Starlin", "Starr", "Stefa", "Stefania", "Stefanie", "Steffane", "Steffi", "Steffie", "Stella", "Stepha", "Stephana", "Stephani", "Stephanie", "Stephannie", "Stephenie", "Stephi", "Stephie", "Stephine", "Stesha", "Stevana", "Stevena", "Stoddard", "Storey", "Storm", "Stormi", "Stormie", "Stormy", "Sue", "Sue-elle", "Suellen", "Sukey", "Suki", "Sula", "Sunny", "Sunshine", "Susan", "Susana", "Susanetta", "Susann", "Susanna", "Susannah", "Susanne", "Susette", "Susi", "Susie", "Sussi", "Susy", "Suzan", "Suzann", "Suzanna", "Suzanne", "Suzetta", "Suzette", "Suzi", "Suzie", "Suzy", "Suzzy", "Sybil", "Sybila", "Sybilla", "Sybille", "Sybyl", "Sydel", "Sydelle", "Sydney", "Sylvia", "Sylvie", "Tabatha", "Tabbatha", "Tabbi", "Tabbie", "Tabbitha", "Tabby", "Tabina", "Tabitha", "Taffy", "Talia", "Tallia", "Tallie", "Tally", "Talya", "Talyah", "Tamar", "Tamara", "Tamarah", "Tamarra", "Tamera", "Tami", "Tamiko", "Tamma", "Tammara", "Tammi", "Tammie", "Tammy", "Tamra", "Tana", "Tandi", "Tandie", "Tandy", "Tani", "Tania", "Tansy", "Tanya", "Tara", "Tarah", "Tarra", "Tarrah", "Taryn", "Tasha", "Tasia", "Tate", "Tatiana", "Tatiania", "Tatum", "Tawnya", "Tawsha", "Teane", "Ted", "Tedda", "Teddi", "Teddie", "Teddy", "Tedi", "Tedra", "Teena", "Tella", "Teodora", "Tera", "Teresa", "TeresaAnne", "Terese", "Teresina", "Teresita", "Teressa", "Teri", "Teriann", "Terina", "Terra", "Terri", "Terri-Jo", "Terrianne", "Terrie", "Terry", "Terrye", "Tersina", "Teryl", "Terza", "Tess", "Tessa", "Tessi", "Tessie", "Tessy", "Thalia", "Thea", "Theada", "Theadora", "Theda", "Thekla", "Thelma", "Theo", "Theodora", "Theodosia", "Theresa", "Theresa-Marie", "Therese", "Theresina", "Theresita", "Theressa", "Therine", "Thia", "Thomasa", "Thomasin", "Thomasina", "Thomasine", "Tia", "Tiana", "Tiena", "Tierney", "Tiertza", "Tiff", "Tiffani", "Tiffanie", "Tiffany", "Tiffi", "Tiffie", "Tiffy", "Tilda", "Tildi", "Tildie", "Tildy", "Tillie", "Tilly", "Tim", "Timi", "Timmi", "Timmie", "Timmy", "Timothea", "Tina", "Tine", "Tiphani", "Tiphanie", "Tiphany", "Tish", "Tisha", "Tobe", "Tobey", "Tobi", "Tobie", "Toby", "Tobye", "Toinette", "Toma", "Tomasina", "Tomasine", "Tomi", "Tomiko", "Tommi", "Tommie", "Tommy", "Toni", "Tonia", "Tonie", "Tony", "Tonya", "Tootsie", "Torey", "Tori", "Torie", "Torrie", "Tory", "Tova", "Tove", "Trace", "Tracee", "Tracey", "Traci", "Tracie", "Tracy", "Trenna", "Tresa", "Trescha", "Tressa", "Tricia", "Trina", "Trish", "Trisha", "Trista", "Trix", "Trixi", "Trixie", "Trixy", "Truda", "Trude", "Trudey", "Trudi", "Trudie", "Trudy", "Trula", "Tuesday", "Twila", "Twyla", "Tybi", "Tybie", "Tyne", "Ula", "Ulla", "Ulrica", "Ulrika", "Ulrike", "Umeko", "Una", "Ursa", "Ursala", "Ursola", "Ursula", "Ursulina", "Ursuline", "Uta", "Val", "Valaree", "Valaria", "Vale", "Valeda", "Valencia", "Valene", "Valenka", "Valentia", "Valentina", "Valentine", "Valera", "Valeria", "Valerie", "Valery", "Valerye", "Valida", "Valina", "Valli", "Vallie", "Vally", "Valma", "Valry", "Van", "Vanda", "Vanessa", "Vania", "Vanna", "Vanni", "Vannie", "Vanny", "Vanya", "Veda", "Velma", "Velvet", "Vena", "Venita", "Ventura", "Venus", "Vera", "Veradis", "Vere", "Verena", "Verene", "Veriee", "Verile", "Verina", "Verine", "Verla", "Verna", "Vernice", "Veronica", "Veronika", "Veronike", "Veronique", "Vi", "Vicki", "Vickie", "Vicky", "Victoria", "Vida", "Viki", "Vikki", "Vikkie", "Vikky", "Vilhelmina", "Vilma", "Vin", "Vina", "Vinita", "Vinni", "Vinnie", "Vinny", "Viola", "Violante", "Viole", "Violet", "Violetta", "Violette", "Virgie", "Virgina", "Virginia", "Virginie", "Vita", "Vitia", "Vitoria", "Vittoria", "Viv", "Viva", "Vivi", "Vivia", "Vivian", "Viviana", "Vivianna", "Vivianne", "Vivie", "Vivien", "Viviene", "Vivienne", "Viviyan", "Vivyan", "Vivyanne", "Vonni", "Vonnie", "Vonny", "Wallie", "Wallis", "Wally", "Waly", "Wanda", "Wandie", "Wandis", "Waneta", "Wenda", "Wendeline", "Wendi", "Wendie", "Wendy", "Wenona", "Wenonah", "Whitney", "Wileen", "Wilhelmina", "Wilhelmine", "Wilie", "Willa", "Willabella", "Willamina", "Willetta", "Willette", "Willi", "Willie", "Willow", "Willy", "Willyt", "Wilma", "Wilmette", "Wilona", "Wilone", "Wilow", "Windy", "Wini", "Winifred", "Winna", "Winnah", "Winne", "Winni", "Winnie", "Winnifred", "Winny", "Winona", "Winonah", "Wren", "Wrennie", "Wylma", "Wynn", "Wynne", "Wynnie", "Wynny", "Xaviera", "Xena", "Xenia", "Xylia", "Xylina", "Yalonda", "Yehudit", "Yelena", "Yetta", "Yettie", "Yetty", "Yevette", "Yoko", "Yolanda", "Yolande", "Yolane", "Yolanthe", "Yonina", "Yoshi", "Yoshiko", "Yovonnda", "Yvette", "Yvonne", "Zabrina", "Zahara", "Zandra", "Zaneta", "Zara", "Zarah", "Zaria", "Zarla", "Zea", "Zelda", "Zelma", "Zena", "Zenia", "Zia", "Zilvia", "Zita", "Zitella", "Zoe", "Zola", "Zonda", "Zondra", "Zonnya", "Zora", "Zorah", "Zorana", "Zorina", "Zorine", "Zsa", "Zsa", "Zsazsa", "Zulema", "Zuzana", "Mikako", "Kaari", "Gita", "Geeta"};
        String name = maleNames[(int)(Math.random()*maleNames.length)];
        if(female){
            name = femaleNames[(int)(Math.random()*femaleNames.length)];
        }
        return name;
    }
}
