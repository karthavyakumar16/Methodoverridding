package CarAbstract;

public class MonthlyRent extends CarDeatails {
    private int monthlyRent;
    private int totalMonths;
    public MonthlyRent(String carModel,String carYear,int monthlyRent,int totalMonths){
        super( carModel,carYear );
        this.monthlyRent=monthlyRent;
        this.totalMonths=totalMonths;
    }
    public String displayCarrDetails(String carModel,String carYear){
        return "Car Model " +carModel + " Car Year " + carYear;

    }
    public double calculateAmount(){
        return monthlyRent*totalMonths;
    }
}
