package abstract2;

public class Circle extends Shape{
    public double radius;

    public Circle(String color,double radius) {
        super(color);
        this.radius=radius;
    }


    @Override
    public double calculateArea() {

        return  Math.PI*radius*radius;
    }


}
