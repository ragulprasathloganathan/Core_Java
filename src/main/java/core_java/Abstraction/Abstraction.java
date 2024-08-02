package core_java.Abstraction;

abstract class Car
{
     abstract void engine();
     abstract void brake();
     abstract void horn();
     abstract void clutch();
}

public class Abstraction extends Car
{

    @Override
    public void engine()
    {
        System.out.println("Car Started");
    }
    @Override
    public void brake()
    {
        System.out.println("Break applied");
    }

    @Override
    void horn() {
        System.out.println("horn applied");
    }

    @Override
    void clutch() {
        System.out.println("clutch applied");
    }


    public static void main(String[] args)
    {
        Abstraction mustangGT = new Abstraction();
        mustangGT.engine();
        mustangGT.brake();
        mustangGT.horn();
        mustangGT.clutch();

    }
}
