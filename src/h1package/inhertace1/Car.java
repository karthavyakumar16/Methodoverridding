package h1package.inhertace1;

public class Car extends Vehicle {
    public String carcompany;
    public String carcost;

    public String getCarcompany() {
        return carcompany;
    }

    public String getCarcost() {
        return carcost;
    }
    public Car(String carcompany,String carcost){
        super("tata","2023");
        this.carcompany=carcompany;
        this.carcost=carcost;
    }
}
