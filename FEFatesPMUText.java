public class FEFatesPMUText
{
    public static void main(){
        int route = (int)(Math.random()*3);
        FEFatesPMU pmu = new FEFatesPMU();
        Unit[] picks = pmu.generate(route,3,true,true,true,true,true,true,false,false,false,false);
        if(route == 0)
            System.out.println("Fire Emblem Fates: Conquest PMU");
        if(route == 1)
            System.out.println("Fire Emblem Fates: Birthright PMU");
        if(route == 2)
            System.out.println("Fire Emblem Fates: Revelations PMU");
        System.out.println("---");
        for(int x = 0; x < picks.length; x++)
            System.out.println(picks[x]);
    }
}
