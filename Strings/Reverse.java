package Java.Strings;

public class Reverse {
    public static void main(String[] args) 
    {
        // String str1 = "pwjava";
        // String str2 = "";   // empty string to store required value 
        // for(int i = str1.length()-1; i>=0; i--)  // to traverse in reverse direction
        // {
        //     str2 = str2 + str1.charAt(i);
        // }
        // System.out.println("Before Reversing " + str1);
        // System.out.println("After Reversing " +str2);



        // String str1 = "pwskill java";
        // String str2 = "";  // empty string to store required values
        // String sarr[] = str1.split(" ");  // it splits the elements and stores into an array

        // for(int i = sarr.length-1 ; i>=0; i--)   // here length is not a method but property
        // {
        //     str2 = str2 + sarr[i] + " ";
        // }
        
        // System.out.println("Before Reversing: " + str1);
        // System.out.println("After Reversing: " +str2);



        String str1 = "pwskill java";
        String str2 = "";     // empty string
        

        // for(int i = str1.length()-1 ; i>=0; i--)
        // {
        //     str2 = str2 + str1.charAt(i);
        // }
        
        // System.out.println("Before Reversing: " + str1);
        // System.out.println("After Reversing: " +str2);

      
        String sarr[] = str1.split(" ");

        for(String elem : sarr)    // the array stores two string elements here 
        {
            for(int i = elem.length()-1 ; i>=0; i--)
            {
                str2 = str2 + elem.charAt(i);
            }
            str2 = str2 + " ";
        }
        
        System.out.println("Before Reversing: " + str1);
        System.out.println("After Reversing: " + str2);
        
    }
    
}
