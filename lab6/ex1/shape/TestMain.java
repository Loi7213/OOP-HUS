package lab6.ex1.shape;

public class TestMain {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("yellow");
        shape.setFilled(false);
        System.out.println(shape);

        Circle circle = new Circle(2.0, "white", false);
        System.out.println(circle);
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Perimeter of circle is: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(1.2, 1.6, "blue", false);
        System.out.println(rectangle);
        System.out.println("Area of circle is: " + rectangle.getArea());
        System.out.println("Perimeter of circle is: " + rectangle.getPerimeter());

        Square square = new Square();
        System.out.println(square);
        square.setLength(5);
        System.out.println(square);
        System.out.println("Area of circle is: " + square.getArea());
        System.out.println("Perimeter of circle is: " + square.getPerimeter());
    }
}
