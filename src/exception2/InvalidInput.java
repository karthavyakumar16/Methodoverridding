package exception2;

public class InvalidInput extends Exception{
    public String code;



    public InvalidInput(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
