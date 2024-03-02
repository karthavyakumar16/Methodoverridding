package swiggy.model;

import swiggy.SwiggyPaymentService;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {
    public PaymentResponse payment(PaymentRequest request){
        PaymentRequest paymentInitationRequest=new PaymentRequest(UUID.randomUUID().toString()
        ,request.getAmt(),request.getTxnDate(),"45678",false);
        SBIBankService sbiBankService=new SBIBankService();
       return sbiBankService.tranfer(paymentInitationRequest);
    }
}
