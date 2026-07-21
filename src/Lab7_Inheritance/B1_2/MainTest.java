package Lab7_Inheritance.B1_2;

public class MainTest {
    public static void main(String[] args) {

        Person person = new Person(
                "Long Pham",
                "Ha Noi");

        Student student = new Student(
                "Nguyen Van A",
                "Ha Noi",
                "Computer Science",
                2026,
                1500);

        Staff staff = new Staff(
                "Tran Van B",
                "Ho Chi Minh",
                "HUS",
                1800);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);

        student.setFee(2000);
        staff.setPay(2200);

        System.out.println();
        System.out.println("Student fee: " + student.getFee());
        System.out.println("Staff pay: " + staff.getPay());
    }
}
