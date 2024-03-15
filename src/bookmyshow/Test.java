package bookmyshow;

public class Test {
    public static void main(String[] args) {
        Process process=new Process("1234","1234");
        process.process();
        System.out.println("login is successful");
        PhonePay phonePay=new PhonePay("1234","1234",4321,"96522");
        phonePay.payment();
        System.out.println("payment success");
    }
}
