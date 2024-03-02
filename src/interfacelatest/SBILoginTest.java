package interfacelatest;

public class SBILoginTest {
    public static void main(String[] args) {
       BankLoginService loginService=new SBIBankLoginProcess(null);
       boolean loginStatus= loginService.login("1144","1234");
       if(loginStatus){

       }


    }
}
