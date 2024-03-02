package interfacelatest;

public class SBIBankLoginProcess implements BankLoginService{


        SBIBankLoginService sbiBankLoginService;
        public SBIBankLoginProcess(SBIBankLoginService sbiBankLoginService){
           this. sbiBankLoginService=new SBIBankLoginService();
        }

    @Override
    public boolean login(String username, String password) {
            if(sbiBankLoginService.login(username, password)){
                String otp= sbiBankLoginService.generateOTP(username);
                boolean validOtp=sbiBankLoginService.validationOTP(otp);
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

