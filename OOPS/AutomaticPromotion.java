package Java.OOPS;


class Calc2
{
    // it will do automatic promotion as per the data type used by us
	public void show(byte num)
	{
		System.out.println("byte" +num);
	}
	public void show(short num)
	{
		System.out.println("short" +num);
	}
	public void show(char num)
	{
		System.out.println("char" +num);
	}
	public void show(int num)
	{
		System.out.println("int" +num);
	}
	public void show(double num)
	{
		System.out.println("double" +num);
	}
}

    public class AutomaticPromotion {
    public static void main(String[] agrs){

	        Calc2 obj=new Calc2();
	        char b=80;
	        obj.show(b);
	    }
    }
