package InterestCalculate;

public class Processing {
    public int interest(int principalAmount,int rateOfInterest,int duration ){
       int interestAmount=(principalAmount*rateOfInterest*duration)/100;
       int finalAmount=principalAmount+interestAmount;
      return finalAmount;
    }
}
