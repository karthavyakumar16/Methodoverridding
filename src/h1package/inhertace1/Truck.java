package h1package.inhertace1;

public class Truck extends Vehicle {
    public String truckyear;
    public String trucknumber;

    public String getTruckyear() {
        return truckyear;
    }

    public String getTrucknumber() {
        return trucknumber;
    }
    public Truck(String truckyear,String trucknumber){
        super("tata","2022");
        this.truckyear=truckyear;
        this.trucknumber=trucknumber;
    }
}
