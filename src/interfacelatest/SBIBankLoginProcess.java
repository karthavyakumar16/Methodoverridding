package interfacelatest;

import java.util.UUID;

public class SBIBankLoginProcess implements BankLoginService{


        SBIBankLoginService sbiBankLoginService;
        public SBIBankLoginProcess(SBIBankLoginService sbiBankLoginService){
           this. sbiBankLoginService=new SBIBankLoginService();
        }

    @Override
    public boolean login(String username, String password) {
            if(sbiBankLoginService.login(username, password)){
                String otp= sbiBankLoginService.generateOTP(username);
                boolean validOtp=false;
                try {
                    validOtp = sbiBankLoginService.validationOTP(UUID.randomUUID().toString());
                }catch (InvalidOTPException invalidOTPException) {
                    System.out.println("Error Occured" + invalidOTPException);
                  //  throw new RuntimeException(invalidOTPException.getCode);
                }catch(Exception e){
                }
                if(validOtp){
                    System.out.println("valid otp & login is sucessfull");

                } else{
                    System.out.println("invalid OTP & login is falied");
                }
                return validOtp;

            }else {
                System.out.println("invalid credtentails");

                return false;
            }
    }
}

