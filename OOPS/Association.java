// Association means java supports Has-a and Is-a relationship
// Has-a is of two types- aggregation and composition

class Car
{
      private Engine eng;

//    public Car(Engine eng)        // constructor injection
//    {
//           this.eng=eng;
//    }


   public void setEng(Engine eng)       // setter injection
   {
            this.eng=eng;
   }


   public void start()
   {
         eng.engineStart();
   }
}


class Engine
{

    public void engineStart()
    {
        System.out.println("Car started");
    }

}



// class Student
// {
//     private Heart h;
//     public Student(Heart h)
//     {                            // using constructors
//         this.h=h;               // constructor accepting reference of heart
//     }
//     public void setH(Heart h)
//     {
//         this.h=h;                // using setter to pass heart objects
//     }

//     public void call()
//     {
//         h.heartBeat();
//     }
// }
// class Heart
// {

//     public void heartBeat()
//     {
//         System.out.println("Heart is important");
//     }
// }


public class Association 
{
    public static void main(String[] args) 
    {
        // Heart h=new Heart();

        // Student s=new Student(h);    // passing heart refernce to constructor
        // s.setH(h);                   // passing heart refernce using setters
        
        Engine e=new Engine();

        // Car c=new Car(e);

        c.setEng(e);

        c.start();

        
    }
    
}