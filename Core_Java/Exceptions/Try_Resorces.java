import java.util.Scanner;

public class Try_Resources
	{
	public static void main(String[] args)
	{
		int num=0;
		
		// try with Resources
        // resource is passed as argument to try block
		try(Scanner sc=new Scanner(System.in))
		{
			num=sc.nextInt();
		}
        // resource closed automatically


		System.out.println(num);
		
	}
}

