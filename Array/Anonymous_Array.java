package Java.Array;

class Calc{
        public int add(int nums[]){
           // int result= x + y;
           int result = 0;
           for(int n: nums){
                result= result + n;
           }
            return result;
        }

    }
public class Anonymous_Array {
        public static void main(String[] args) {
                Calc addition = new Calc();
               // int nums[] = {1,3,5,7};       // named array
               
               // int result = addition.add(5, 7);
                int result = addition.add(new int[]{1,3,5,7});   //anonymous array directly in argument
                System.out.println(result);


        }
}
