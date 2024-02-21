package Polymorpisam;

public class BankServiceTest {
    public static void main(String[]args){
        SBIBankService sbiBankService=new SBIBankService();
        double sbiBankInterest=sbiBankService.calculateInterest(1000,86);
        System.out.println("SBI Bank"+sbiBankInterest);
        HDFCBankService hdfcBankService=new HDFCBankService();
        double hdfcBankInterest=hdfcBankService.calculateInterest(1000,89);
        System.out.println("HDFC Bank"+hdfcBankInterest);

    }
}

