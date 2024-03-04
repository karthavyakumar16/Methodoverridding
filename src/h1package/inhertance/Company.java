package h1package.inhertance;

public class Company {
    public String name;
    public String location;
    public String floor;
    public Company(String name,String location,String floor){
        this.name=name;
        this.location=location;
        this.floor=floor;
    }
    public void display(){
        System.out.println("name is"+name+"location is"+location+"floor is"+floor);
    }
}
