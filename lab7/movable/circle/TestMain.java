package lab7.movable.circle;

public class TestMain {
    public static void main(String[] args) {
        Movable movable1 = new MovablePoint(0, 0, 5, 7);
        System.out.println(movable1);
        movable1.moveLeft();
        System.out.println(movable1);

        Movable movable2 = new MovableCircle(3, 4, 4, 3, 2);
        System.out.println(movable2);
        movable2.moveRight();
        System.out.println(movable2);
        movable2.moveUp();
        System.out.println(movable2);
    }
}
