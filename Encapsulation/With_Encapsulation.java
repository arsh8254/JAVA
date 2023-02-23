package Java.Encapsulation;

class Student
{
	private int age;
	private String name;

	public void setData(int age, String name)
	{
		this.age =age;
		this.name =name;
	}
	public void show()
	{
	System.out.println(age + " " + name);
	}
}
public class With_Encapsulation{

	public static void main(String[] args){

	Student obj = new Student();
    Student obj1 = new Student();
	obj.setData(18, "rahul");     // setting data for first object
    obj1.setData(25, "navin");     // setting data for second object
	obj.show();        // then we are printing them
	}
}