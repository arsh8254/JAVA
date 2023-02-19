package Java.Array;

public class Exception {
    public static void main(String[] args) {
        int nums[]= {1,3,5,6};
       // System.out.println(nums[4]);    // this line gives exception
			System.out.println(nums[nums.length-1]);  // to avoid the exception
			System.out.println("Bye");
    }
}
