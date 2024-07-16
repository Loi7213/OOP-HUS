package lab5.player;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void kick(Ball ball, double power, double angle) {
        double kickSpeed = power * 2.0; // Assumption: The kick power is directly proportional to the ball's speed
        double kickDirection = Math.toRadians(angle); // Convert kick angle to radians

        // Calculate the new ball's speed and direction
        double ballSpeed = Math.sqrt(Math.pow(ball.getXDelta(), 2) + Math.pow(ball.getYDelta(), 2));
        double ballDirection = Math.atan2(ball.getYDelta(), ball.getXDelta());

        double newBallSpeedX = kickSpeed * Math.cos(kickDirection);
        double newBallSpeedY = kickSpeed * Math.sin(kickDirection);
        double newBallSpeed = Math.sqrt(Math.pow(newBallSpeedX, 2) + Math.pow(newBallSpeedY, 2));

        double newBallDirection;
        if (newBallSpeed != 0) {
            newBallDirection = Math.atan2(newBallSpeedY, newBallSpeedX);
        } else {
            newBallDirection = ballDirection; // Preserve the original direction if the kick has no power
        }

        // Set the new ball's speed and direction
        ball.setXDelta(newBallSpeed * Math.cos(newBallDirection));
        ball.setYDelta(newBallSpeed * Math.sin(newBallDirection));
    }
}