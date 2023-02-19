package Java.OOPS;


class Calc1
    {
	    public int add(int n1, int n2)
	    {
		    int result=n1+n2;
		    return result;
	    }
	
    }

    public class ClassCreation {
    public static void main(String[] agrs){

	    Calc1 obj=new Calc1();
	    int result=obj.add(4,3);
	    System.out.println(result);

    }
}
