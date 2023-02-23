package Java.Constructor;

class Student1       //extends Object
{
    private String name;
    private int age;

    public Student1()
    {
        // super();
        this("Rohit", 19);
        System.out.println("Default Constructor is called");
        name="Rohan";
        age=18;
    }
    public Student1(String name)
    {
        this();
        this.name=name;
        age=19;
    }
    public Student1(String name, int age)
    {
        
        this.name=name;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor_Overloading 
{
    public static void main(String[] args) 
    {
        Student1 st1=new Student1();    // zero parameter
        st1.disp();

        Student1 st2=new Student1("Rahul");     // one parameter
        st2.disp();

        Student1 st3 = new Student1("Shyam", 20);    // two parameters
        st3.disp();

        
    }
}
