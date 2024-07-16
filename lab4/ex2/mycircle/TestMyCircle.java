package lab4.ex2.mycircle;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1, 2, 3);
        MyCircle c2 = new MyCircle(new MyPoint(1, 1), 5);

        System.out.println(c1);

        c1.setCenterX(3);
        System.out.println("centerX is: " + c1.getCenterX());
        c1.setCenterY(1);
        System.out.println("centerY is: " + c1.getCenterY());
        c1.setCenterXY(8, 7);
        System.out.println(c1);

        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circulum is: %.2f%n", c1.getCircumference());

        System.out.printf("distance is: %.2f%n", c1.distance(c2));
    }
}
