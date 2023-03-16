// thread creation example

import java.util.*;

class Calc extends Thread{      // calc is a custom thread

    public void run()
    {
        System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");
    }
}

class Message extends Thread{       // message is custom thread

    public void run()
    {
        System.out.println("Displaying important message task started");
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);  // it pauses the thread for 2000 mili-second
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        
        System.out.println("Displaying import message task ended");

    }
}



public class Example1 
{
    public static void main(String[] args) 
    {
        
        System.out.println("Main Thread started");

        Calc t1=new Calc();

        Message t2=new Message();

        t1.start();
        t2.start();
        
    }
    
}
