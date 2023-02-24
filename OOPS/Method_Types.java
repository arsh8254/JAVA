package OOPS;

class AeroPlane
{
    public void takeOff()     // inherited method
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()     // over-ridden method
    {
        System.out.println("AeroPlane is Flying");
    }
}

class CargoPlane extends AeroPlane
{
   public void fly()      // over-riding method
   {
    System.out.println("Cargoplane flies at lower height");
   }
    public void carryGoods()     // specialised method
    {
        System.out.println("CargoPlane carries goods");
    }
}
class PassengerPlane extends AeroPlane
{
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger()
    {
        System.out.println("PassengerPlane carries passenger");
    }

}
class Method_Types
{
    public static void main(String[] args) 
    {
        CargoPlane cp=new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp=new PassengerPlane();
        pp.takeOff();
        pp.fly();
       
        
    }
}
