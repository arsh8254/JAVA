

class Library implements Runnable
{
    String res1=new String("JAVA Book");
    String res2=new String("SQL Book");         // three books only
    String res3=new String("DSA Book");
   
    public void run()
    {
        String name=Thread.currentThread().getName();
        // if block
        if(name.equals("STUDENT1"))
        {
            try
            {
                Thread.sleep(3000);   // time taken to find books
                synchronized(res1)    // res1 denotes book1
                {
                    System.out.println("Student 1 has taken "+ res1);
                    Thread.sleep(3000);  // time to find second book

                    synchronized(res2)
                    {
                        System.out.println("Student 1 has taken "+ res2);
                        Thread.sleep(3000); // time to find third book

                        synchronized(res3)
                        {
                            System.out.println("Student 1 has taken " + res3);
                            Thread.sleep(3000);   // started reading books
                        }
                    }
                }
            }
           catch(Exception e)
           {
            System.out.println("Some problem");
           }
        }
        // else block
        else
        {
            try
            {
                // student 2 taking books in reverse order
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("Student 2 has taken "+ res3);
                    Thread.sleep(3000);

                    synchronized(res2)
                    {
                        System.out.println("Student 2 has taken "+ res2);
                        Thread.sleep(3000);

                        synchronized(res1)
                        {
                            System.out.println("Student 2 has taken " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            }
           catch(Exception e)
           {
            System.out.println("Some problem");
           }
        }
    }
}

public class Dead_Lock
{
    public static void main(String[] args) 
    {
         Library lib=new Library();

         Thread t1=new Thread(lib);
         Thread t2=new Thread(lib);

         t1.setName("STUDENT1");
         t2.setName("STUDENT2");        // two students

         t1.start();
         t2.start();
    }
    
}
