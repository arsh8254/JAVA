class A
{

    public void show()
    {
        System.out.println("in A show");
    }

    static class B
    {
        public void display()
        {
            System.out.println("in B display");
        }
    }
}


public class InnerDemo {
    public static void main(String[] args) {
        A obj = new A();   // just as we always do
        obj.show();

        A.B obj1 = new A.B();   // for static inner classes
        //A.B obj1 = obj.new B();  // for non-static inner classes
        obj1.display();
    }
}