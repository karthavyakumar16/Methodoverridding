package CarAbstract;

public abstract class CarDeatails {
    protected String carModel;
    protected String carYear;
    public CarDeatails(String carModel,String carYear){
        this.carModel=carModel;
        this.carYear=carYear;
    }
    public String DisplayCarDetails(String carModel,String carYear){
        return "car Model"+carModel+"car Year"+carYear;

    }
    public abstract  double calculateAmount();
}
