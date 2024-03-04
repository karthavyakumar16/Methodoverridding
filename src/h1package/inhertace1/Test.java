package h1package.inhertace1;

public class Test {
    public static void main(String[] args) {
        Car car=new Car("tata","50000");
        car.startengine();
        System.out.println(car.carcompany+car.carcost);
        Truck truck=new Truck("2022","23456");
        truck.startengine();
        System.out.println(truck.truckyear+truck.trucknumber);
    }
}
