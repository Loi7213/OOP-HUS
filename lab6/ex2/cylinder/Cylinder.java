package lab6.ex2.cylinder;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}
