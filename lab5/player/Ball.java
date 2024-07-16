package lab5.player;

public class Ball {
    private double x;
    private double y;
    private double radius;
    private double xDelta;
    private double yDelta;

    public Ball(double x, double y, double radius, double xDelta, double yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getXDelta() {
        return xDelta;
    }

    public double getYDelta() {
        return yDelta;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setXDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ") of velocity (" + xDelta + ", " + yDelta + ")";
    }
}
