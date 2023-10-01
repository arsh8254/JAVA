// time complexity: O(n)
import java.util.*;

public class Valid_Parenthesis {
    public static boolean isValid(String str){
        char[] chars = str.toCharArray();

        Stack <Character> stack1 = new Stack<>();

        for(char ele:chars){
            // if the element contains open bracket, push it to the stack
            if(ele == '(' || ele == '[' || ele == '{'){
                stack1.push(ele);
                continue;
            }

            // if no opening bracket is found -- might be only closing bracket are in string
            else if(stack1.empty()){
                return false;   // invalid
            }

            char top = stack1.pop();
            if(top == '(' && ele != ')'){
                return false;    // invalid
            }
            else if(top == '[' && ele != ']'){
                return false;    // invalid
            }
            else if(top == '{' && ele != '}'){
                return false;    // invalid
            }
        }
            // is the stack empty or not
            return(stack1.empty() == true);    // valid
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Is the given string valid? " + isValid(str));
        
    }
}