package lab6.ex1.shape;

public class Square extends Rectangle {
    public Square() {
        super();
    }

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
        setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return getSide() * 4;
    }
}
