package lab5.container;

public class Ball {
    private int x;
    private int y;
    private int radius;
    private double xDelta;
    private double yDelta;

    public Ball(int x, int y, int radius, double speed, double direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;

        // Convert speed and direction to deltas
        double angle = Math.toRadians(direction);
        xDelta = speed * Math.cos(angle);
        yDelta = -speed * Math.sin(angle); // Invert yDelta due to inverted y-axis in graphics coordinate system
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getXDelta() {
        return xDelta;
    }

    public void setXDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getYDelta() {
        return yDelta;
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

    public String toString() {
        return "Ball at (" + x + ", " + y + ") of velocity (" + xDelta + ", " + yDelta + ")";
    }
}
