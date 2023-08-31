// time complexity: O(m * n)
// space complexity: O(1)

import java.util.*;
import java.io.*;

class Matrix_Rotation {
    
    public static void rotatedMatrix(int[][] arr){
        // Step 1: Transpose the 2D array
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0; i<m; i++){
            // if we start using j=0, we will do the transpose twice so nothing will change.
            for(int j=i; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Swap the left and right side column elements
        for(int i=0; i<m; i++){
            int li = 0;
            int ri = n-1;

            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

            li++;
            ri--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // function calling -- implementation is written elsewhere. we just call it here
        rotatedMatrix(arr);

        // mat will store each element of array and print as string
        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}