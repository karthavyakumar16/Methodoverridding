package InterestCalculate;

public class Test {
    public static void main(String[] args) {
        Input input=new Input();
        input.principalAmount=10000;
        input.rateOfInterest=2;
        input.duration=4;
        System.out.println(input);
        Processing processing=new Processing();
        System.out.println(processing.interest(10000,2,4));

    }
}
