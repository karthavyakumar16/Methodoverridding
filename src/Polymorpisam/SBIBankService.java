package Polymorpisam;

public class SBIBankService extends RBIBankService {
    public double calculateInterest(int principalAmt) {
        double totalAmt = 0;
        double interestAmt = super.calculateInterest(principalAmt);
        totalAmt = interestAmt + principalAmt;
        return totalAmt;


    }

    public double calculateInterest(int principalAmt, int days) {


        double totalAmt = 0;
        if (days > 85) {
            return this.calculateInterest(principalAmt);

        }
        return totalAmt+principalAmt;
    }
}