package core_java.Encapsulation;

public class Account_Details
{
    public static void main(String[] args)
    {
        Account_Bank myObj = new Account_Bank();
        myObj.setAccBalance(8711727);
        myObj.setAccName("Ragul");
        myObj.setAccNo(2717277372818283772L);

        System.out.println(myObj.getAccNo());
        System.out.println(myObj.getAccBalance());
        System.out.println(myObj.getAccName());
        

    }
}
