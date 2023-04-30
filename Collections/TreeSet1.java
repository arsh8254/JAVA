
import java.util.*;
public class TreeSet1 
{
    public static void main(String[] args) 
    {

       TreeSet ts=new TreeSet();
       ts.add(100);
       ts.add(50);
       ts.add(150);
       ts.add(25);
       ts.add(75);
       ts.add(125);
       ts.add(175);

       System.out.println(ts);

       // ts.add(100);
       //System.out.println(ts);

       System.out.println(ts.higher(50));   //gives one value higher than 50
       System.out.println(ts.lower(50));    //gives one value lower than 50

       System.out.println(ts.ceiling(40));  //if 40 is not present then it  will give higher value or 40 only if 40 is present in collection
       System.out.println(ts.floor(40));    // same as above but lower value

       System.out.println(ts.ceiling(50));
       System.out.println(ts.floor(50));

       
    }
    
}
