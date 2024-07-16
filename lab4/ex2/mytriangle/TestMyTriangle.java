package lab4.ex2.mytriangle;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle myTriangle1 = new MyTriangle(0, 2, 6, 4, 8, 10);
        System.out.println(myTriangle1);
        System.out.printf("perimeter is: %.2f%n", myTriangle1.getPerimeter());
        System.out.println(myTriangle1.getType());

        MyPoint point1 = new MyPoint(1, 3);
        MyPoint point2 = new MyPoint(1, 1);
        MyPoint point3 = new MyPoint(4, 2);
        MyTriangle myTriangle2 = new MyTriangle(point1, point2, point3);
        System.out.println(myTriangle2.getType());
    }
}
