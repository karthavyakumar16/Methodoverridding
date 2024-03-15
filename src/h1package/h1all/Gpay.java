package h1package.h1all;

public class Gpay extends SiBank{
    public void transfer(String toAccountNumber,int transferAmt){
        totalBalance=totalBalance-transferAmt;
        System.out.println("trnasfer sucessfull");
    }
    public void transfer(int toNumber,int transferAmt){
        totalBalance=totalBalance-transferAmt;
        System.out.println("transfer sucessfull");
    }
}