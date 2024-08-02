package core_java.Polymorphism;


public class Overloading
{
    void batsman(String ragul, int score, int wicket)
    {

    }
    void batsman(String sarran, int catches,int score,float strike_rate )
    {

    }
    void batsman(String Karthi, int wickets, float econommy)
    {

    }

public static void main(String[] args)
{
    Overloading myObj = new Overloading();
    myObj.batsman()

}

}
