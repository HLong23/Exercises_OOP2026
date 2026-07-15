package Lab5_MoreClassesAndObjects.B1_5;

import java.time.LocalDate;

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
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        int maxDay = DAYS_IN_MONTHS[month - 1];

        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }

        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getValue() % 7;
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
        setDate(year, this.month, this.day);
    }

    public void setMonth(int month) {
        setDate(this.year, month, this.day);
    }

    public void setDay(int day) {
        setDate(this.year, this.month, day);
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

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " "
                + day + " "
                + MONTHS[month - 1] + " "
                + year;
    }

    public MyDate nextDay() {
        LocalDate date = LocalDate.of(year, month, day).plusDays(1);
        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();
        return this;
    }

    public MyDate nextMonth() {
        LocalDate date = LocalDate.of(year, month, day).plusMonths(1);
        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();
        return this;
    }

    public MyDate nextYear() {
        if (year >= 9999) {
            throw new IllegalStateException("Year out of range!");
        }

        LocalDate date = LocalDate.of(year, month, day).plusYears(1);
        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();
        return this;
    }

    public MyDate previousDay() {
        LocalDate date = LocalDate.of(year, month, day).minusDays(1);
        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();
        return this;
    }

    public MyDate previousMonth() {
        LocalDate date = LocalDate.of(year, month, day).minusMonths(1);
        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();
        return this;
    }

    public MyDate previousYear() {
        LocalDate date = LocalDate.of(year, month, day).minusYears(1);
        year = date.getYear();
        month = date.getMonthValue();
        day = date.getDayOfMonth();
        return this;
    }
}
