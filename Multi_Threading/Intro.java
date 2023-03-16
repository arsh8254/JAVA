import java.util.Scanner;
// three independent tasks are there
public class Intro
{
    public static void main(String[] args) 
    {
        System.out.println("Calculation Task1 Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;
        System.out.println(res);
        System.out.println("Calculation Task1 Ended");



        System.out.println("Printing Task2 Started");
        for(int i=0;i<4;i++)
        {
            System.out.println("*");
        }
        System.out.println("Printing Task2 Ended");



        System.out.println("Displaying task3 started");
        for(int i=0;i<3;i++)
        {
            System.out.println("Focus is important to master skills");
        }
        System.out.println("Displaying import message task ended");
        
    }
    
}
