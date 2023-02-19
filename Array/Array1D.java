package Java.Array;

public class Array1D{
public static void main(String[] args) {
        int a[] = {5,7,9,4,67};
        int num = 56;

        System.out.println(num); // it will print actual value stored in stack
        System.out.println(a);  // it will print address of values stored in heap
        System.out.println(a[2]);  // it will print value at index 2

        // if we wish to print all values we have to use a loop
        for(int i=0; i<5; i++)
        {
            System.out.print(a [i] );  // the value of i is iterated as per condition
        }
}
}