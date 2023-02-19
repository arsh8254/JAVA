package Java.OOPS;


class Test
    {
        int a;
        String name;
    }       


        public class ObjectCreation {
        public static void main(String args[]){
            // declare the variable
            // create the object
        Test obj=new Test();
        Test obj1=new Test();
            System.out.println(obj.a);
            // it will return default value stored in heap as 0
            System.out.println(obj.name);
            // it will retun default vale stored in heap as null
            System.out.println(obj1.a);
            System.out.println(obj1.name);
        }
    }