
enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class Enums1 
{

    enum Result         // can be defined within or outside the class
    {
        PASS, FAIL, NR;
    }
    
    public static void main(String[] args) 
    {

        Week we=Week.MON;
        System.out.println(we);

        int index =Week.MON.ordinal();   // ordinal method gives the index of element
        System.out.println(index);

       Week[] wr=Week.values();
       for(Week w: wr)
       {
        System.out.println(w + " : " + w.ordinal());
       }

        // Result r=Result.PASS;
        // System.out.println(r);
        
    }
    
}
