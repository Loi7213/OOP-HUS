package lab5.time;

import java.util.Scanner;

public class TestMyTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyTime time = new MyTime();

        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();
        System.out.print("Enter minute: ");
        int minute = scanner.nextInt();
        System.out.print("Enter second: ");
        int second = scanner.nextInt();
        System.out.println();

        try {
            time.setTime(hour, minute, second);
            System.out.println("Set Time: " + time);
            System.out.println();

            System.out.print("Enter new hour: ");
            hour = scanner.nextInt();
            time.setHour(hour);

            System.out.print("Enter new minute: ");
            minute = scanner.nextInt();
            time.setMinute(minute);

            System.out.print("Enter new second: ");
            second = scanner.nextInt();
            time.setSecond(second);

            System.out.println();

            System.out.println("Updated Time: " + time);
            System.out.println();

            System.out.println("Hour: " + time.getHour());
            System.out.println("Minute: " + time.getMinute());
            System.out.println("Second: " + time.getSecond());

            System.out.println("Next Second: " + time.nextSecond());
            System.out.println("Next Minute: " + time.nextMinute());
            System.out.println("Next Hour: " + time.nextHour());

            System.out.println("Previous Second: " + time.previousSecond());
            System.out.println("Previous Minute: " + time.previousMinute());
            System.out.println("Previous Hour: " + time.previousHour());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}