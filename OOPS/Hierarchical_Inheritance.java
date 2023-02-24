package OOPS;


class Animal
{
    void disp()
    {
        System.out.println("Animal eats everyday");
    }
}

class Tiger extends Animal
{
    
}

class Lion extends Animal
{

}

class Deer extends Animal
{

}
class Hierarchical_Inheritance
{
    public static void main(String[] args) {
         Deer s= new Deer();
         s.disp();
    }
}
