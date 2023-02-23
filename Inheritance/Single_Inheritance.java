package Inheritance;


class Animal 
{
    public void eat()
    {
        System.out.println("Animal eats everyday");
    }
    
}

class Tiger extends Animal
{

}


public class Single_Inheritance 
{
    public static void main(String[] args) 
    {
      Tiger t=new Tiger();
      t.eat();
      
    }   
}
