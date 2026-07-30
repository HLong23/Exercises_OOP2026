package Lab10_.B2_2;

public interface PhoneBook {

    void addPerson(Student p);

    Student searchByName(String name);

    Student searchByLastname(String lastname);

    Student searchByNumber(String phone);

    void deleteByNumber(String phone);
}
