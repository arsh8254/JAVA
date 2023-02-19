package Java.Static_Keyword;

public class Intro{
        static int age;
                static{
                        age = 18;
                        System.out.println("Static block gets executed firstly here");
                        System.out.println(age);
                        }


        static void disp(){
                System.out.println("static method will get executed if we call it inside main method");
                }

        public static void main(String[] args) {
                System.out.println("Main method gets executed secondly here");
                // calling static method without creating any object of class
                disp();
        }
}
