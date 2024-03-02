package interfacelatest;

import java.util.UUID;

public class SBIBankLoginService implements BankOTPValidationService {

    String accountNumber = "1111";
    String password = "1234";
    String otp;

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
            return otp = UUID.randomUUID().toString();
        }
        return null;
    }

    @Override
    public boolean validateOTP(String otp) {
        return false;
    }

    public boolean validationOTP(String otp) {
        if (this.otp.equals(otp)) {

            return true;
        }
        return false;
    }
}
