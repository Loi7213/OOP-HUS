package lab4.ex2.myline;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 0);
        MyPoint point2 = new MyPoint(3, 4);

        MyLine line1 = new MyLine(2, 6, 3, 4);
        System.out.println(line1);

        MyLine line2 = new MyLine(point1, point2);
        System.out.println(line2);

        System.out.println("Line 1 length: " + line1.getLength());
        System.out.println("Line 1 gradient: " + line1.getGradient());

        System.out.println("Line 2 length: " + line2.getLength());
        System.out.println("Line 2 gradient: " + line2.getGradient());
    }
}
