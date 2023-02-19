package Java.Encapsulation;

class Student
{
	private int age;
	private String name;

	public void setAge(int age)   // setter method
	{
		this.age =age;
	}

	public int getAge()    // getter method
	{
		return age; 
	}

	public void setName(String name)   // setter method
	{
		this.name =name;
	}

	public String getName()      // getter method
	{
		return name; 
	}

	public void show()
	{
	System.out.println(age + " " + name);
	}
}
public class AllTopics{

    public static void main(String[] args){
	    Student obj=new Student();
	    Student obj1=new Student();
	        obj.setAge(18);
	        obj1.setAge(25);         // we are setting values
	        obj.setName("Navin");
	        obj1.setName("kiran");

            int Stud1Age = obj.getAge();   // we are getting values
            String Stud1Name = obj.getName();
	        obj.show();
	        obj1.show();
	}
}
