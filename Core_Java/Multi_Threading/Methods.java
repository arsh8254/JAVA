
class Printing implements Runnable{

    public void run()
    {
        try{
            for(int i=0;i<2;i++)
            {
                System.out.println("Focus is important");
                Thread.sleep(3000);
            }

        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
    }
}


public class Methods 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Main Thread started");

        Printing p=new Printing();

        Thread t1=new Thread(p);
        System.out.println(t1.isAlive());  // false will be output

        t1.start();
        System.out.println(t1.isAlive());  //  true will be output
        t1.join();
        
        System.out.println("Main Thread Finished the work");

    }
    
}
