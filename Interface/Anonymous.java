@FunctionalInterface
interface Car
{ 
	void drive();
}

public class Anonymous{
	public static void main(String args[]){
		Car obj= new Car()
        {
				public void drive()
				{
						 System.out.println("Driving...");    // anonymous inner class
				}
        };

		obj.drive();
	}
} 