package Java.Array;

public class Array2D {
        public static void main(String[] args) {
                // declaration of array object
                int nums[][]= new int[3][2];
		//initialisation of array
                nums[0][0]=3;
		nums[0][1]=9;
		nums[1][0]=1;
		nums[1][1]=5;
		nums[2][0]=8;
		nums[2][1]=4;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(nums[i][j]+ " ");
			}
                        // to print in tabular form
			System.out.println();
		} 
        }
}
