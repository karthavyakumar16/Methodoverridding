package h1package.constructorusage;

public class Car1 {
    public String make;
    public String model;
    public String year;
    public Car1(String make,String model,String year){
        this.make=make;
        this.model=model;
        this.year=year;

    }

    public static void main(String[] args) {
        Car1 car=new Car1("TATA","NEXON","2023");
        System.out.println(car.make+car.model+car.year);



    }
}
