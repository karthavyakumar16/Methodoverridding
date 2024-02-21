package MethodOverridding;

public class MethodOverrideTest {
    public static void main(String[] args){
        PhonePaySerivce phonepayservice=new PhonePaySerivce();
        phonepayservice.transfer("12345","45678",900);
        phonepayservice.transfer("12345","45678",900);
        phonepayservice.transfer("12345","45678",900);
        System.out.println("To account Amount"+phonepayservice.toAccountAmt);
        BankAccountService bankAccountService=new BankAccountService();
        bankAccountService.transfer("12345","45678",900);
        BankAccountService bankAccountServiceUpcast=new PhonePaySerivce();
        bankAccountServiceUpcast.transfer("12345","45678",900);

    }
}
