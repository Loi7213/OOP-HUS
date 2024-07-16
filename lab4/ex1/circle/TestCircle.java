package lab4.ex1.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());
        System.out.println(circle1.getColor());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());

        Circle circle4 = new Circle();
        circle4.setRadius(1.5);
        System.out.println("radius is: " + circle4.getRadius());
        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());

        Circle circle5 = new Circle(2.5);
        System.out.println(circle5.toString());

        Circle circle6 = new Circle(2.6);
        System.out.println(circle6.toString());
        System.out.println(circle6);
        System.out.println("Operator '+' invokes toString() too: " + circle6);
    }
}