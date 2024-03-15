package bookmyshow;

public class PhonePay extends Process {
    public int otp;
    public  String mobileNumber;
    public PhonePay(String userId, String password, int otp, String mobileNumber) {
        super(userId, password);
        this.otp=otp;
        this.mobileNumber=mobileNumber;
    }
    public boolean payment(){
        int otp=4321;
        String mobileNumber="96522";
        if(this.otp==otp && this.mobileNumber.equals(mobileNumber)){
            System.out.println("payment Successful");
        }else{
            System.out.println("payment Failed");
        }
        return false;
    }
}
