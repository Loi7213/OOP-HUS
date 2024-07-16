package lab7.movable.rectangle;

public class TestMain {
    public static void main(String[] args) {
        Movable m1 = new MovableRectangle(1, 2, 3, 4, 5, 6);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
    }
}
