interface A 
{
    void show();
    default void config()      // default methods are non- static in nature
    {
        System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class Java8Fe {
    public static void main(String[] args) {
        A.abc();        // static method can be called without object creation
        //A.config();     // it gives error as it needs object
        A obj = new B();   // non-static object needs object creation
        obj.config();
        obj.show();
    }
}