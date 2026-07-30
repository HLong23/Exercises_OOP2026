package Lab10_.B2_2;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {

    private ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {

        for (Student s : phoneBook) {
            if (s.getName().equals(name)) {
                return s;
            }
        }

        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {

        for (Student s : phoneBook) {
            if (s.getLastname().equals(lastname)) {
                return s;
            }
        }

        return null;
    }

    @Override
    public Student searchByNumber(String phone) {

        for (Student s : phoneBook) {
            if (s.getPhone().equals(phone)) {
                return s;
            }
        }

        return null;
    }

    @Override
    public void deleteByNumber(String phone) {

        Student student = searchByNumber(phone);

        if (student != null) {
            phoneBook.remove(student);
        }
    }
}
