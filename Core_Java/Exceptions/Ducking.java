// handling vs ducking

class Demo
{
	public void a() throws Exception  // a throws to main method
	{
		System.out.println("in a");
		int value=9;
		b();   // b method is being called by (a) method

        // try
        // {
        //     b();
        // }
                    // if we wanted to handle in (a) method
        // catch
        // {
        //     System.out.println("some error is there");
        // }
	}
	public void b() throws Exception   // b throws to (a) method
	{
		int num1=9;
		int num2=0;

		int result=num1 / num2;
		System.out.println(result);	
	}
}

public class Ducking
{
	public static void main(String[] agrs)
	{
		Demo obj=new Demo();
		try
        {
            obj.a();
        }
        
        catch
        {
            System.out.println("some error is there");
        }
	}
}