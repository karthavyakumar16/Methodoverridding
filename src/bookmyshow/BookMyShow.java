package bookmyshow;

public class BookMyShow {
    String userId;
    String password;

    public BookMyShow(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }
}
