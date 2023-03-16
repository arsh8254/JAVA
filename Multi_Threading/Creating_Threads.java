// custom created thread
class MyThread extends Thread{

    public void run()
    {
        System.out.println("Child Thread");
    }
}


public class Creating_Threads
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread"); 

        MyThread t = new MyThread();
        t.start();         // start method will execute the tasks.
                           // we don't call the run method.

    }
    
}
