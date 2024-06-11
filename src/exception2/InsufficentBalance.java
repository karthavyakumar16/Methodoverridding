package exception2;

public class InsufficentBalance  extends Exception{
    public String code;



    public InsufficentBalance(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
