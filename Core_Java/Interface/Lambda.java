@FunctionalInterface     // to define that we are using functional interface -- only one method
                         // it is not compulsory to write but good practice
interface Car
{
    void drive(int avg, int topSpeed);  // only one method is allowed
}


public class Lambda {
    public static void main(String[] args) {
        // syntax for using lambda expressions
        //Car obj = () -> System.out.println("Driving");  // zero parameter

        //Car obj = avg  -> System.out.println("Running");    // one parameter
                                                              // both small brackets and datatype is optional in one parameter syntax

        Car obj = (avg, topSpeed) -> System.out.println("Running with avg " + avg  + ":" +topSpeed);    // multiple parameters
        
        obj.drive(16, 140);

       
    }
}