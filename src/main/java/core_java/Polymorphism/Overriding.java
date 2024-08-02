package core_java.Polymorphism;
class Bank
{
    void bank(float rateOfInterest)
    {
        System.out.println("common interest rate is:" + rateOfInterest);
    }

}
class Bank1 extends Bank
{
    void bank(float rateOfInterest)
    {
        System.out.println("Interest for Iob is: " +rateOfInterest);
    }
}

class Bank2 extends Bank1
{
    void bank(float rateOfInterest)
    {
      System.out.println("Interest for Iob: " +rateOfInterest);
    }
}

public class Overriding
{
    public static void main(String[] args)
    {
        Bank1  IOB= new Bank1();
        Bank2 HDFC = new Bank2();
        Bank COMMON_INT = new Bank();
        IOB.bank(8.65f);
        HDFC.bank(9.40f);
        COMMON_INT.bank(8.67f);
    }
}
