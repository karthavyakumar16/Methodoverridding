package abstract2;

public abstract class Shape {
    public String color;
    public Shape(String color){
        this.color=color;

    }
    public void displayInfo(){
        System.out.println("this is a "+color+"shape");
    }
    public abstract double calculateArea();
}
