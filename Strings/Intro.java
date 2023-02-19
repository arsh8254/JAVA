package Java.Strings;

public class Intro {
        public static void main(String[] args) {
                String brand = "apple";   // string construction using literals
                System.out.println(brand);
                brand.concat("wastage");  //concat will not work as it is immutable
                System.out.println(brand);

                StringBuilder brand1 = new StringBuilder("nokia");  // string construction using new keyword
                System.out.println(brand1);
                brand1.append(" useful");
                System.out.println(brand1);   //append will work as it is mutable
                //append is similar to concat. it adds two strings together
}
        }       
