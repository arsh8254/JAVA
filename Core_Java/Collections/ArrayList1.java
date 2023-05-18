// we import this package to add all the predefined definitions in our program
import java.util.*;

public class ArrayList1
{
    public static void main(String[] args) 
    {
        
        ArrayList al1=new ArrayList();  // object creation of arraylist class

        al1.add(100);
        al1.add(200);   // adding homogeneous values in our collections
        al1.add(300);
        System.out.println(al1);
        System.out.println(al1.contains(200));

        int index=al1.indexOf(300);
        System.out.println(index);
        System.out.println(al1.size());

        al1.ensureCapacity(10);   //reserves minimum storage for us
        al1.trimToSize();       //removes storage which is not used
        System.out.println(al1.size());

        al1.clear();        //deletes the data inserted
        System.out.println(al1);

        List al=new ArrayList();   //giving refernce of parent interface

        al.add(100);
        System.out.println(al);
        

        // System.out.println("****************************************");

        // ArrayList al2=new ArrayList();

        // al2.add("PW Skills");
        // al2.add(1);      //adding heterogeneous values
        // al2.add('j');
        // al2.add(1.1);
        
        // System.out.println(al2);

        // System.out.println("****************************************");

        // al2.add(100);

        // System.out.println(al2);

        // System.out.println("****************************************");


        // ArrayList al3=new ArrayList();

        // al3.add(1);
        // al3.add(2);
        // al3.add(4);
        // System.out.println(al3);

        // System.out.println("After adding collection al2 to al3");

        // al3.addAll(al2);
        // System.out.println(al3);

        // al3.add(2, "PW");   //adding data at particular index. Existing data shifts to next position

        // System.out.println(al3);
        // al3.add(100);

        // System.out.println(al3);
    
    }
    
}
