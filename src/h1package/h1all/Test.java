package h1package.h1all;

public class Test {
    public static void main(String[] args) {
        PhonePay phonepay=new PhonePay();
        phonepay.givebalance();
       phonepay.transfer("1234",100);
       phonepay.transfer(2345,110);
        Gpay gpay=new Gpay();
        gpay.givebalance();
        gpay.transfer("7890",150);
        gpay.transfer(4567,200);

    }
}
