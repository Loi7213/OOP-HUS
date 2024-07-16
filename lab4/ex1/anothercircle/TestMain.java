package lab4.ex1.anothercircle;

public class TestMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0);
        System.out.println(circle1);
        Circle circle2 = new Circle();
        System.out.println(circle2);

        circle1.setRadius(4.0);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());
        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circumference is: %.2f%n", circle1.getCircumference());
    }
}
