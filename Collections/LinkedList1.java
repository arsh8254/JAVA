import java.util.*;

public class LinkedList1 
{
    public static void main(String[] args) 
    {
        LinkedList ll1=new LinkedList();

        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);

        System.out.println(ll1);
        System.out.println(ll1.get(1));

        System.out.println(ll1.indexOf(300));
        System.out.println(ll1.lastIndexOf(300));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());

        ll1.push(10);
        System.out.println(ll1);

        System.out.println(ll1.pop());


       
         // LinkedList ll2=new LinkedList();
        // ll2.add("PWskill");
        // ll2.add(1);
        // ll2.add('j');
        // System.out.println(ll2);

        // LinkedList ll3=new LinkedList();
        // ll3.add(10);
        // ll3.add(20);
        // ll3.add(30);

        // ll3.addFirst("PW");     // adds data at frontend
        // ll3.addLast(100);        // adds data at rear end

        // System.out.println(ll3);

        // ll3.add(2, 10);          //adds data at given index
        // System.out.println(ll3);

        // System.out.println(ll3.peek());     //peek shows the first object of collection
        // System.out.println(ll3);

        // System.out.println(ll3.poll());      //poll shows and removes first element from collection
        // System.out.println(ll3);

        
    }
    
}
