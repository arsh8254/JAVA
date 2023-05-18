
import java.util.*;

class Employee
{
    private String name;
    private int empId;

    public Employee(String name, int empId)
    {
        this.name=name;
        this.empId=empId;
    }

    public String toString()  // method over-riding to print values and not address
    {
        return empId + "";
    }

    @Override
    public void finalize()
    {
        System.out.println("clean up work by Garbage Collector before de-allocating memory from heap");

    }

}


public class WeakHashMap1
{
    public static void main(String[] args) 
    {

        Employee e=new Employee("Hyder", 171);


        WeakHashMap hm=new WeakHashMap();
        hm.put(e, "Hyder");
        System.out.println(hm);

        e=null;         // eligible for garbage collection

        System.gc();    //invoking garbage collector

        System.out.println(hm);

        System.out.println("Last line of program");
  
    }
    
}
