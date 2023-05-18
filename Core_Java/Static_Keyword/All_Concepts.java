package Java.Static_Keyword;

class Student
{
    int age = 5;            // instance variable, non - static variable
    static String school;  // non - instance variable, static variable

    static 
    {
        school = "PW";     // static block
    }


    public void show()   // non static method
    {
        // static variable can be accessed in non-static method
        System.out.println("in show method " + age + " " + school);
    }


    public static void study()       // static method
    {
        // non-static variable cannot be accessed in static method
        System.out.println("studying ");  
        System.out.println(school);    
    }
}

public class All_Concepts
{

    static      // static block
    {
        System.out.println("in static block");
    }

    public static void main(String[] args) {
       
        System.out.println("in main method");

        Student obj = new Student();

        Student.study();
        obj.age = 19;     // age changed here
        obj.school = "PWSkills";   // school changed here
        
        Student obj1 = new Student();
        System.out.println(obj1.school);
       
        obj.show();     // in show method 19 PWSkills
        obj1.show();    // in show method 5 PWSkills
         // we haven't set any new values so it will take old values
    }    
}
