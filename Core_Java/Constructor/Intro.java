package Java.Constructor;

class Student
{
    private String name;
    private int age;

    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    // public void setName(String name)
    // {
    //     this.name=name;           // since we are using constructors we won't use getters and setters
    // }
    // public void setAge(int age)
    // {
    //     this.age=age;
    // }


    // public String getName()
    // {
    //     return name;
    // }
    // public int getAge()
    // {
    //     return age;
    // }
}


public class Intro 
{
    public static void main(String[] args) 
    {
        Student st=new Student("Rahul", 10);   // setting values at time of object creation

        //Student st1=new Student();
       // st.disp();

        // st.setName("Rahul");
        // st.setAge(10);

        //String name=st.getName();
       // System.out.println(name);
        //System.out.println(st.getName());
       // int age=st.getAge();
       // System.out.println(age);

    }
    
}
