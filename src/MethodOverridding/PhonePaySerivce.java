package MethodOverridding;

public class PhonePaySerivce extends BankAccountService{
    public boolean transfer(String fromMobileNumber,String toMobileNumber,int amt){
       return super.transfer(fromMobileNumber,toMobileNumber,amt);

    }


}
