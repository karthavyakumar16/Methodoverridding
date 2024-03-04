package interfacelatest;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class SBIBankLoginService implements BankOTPValidationService {

    String accountNumber = "1111";
    String password = "1234";
    String otp;
    Date otpExpireTime;

    public SBIBankLoginService() {

    }

    public boolean login(String userName, String password) {
        if (userName.equals(accountNumber) && this.password.equals(password)) {
            return true;

        }
        return false;

    }

    public String generateOTP(String accountNumber) {
        if (this.accountNumber.equals(accountNumber)) {
            otp = UUID.randomUUID().toString();

            Calendar otpExpiryCalender=Calendar.getInstance();
            otpExpiryCalender.add(Calendar.SECOND,60);
            System.out.println("otpExpiryCalender"+otpExpiryCalender.getTime());
            otpExpireTime=otpExpiryCalender.getTime();
            return otp;
        }
        return null;
    }

    @Override
    public boolean validateOTP(String otp) {
        return false;
    }

    public boolean validationOTP(String otp) throws Exception {
        if (this.otp.equals(otp)) {

            return true;
        }else{
            System.out.println("Invalid otp");
            throw new InvalidOTPException(ErrorCodes.NEOTERIC_INVALID_OTP_1000.getCode(),
            ErrorCodes.NEOTERIC_INVALID_OTP_1000.getMessage());
        }
    }
}
