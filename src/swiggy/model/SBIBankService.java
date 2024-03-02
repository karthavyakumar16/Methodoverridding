package swiggy.model;

import java.util.Date;
import java.util.UUID;

public class SBIBankService {
    private String accountNumber="12345";
    private double amt=5000;
    private String merchantAccountNumber="45678";
    private double merchantAmt =1000;
    public PaymentResponse tranfer(PaymentRequest request) {
        System.out.println(request.getTxId());
        if (request.isMerchantDebit()) {
            amt = amt - request.getAmt();
        } else {
            amt = amt - request.getAmt();
            merchantAmt = merchantAmt + request.getAmt();

        }
        PaymentResponse response = new PaymentResponse(UUID.randomUUID().toString(),"Sucess",new Date());
        return response;


    }


}
