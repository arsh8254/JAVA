package Java.Strings;

public class Pangram {
    public static void main(String[] args) 
    {
        
        boolean flag = false;

        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str = str.replace(" ", "");
        char [] ch = str.toCharArray();

        int ar[] = new int[26];  // empty array of size 26

        for(int i=0; i< ch.length; i++)  // traversing through all elements of character array
        {
            ar[ch [i]- 65]++;   
            // LOGIC:-  we created an empty array of integer with size 26
            // if a letter is present in character array(from A to Z),
            // program will convert the value in integer array from 0 to 1
            // if all values are changed from 0 to 1 then its a pangram
            // if any single value also not changed then its not a pangram 
        }

        for(int i=0; i< ar.length; i++)  // traversing through the integer array
        {
            if(ar[i] ==0)   // if at any index the value is zero
            {
                System.out.println("Its not pangram");
                flag = true;
            }
        }
        
        if(flag == false)
        {
            System.out.println("Its pangram");
        }
        
        }
    
}
