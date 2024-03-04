package h1package.h1all;

public class PhonePay extends SiBank {
   // public String toAccountNumber;
   // public int transferAmt;
    public void transfer(String toAccountNumber,int transferAmt){
        totalBalance=totalBalance-transferAmt;
        System.out.println("transfer sucessfull");

    }
    public void transfer(int toNumber,int transferAmt){
        totalBalance=totalBalance-transferAmt;
        System.out.println("transfer sucessfull");
    }

}
