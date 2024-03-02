package abstractdemo1;

public class MonthlyInterest extends BankDetails {
    private int monthlyInterest;
    private int noOfMonths;
    public MonthlyInterest(String bankName,String bankCode,int monthlyInterest,int noOfMonths){
        super(bankName,bankCode);
        this.monthlyInterest=monthlyInterest;
        this.noOfMonths=noOfMonths;

    }
    public String DisplayBankDetails(String bankName,String bankCode){
        return "Bank Name"+bankName+"Bank Code"+bankCode;
    }

    @Override
    public double CalculateInterest() {
        return monthlyInterest*noOfMonths;
    }
}
