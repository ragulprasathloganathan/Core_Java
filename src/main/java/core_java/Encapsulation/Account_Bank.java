package core_java.Encapsulation;

public class Account_Bank
{
    private long accNo ;
    private String accName;
    private int accBalance;

    public long getaccNo()
    {
        return accNo;   }

    public String getAccName() {
        return accName;
    }

    public int getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
}


