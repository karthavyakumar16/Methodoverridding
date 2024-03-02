package swiggy.model;

import java.util.Date;

public class PaymentRequest {
    private String txId;
    private double amt;
    private Date txnDate;
    private String merchentId;
    private boolean merchantDebit;

    public boolean isMerchantDebit() {
        return merchantDebit;
    }

    public PaymentRequest(String txId, double amt, Date txnDate){
        this.txId=txId;
        this.amt=amt;
        this.txnDate=txnDate;
    }

    public String getTxId() {
        return txId;
    }

    public double getAmt() {
        return amt;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public PaymentRequest(String txId, double amt, Date txnDate, String merchentId, boolean merchantDebit) {
        this.txId = txId;
        this.amt = amt;
        this.txnDate = txnDate;
        this.merchentId = merchentId;
        this.merchantDebit = merchantDebit;
    }
}
