package Lab10_.B2_2;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {

    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student s) {
        phoneBook.put(s.getPhone(), s);
    }

    @Override
    public Student searchByName(String name) {

        for (Student s : phoneBook.values()) {
            if (s.getName().equals(name)) {
                return s;
            }
        }

        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {

        for (Student s : phoneBook.values()) {
            if (s.getLastname().equals(lastname)) {
                return s;
            }
        }

        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
