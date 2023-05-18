package OOPS;


class AeroPlane2
{
    public void takeOff()
    {
       
        System.out.println("AeroPlane is taking off");
    }

    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}

class CargoPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }  
}


class PassengerPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
}


class FighterPlane2 extends AeroPlane2
{
    public void takeOff()
    {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly()
    {
    System.out.println("FighterPlane flies at high height");
    }
}

class Airport      // this class does the real polymorphism
{
    public void poly(AeroPlane2 ref)      // ref will store child class address
    {
        ref.takeOff();
        ref.fly();

        System.out.println("-------------");    // just for clear output
    }
}

public class Polymorphism2 
{

    public static void main(String[] args) 
    {
        CargoPlane2 cp=new CargoPlane2();
        
        PassengerPlane2 pp=new PassengerPlane2();

        FighterPlane2 fp=new FighterPlane2();

        // AeroPlane2 fp=new FighterPlane2();    // this ia also correct

        Airport a=new Airport();
        a.poly(cp);
        a.poly(pp);             // assigning address of each child class 
        a.poly(fp);




        // cp.takeOff();
        // cp.fly();

        // pp.takeOff();           // without polymorphismm
        // pp.fly();

        // fp.takeOff();
        // fp.fly();

    
    }
    
}
