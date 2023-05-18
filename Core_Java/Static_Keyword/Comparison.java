package Java.Static_Keyword;

class Demo{
        // static method
        static void disp1()
        {
            System.out.println(" it does not need any object for execution");
        }

        // non-static method
        void disp2()
        {
            System.out.println(" it needs an object for execution");
        }
}


public class Comparison {
        public static void main(String[] args) {
        
                Demo.disp1();  // no object creation for static members

                Demo d = new Demo();
                d.disp2();  // object creation is required

    }
}
