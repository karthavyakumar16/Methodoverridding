package MethodOverridding;

public class BankAccountService {
    int fromAccountAmt=0;
    int toAccountAmt=0;
    String fromAccount=null;
    String toAccount=null;
    public boolean login(String username,String password){
        return true;
    }
    public boolean transfer(String fromMobileNumber,String toMobileNumber,int amt){
        System.out.println("From Super Class BankAccountService");

        if(fromMobileNumber.equals("12345")){
            fromAccount="111";

        }
        if(toMobileNumber.equals("45678")){
            toAccount="222";
        }
        return  this.booktransfer(fromAccount,toAccount,amt);
    }

    public boolean booktransfer(String fromAccount,String toAccount,int amt){
        toAccountAmt=toAccountAmt+amt;
        fromAccountAmt=fromAccountAmt-amt;
        return true;

    }
}
