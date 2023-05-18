
import java.util.*;
public class Iterator1
{
    public static void main(String[] args) 
    {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);
        System.out.println(al);


        //for loop
        // for(int i=0;i<al.size();i++)
        // {
        //     // Object o=al.get(i);          //collection store data in form of objects
        //     // System.out.println(o);
        //     System.out.println(al.get(i));
        // }

        // //for each
        // for(Object o:al)         //object refers to each data in collections
        // {
        //     System.out.println(o);
        // }

        Iterator itr= al.iterator();
        while(itr.hasNext())            //to move from left to right
        {
           // Integer i=(Integer)itr.next();        //downcasting to change into integer from object
           System.out.println(itr.next());
        }

        ListIterator litr=al.listIterator(al.size());
        while(litr.hasPrevious())           //to move from right to left
        {
            System.out.println(litr.previous());
        }
        

        
    }
    
}
