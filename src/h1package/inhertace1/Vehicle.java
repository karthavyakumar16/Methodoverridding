package h1package.inhertace1;

public class Vehicle {
    public String make;
    public String model;
    public Vehicle(String make,String model){
        this.make=make;
        this.model=model;
    }
    public void startengine(){
        System.out.println("make is"+make+"model is"+model);
    }
}
