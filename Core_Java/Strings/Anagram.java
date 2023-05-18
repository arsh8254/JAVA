package Java.Strings;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) 
    {
        // String str1 = "School Master";
        // String str2 = "The Classroom Java";
        String str1 = "keep";
        String str2 = "peek";

        // str1 = str1.replace(" ", "");  // we replace spaces with empty
        // str2 = str2.replace(" ", "");  // same as above

        // str1 = str1.toLowerCase();  // converting all leeters to lowercase
        // str2 = str2.toLowerCase();

        char [] ar1 = str1.toCharArray();   // converting into character array
        char [] ar2 = str2.toCharArray();

        Arrays.sort(ar1);    // sorting arrays using given methods
        Arrays.sort(ar2);

        if(Arrays.equals(ar1, ar2))
        {
            System.out.println("Its an Anagram");
        }
        else 
        {
            System.out.println("Its not an Anagram");
        }
    }
    
}