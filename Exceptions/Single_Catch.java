public class Single_Catch
	{
	public static void main(String[] args)
	{
		int num1 = 6;
		int num2 = 0;
		int result = 0;

		try
		{
			result = num1/num2;
			System.out.println("in try block");
		}

		catch(Exception obj)  // obj stores the exception value which can be printed
		{
			System.out.println("Something went wrong" + obj);   // the exception type is also printed
		}
        
        System.out.println(result);
		System.out.println("Bye");
	}
}
