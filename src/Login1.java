public class Login1 {
    public String userName;
    public String password;
    public String login(Login1 login){
        String localuserName="karthavya";
        String localpassword="kumar";
        if(localuserName.equals(login.userName)&&localpassword.equals(login.password)){
            return "login sucess";

        }else{
            return "login failed";
        }


    }
}
