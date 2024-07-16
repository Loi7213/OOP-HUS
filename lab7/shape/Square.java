package lab7.shape;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}