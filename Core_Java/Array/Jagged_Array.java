package Java.Array;

public class Jagged_Array {
    public static void main(String[] args) {
                 int nums[][]={
                                {3,9,7,5},
                                {1,5},                  // jagged array
                                {8,4,5}
                             };
            for(int i=0;i<=2;i++)
            {
                for(int j=0;j<nums[i].length;j++)       // asking the array for its length
                {
                      System.out.print(nums[i][j]+ " ");
                }
                    System.out.println();
            }
    }
}
