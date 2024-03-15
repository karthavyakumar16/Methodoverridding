package bookmyshow;

public class Process extends BookMyShow{
    public Process(String userId, String password) {
        super(userId, password);
    }
    public boolean process(){
        String userId="1234";
        String paasword="1234";

        if(userId.equals(getUserId()) && password.equals(getPassword())){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Failed");
        }
        return false;
    }


}
