package Java.OOPS;

class Calc
    {
	    public int add(int n1, int n2)
	    {
		int result=n1+n2;
		return result;
	    }

	    public int add(int n1, int n2,int n3)
	    {
		int result=n1+n2+n3;
		return result;
	    }

	    public double add(double n1, double n2)
	    {
		double result=n1+n2;
		return result;
	    }
	}

    public class Method_Overloading {
        public static void main(String[] agrs)
        {
	    Calc obj=new Calc();
	    int result=obj.add(4,3);
        // since two parameters are used so that method will be called which has two parameters
	    int res1=obj.add(4,3,2);
        // since three parameters are there so method having three parameters is called
	    System.out.println(result);
	    System.out.println(res1);
	    }

    }
