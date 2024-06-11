package exception2;

public enum ErrorCodes {

    InvalidCredentails("INVALID USERNAME","INVALID PASSWORD"),
    InvalidInput("Invalid booking","Invalid number"),
    InsufficentBalance("Invalid balance","Invalid payment");
    private String code;
    private String message;
     ErrorCodes(String code,String message){
        this.code=code;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
