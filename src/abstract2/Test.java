package abstract2;

public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle("green",4);
        circle.displayInfo();
        System.out.println(circle.color+" "+circle.radius);
        Rectangle rectangle=new Rectangle("red",6,4);
        rectangle.displayInfo();
        System.out.println(rectangle.length+"   "+ rectangle.width);


    }
    }
