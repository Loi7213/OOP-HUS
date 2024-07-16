package lab4.ex2.myrectangle;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(new MyPoint(2, 3), new MyPoint(5, -1));
        System.out.println(rectangle1);
        System.out.println("area is: " + rectangle1.getArea());
        System.out.println("perimeter is: " + rectangle1.getPerimeter());
    }
}
