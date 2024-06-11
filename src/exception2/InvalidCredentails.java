package exception2;

public class InvalidCredentails extends Exception {
    private String code;
public InvalidCredentails(String code,String message){
    super(message);
    this.code=code;
}

    public String getCode() {
        return code;
    }
}
