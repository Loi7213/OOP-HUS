package lab5.date;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date = new MyDate(2024, 3, 16);
        System.out.println("Initial date: " + date);

        date.nextDay();
        System.out.println("Next day: " + date);

        date.nextMonth();
        System.out.println("Next month: " + date);

        date.nextYear();
        System.out.println("Next year: " + date);

        date.previousDay();
        System.out.println("Previous day: " + date);

        date.previousMonth();
        System.out.println("Previous month: " + date);

        date.previousYear();
        System.out.println("Previous year: " + date);
    }
}
