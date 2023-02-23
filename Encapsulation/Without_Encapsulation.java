package Java.Encapsulation;

class Student
{
        int age;
        String name;

       public void show()
       {
           System.out.println(age+" "+name);
       }
}
public class Without_Encapsulation{
       public static void main(String[] args){
       Student obj=new Student();
       obj.age=18;     // the values are getting set here
       obj.name="John";

       obj.show();    // the output will give default values as values are not set
       }
}
