package Practice.D20260727;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int compareTo(Student student){
        int compare = firstName.compareTo(student.firstName);

        if(compare == 0){
            compare = lastName.compareTo(student.lastName);
        }

        if(compare == 0){
            compare = Integer.valueOf(age).compareTo(student.age);
        }

        return compare;
    }

    @Override
    public String toString() {
        return "[Name=" + lastName + " " + firstName + ", age=" + age + "]";
    }
}
