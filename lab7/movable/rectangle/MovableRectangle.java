package lab7.movable.rectangle;

public class MovableRectangle implements Movable{
    private Movable topLeft;
    private Movable bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
