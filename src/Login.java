
public class Login {
    public String userName;
    public String password;


    public String login(Login login) {

        String localUsername = "Tech Junkies";
        String localPassword = "Neoteric";

        if (localUsername.equals(login.userName) && localPassword.equals(login.password)) {
            return "login successful";
        } else {
            return "login failed";
        }
    }


    }

