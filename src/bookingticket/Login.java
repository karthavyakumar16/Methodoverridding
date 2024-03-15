package bookingticket;

public class Login {
    public String validUserName="12345";
    public String validPassword="54321";
    public boolean login(String username,String password){
        return username.equals(validUserName)&&password.equals(validPassword);
    }
}
