package Lab4_ClassesAndObjects.B2_4_B2_5;

public class Customer {

    private int id;
    private String name;
    private char gender;
    private double discount;

    // Constructor đầy đủ (2.4)
    public Customer(int id, String name, char gender, double discount) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }

    // Constructor không có discount
    public Customer(int id, String name, char gender) {
        this(id, name, gender, 0);
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public double getDiscount() {
        return discount;
    }

    // Setter
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer[id=" + id
                + ", name=" + name
                + ", gender=" + gender
                + ", discount=" + discount + "%]";
    }
}

