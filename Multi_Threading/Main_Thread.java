
public class Main_Thread
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread");
        System.out.println("Before changing name and priority");
        String name = Thread.currentThread().getName();
        System.out.println("The name of main thread is "+ name);
        System.out.println("the priority of main thread is "+ Thread.currentThread().getPriority());

        System.out.println("After changing name and priority");
        Thread t = Thread.currentThread();
        // we don't create object of thread class. It has static methods in it.
        t.setName("PW");
        t.setPriority(1);

        String name1=Thread.currentThread().getName();
        System.out.println("The name of main thread is "+ name1);
        System.out.println("the priority of main thread is "+ Thread.currentThread().getPriority());
     
   
    }
    
}
