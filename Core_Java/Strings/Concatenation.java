package Java.Strings;

public class Concatenation {
    public static void main(String[] args) {
            String s1 = new String("aryan");
                s1.concat("arsh");  // variable points to old value here
                System.out.println(s1);
                s1 = s1.concat("arsh");
                System.out.println(s1);  // variable points to new value here

               System.out.println(s1.substring(1, 3));
    }
}
