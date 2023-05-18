package Java.Strings;

public class Comparison {
    public static void main(String[] args) {
            String name1 = "aryan";
            String name4 = "ARYan";
            String name2 = new String("aryan");
            String name3 = "aryan";
            System.out.println(name1==name3);  // same object is referred to in string constant pool
            System.out.println(name1==name2);  // different objects are referred to in heap area
            System.out.println(name1.equals(name2));  // it compares the values of strings
            System.out.println(name1==name4);  // java is case sensitive so different objects are created in scp area
    }
}
