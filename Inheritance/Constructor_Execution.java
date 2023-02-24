
class Demo1    // it's parent class is object class
{
    int a, b;
    
    public Demo1()   
    {
        System.out.println("Parent class Constructor");
    }
    public Demo1(int x, int y)
    {
        System.out.println("parameterized Parent  class Constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    {
        this(10,20);     // it calls constructor within the same class
        System.out.println("Child class Constructor");
    }

    public Demo2(int x, int y)
    {
        //super();      // will be used by default also.  It calls the parent class constructor
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}
public class Constructor_Execution
{
    public static void main(String[] args) 
    {
        
        Demo2 d=new Demo2();     // it will call zero parametrized constructor

        //Demo2 d2=new Demo2(10,20);
    }
    
}
