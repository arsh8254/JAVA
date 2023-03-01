Interface Demo
{
        int num;     // value must be assigned
        int num=6;

        // void show()
        // {
        //     // it can't contain the body
        // }

        void show();
}

public Class Intro
{
     public static void main(String[] args) 
    {
            System.out.println(num);   // it gives error
            System.out.println(Demo.num);   // it is valid

            Demo a=new Demo();  // object can't be created

    }   
}