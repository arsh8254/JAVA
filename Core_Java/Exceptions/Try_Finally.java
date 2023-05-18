import java.util.Scanner;

public class Try_Finally
	{
	public static void main(String[] args)
	{
		int num=0;
		Scanner sc=new Scanner(System.in);
        // resource opened here
		try
		{
			num = sc.nextInt();
		}

		finally
		{
		    sc.close();   // resource closed here
		    System.out.println("Resources Closed");
		}

		System.out.println(num);
		
	}
}