package interfacelatest;

public class InvalidOTPException extends Exception {
    private String code;

    public InvalidOTPException(String errorcode,String message){
        super(message);
        this.code=errorcode;



    }

}
