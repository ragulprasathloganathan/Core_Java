package core_java.Hybrid2;
interface car
{
    public void fourWheel();
}
interface bike
{
    public void twoWheel();
}

class vehicle
{
    public void engine()
    {
        System.out.println("Started");
    }
}

class AllVehicle extends vehicle implements car, bike
{

    @Override
    public void twoWheel() {
        System.out.println("It is two wheeler");
    }

    @Override
    public void fourWheel() {
        System.out.println("It is four wheeler");
    }
}
public class HybridInheritance
{
    public static void main (String args [] )
    {
        AllVehicle myobj = new AllVehicle();
        myobj.engine();
        myobj.twoWheel();
        myobj.fourWheel();
    }
}
