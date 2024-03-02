package CarAbstract;


public class Test {
    public static void main(String[] args) {

        MonthlyRent monthlyRent = new MonthlyRent("nexon", "2023",
                1000, 10);
        System.out.println(monthlyRent.displayCarrDetails("nexon", "2023"));
        System.out.println("Amount is " + monthlyRent.calculateAmount());

    }
}
