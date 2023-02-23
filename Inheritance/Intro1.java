package Inheritance;


class Human1 
{
    private String name;
    int age;

    Human1()
    {
        System.out.println("Human class Constructor");
    }

    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1  
{
    // public Studemt1()
    // {
        //super();    // super method will call human class constructor
    // }
    void disp()
    {
        System.out.println("The age is : " + age);
       // System.out.println(" The Name is : " + name);    // private members can't be called
    }
}

public class Intro1 
{
    public static void main(String[] args) 
    {
        Student1 st1=new Student1();
        st1.sleep();
        st1.disp();
        
    }
    
}
