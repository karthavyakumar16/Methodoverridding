package exception2;

public class LoginProcess {
    public String validuserName;
    public String validpassword;


  public LoginProcess(String validuserName, String validpassword) {
       this.validuserName = validuserName;
     this.validpassword = validpassword;
    }
    public boolean login(String userName,String password)throws InvalidCredentails{
        if(userName.equals(validuserName)&&password.equals(validpassword)){
            System.out.println("login sucessfull");
        }else{
            throw new InvalidCredentails(ErrorCodes.InvalidCredentails.getCode(),
                    ErrorCodes.InvalidCredentails.getMessage());


        }
        return false;
    }

}
