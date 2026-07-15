package Lab5_MoreClassesAndObjects.B1_4;

public class TestMyTime {
    public static void main(String[] args) {

        MyTime time = new MyTime(23, 59, 58);

        System.out.println("Current time: " + time);

        System.out.println("Next second: " + time.nextSecond());
        System.out.println("Next second: " + time.nextSecond());

        System.out.println("Previous second: " + time.previousSecond());

        System.out.println("Next minute: " + time.nextMinute());
        System.out.println("Previous minute: " + time.previousMinute());

        System.out.println("Next hour: " + time.nextHour());
        System.out.println("Previous hour: " + time.previousHour());

        time.setTime(12, 30, 45);
        System.out.println("After setTime: " + time);

        time.setHour(8);
        time.setMinute(15);
        time.setSecond(20);

        System.out.println("After setters: " + time);

        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}
