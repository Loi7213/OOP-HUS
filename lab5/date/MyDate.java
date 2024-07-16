package lab5.date;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    public static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }

        int maxDays = DAYS_IN_MONTHS[month - 1];

        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }

        return day >= 1 && day <= maxDays;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int a = (14 - month) / 12;
        int y = year - a;
        int m = month + 12 * a - 2;
        int d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

        return d;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }

        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }

        this.month = month;
    }

    public void setDay(int day) {
        int maxDays = DAYS_IN_MONTHS[month - 1];

        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }

        if (day < 1 || day > maxDays) {
            throw new IllegalArgumentException("Invalid day!");
        }

        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        String dayOfWeekStr = DAYS[dayOfWeek];
        String monthStr = MONTHS[month - 1];
        return dayOfWeekStr + " " + day + " " + monthStr + " " + year;
    }

    public MyDate nextDay() {
        day++;
        if (!isValidDate(year, month, day)) {
            day = 1;
            nextMonth();
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            nextYear();
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (year > 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        day--;
        if (day < 1) {
            previousMonth();
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month < 1) {
            month = 12;
            previousYear();
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (year < 1) {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }
}