package h1package.h1all;

public class SiBank {
    public String accountNumber;

    public int totalBalance=1000;
    public SiBank(String accountNumber,int totalBalance){
        this.accountNumber=accountNumber;
        this.totalBalance=totalBalance;

    }
    public SiBank(){

    }
    public void givebalance(){
        System.out.println("totalbalance is"+totalBalance);
    }

}
