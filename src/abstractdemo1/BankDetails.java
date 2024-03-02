package abstractdemo1;

public abstract class BankDetails {
    protected String bankName;
    protected String bankCode;
    public BankDetails(String bankName,String bankCode){
        this.bankName=bankName;
        this.bankCode=bankCode;
    }
        public String DisplayBankDetails(String bankName,String bankCode){
            return "Bank Name"+bankName+"Bank Code" +bankCode;
        }
        public abstract double CalculateInterest();


}
