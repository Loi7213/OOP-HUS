package lab7.geometric;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject obj1 = new Rectangle(3, 4);
        System.out.println(obj1);
        System.out.println(obj1.getArea());
        System.out.println(obj1.getPerimeter());

        if (obj1 instanceof Rectangle) {
            Rectangle rectangle1 = (Rectangle) obj1;
            System.out.println(rectangle1);
            System.out.println(rectangle1.getArea());
            System.out.println(rectangle1.getPerimeter());
        }

        GeometricObject obj2 = new Circle(2.5);
        System.out.println(obj2);
        System.out.println(obj2.getArea());
        System.out.println(obj2.getPerimeter());

        if (obj2 instanceof Circle) {
            Circle circle1 = (Circle) obj2;
            System.out.println(circle1);
            System.out.println(circle1.getArea());
            System.out.println(circle1.getPerimeter());
        }
    }
}
