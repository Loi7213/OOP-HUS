package lab7.resiable;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject obj1 = new Circle(3.5);
        System.out.println(obj1);
        System.out.println(obj1.getArea());
        System.out.println(obj1.getPerimeter());

        Circle circle1 = (Circle) obj1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Circle circle2 = new ResizableCircle(1.5);
        System.out.println(circle2);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
        ((Resizable) circle2).resize(4);
        System.out.println(circle2);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
    }
}
