package lab5.player;

public class Main {
    public static void main(String[] args) {
        // Test the Ball class
        Ball ball = new Ball(0, 0, 5, 2, 2);
        System.out.println(ball);

        ball.move();
        System.out.println(ball);

        ball.reflectHorizontal();
        System.out.println(ball);

        ball.move();
        System.out.println(ball);

        ball.reflectVertical();
        System.out.println(ball);

        // Test the Player class
        Player player = new Player("Loi Tran");
        System.out.println("Player name: " + player.getName());

        Ball ball2 = new Ball(0, 0, 5, 1, 1);
        System.out.println("Before kick: " + ball2);
        player.kick(ball2, 2, 45);
        System.out.println("After kick: " + ball2);
    }
}
