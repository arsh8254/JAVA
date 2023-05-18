interface Computer
{
    void compileCode();   // we can't define body till java7
    default void config()
    {
        // we can define body from Java8 onwards in interface
    }
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors, faster");
    }
}

class Developer
{
    public void buildApp(Computer obj)
    // by using computer type, the code will work for both desktop and laptops
    {
        System.out.println("Building App");
        obj.compileCode();
    }  
}

public class Main {
    public static void main(String[] args) {

        //Laptop obj = new Laptop();
        Computer obj = new Laptop();    // parent class reference and child class object

        Developer dev = new Developer();
        dev.buildApp(obj);
       

    }
}