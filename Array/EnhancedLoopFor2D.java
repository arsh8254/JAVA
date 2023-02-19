package Java.Array;

public class EnhancedLoopFor2D {
    public static void main(String[] args) {
            int nums[][]={
                            {3,9,7,5},
                            {1,5,6,5},
                            {8,4,5,6}
                        };
        for(int a[]:nums)   // first element of above array will be an array itself represented by a[]
            {
                for(int b:a)    // to represent individual elements we use variable b; a- name of above array
                {
                   System.out.print(b + " ");
                }
                     System.out.println();
            } 
    }
}
