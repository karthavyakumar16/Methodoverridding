package h1package.encapsulation;

public class Car2 {
    public String make;
    public String model;
    public String year;
    public Car2(String make,String model,String year){
        this.make=make;
        this.model=model;
        this.year=year;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
