package abstractdemo1;

public class Test {
    public static void main(String[] args) {
        MonthlyInterest monthlyInterest=new MonthlyInterest("SBI","20415",4,8);
        System.out.println(monthlyInterest.DisplayBankDetails("SBI","20415"));
        System.out.println("Amount is"+monthlyInterest.CalculateInterest());
    }
}
