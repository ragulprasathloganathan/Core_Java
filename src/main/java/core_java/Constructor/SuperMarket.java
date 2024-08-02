package core_java.Constructor;

public class SuperMarket
{

    String name ;
    String productName;
    int id ;

    SuperMarket(String name, String productName, int id)
    {

      System.out.println(name);
      System.out.println(productName);
      System.out.println(id);
    }
    // this method will  return default values id we does not give the parameters
    public void sample()
    {
      System.out.println(name);
      System.out.println(productName);
      System.out.println(id);
    }

    public static void main(String[] args)
    {
      SuperMarket myObj = new SuperMarket("Kannan", "Sampoo", 74938298);
      myObj.sample();
    }


}
