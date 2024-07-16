package lab6.ex1.point;

public class TestMain {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(1.2f, 1.6f);
        System.out.println(point1);

        Point3D point2 = new Point3D(3, 4, 5);
        System.out.println(point2);

        Point2D[] point2DS = new Point2D[200];
        for (int i = 0; i < 100; i++) {
            point2DS[i] = new Point2D(i, i);
            point2DS[i + 100] = new Point3D(i, i, i);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(point2DS[i]);
        }
    }
}
