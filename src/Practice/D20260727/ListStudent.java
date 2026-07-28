package Practice.D20260727;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStudent {
    public  static void main(String[] args) {
        Student s1 = new Student("An","Nguyen",20);
        Student s2 = new Student("Tam","Hoang",22);
        Student s3 = new Student("Hai","Nguyen",21);
        Student s4 = new Student("Hai","Nguyen",23);

        List<Student> listStudent = new ArrayList<>(List.of(s1, s2, s3, s4));
        System.out.println("Before sort:");
        System.out.println(listStudent);

        Collections.sort(listStudent);
        System.out.println("After sort:");
        System.out.println(listStudent);
    }
}
