
import java.util.*;
public class HashTable1 
{
    public static void main(String[] args) 
    {
       Hashtable ht=new Hashtable();
       ht.put(1, "Rohit");
       //ht.put(2, "Rohan");
       ht.put(3, "Ramesh");
       // ht.put(null, "Hyder");
       ht.putIfAbsent(2, "Rohan");  // if this entry is not already present, it will be added otherwise ignored

       System.out.println(ht);


       TreeMap tm=new TreeMap();

       tm.put(2, "Rohit");
       tm.put(1, "Ramesh");
       tm.put(4, "Rahul");
       tm.put(3, "Rohsn");

       System.out.println(tm);
       
    }
    
}
