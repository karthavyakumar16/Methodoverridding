package interfacelatest;

public class HdfcBankLoginService implements BankLoginService {
    String accountNumber="2222";
    String password="1234";
    public HdfcBankLoginService(){

    }
    public boolean login(String username,String password){
        if(username.equals(accountNumber)&& password.equals(password)){
            return true;
        }
        return false;
    }
}
