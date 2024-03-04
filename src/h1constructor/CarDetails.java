package h1constructor;

public class CarDetails {
    public String make;
    public String model;
    public String year;
    public CarDetails(String make,String model,String year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CarDetails carDetails=new CarDetails("tata","nexon","2020");
        CarDetails carDetails1=new CarDetails("maruthi","alto","2022");
        System.out.println(carDetails);
        System.out.println(carDetails1);

    }
}
