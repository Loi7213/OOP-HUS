package lab6.ex1.point;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        setX(0.0f);
        setY(0.0f);
    }

    public Point2D(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[] { x, y };
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
