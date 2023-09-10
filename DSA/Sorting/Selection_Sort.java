// time complexity: O(n^2)
// space complexity: O(1)

import java.util.*;
import java.io.*;

public class Selection_Sort {
    // Implementation of selection sort
    public static void selectionSort(int[] arr){
        for (int i=0, i< arr.Length, i++){
            // min_indx stores the index number of minimum value at each iteration
            int min_indx = i;
            for (int j=i+1, j< arr.Length, j++){
                if (arr[j] < arr[min_indx]){
                min_indx = j;
            }
        }
    }
}

    if(min_indx != i){
        // swap between arr[min_indx] and arr[i]
        int temp = arr[min_indx];
        arr[min_indx] = arr[i];
        arr[i] = temp;
    }

public static void main(String[] args){
        int[] arr = {20, 50, 25, 67, 79, 12, 15};

        //function calling
        selectionSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}