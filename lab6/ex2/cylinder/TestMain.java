package lab6.ex2.cylinder;

public class TestMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder.setHeight(7);
        System.out.println(cylinder.getHeight());
        cylinder.setRadius(4);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
