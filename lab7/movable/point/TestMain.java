package lab7.movable.point;

public class TestMain {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1, 2, 3, 4);
        System.out.println(mp);
        mp.moveDown();
        System.out.println(mp);
        mp.moveUp();
        System.out.println(mp);
        mp.moveLeft();
        System.out.println(mp);
        mp.moveRight();
        System.out.println(mp);
    }
}
