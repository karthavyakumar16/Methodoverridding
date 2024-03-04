package interfacelatest;

public enum ErrorCodes {
    NEOTERIC_INVALID_OTP_1000("NEO_ERR_1000","invalid OTP"),
    NEOTERIC_EXPIRY_OTP_1001("NEOTECH_EX_1001","EXPIRY OTP");
    String code;
    String message;
    ErrorCodes(String errorcode,String message){
        this.code=errorcode;
        this.message=message;

    }
    public String getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
}
