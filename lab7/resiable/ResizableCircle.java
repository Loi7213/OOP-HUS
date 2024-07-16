package lab7.resiable;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[radius=" + radius + "]]";
    }

    @Override
    public void resize(int percent) {
        radius *= (double)percent / 100.0;
    }
}
