package Lab4_ClassesAndObjects.B2_1_B2_2_B2_3;

public class Author {

    private String name;
    private String email;
    private char gender;

    // Constructor (2.3)
    public Author(String name, String email) {
        this(name, email, 'U');
    }

    // Constructor (2.1, 2.2)
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        if (gender == 'U') {
            return "Author[name=" + name +
                    ", email=" + email + "]";
        }

        return "Author[name=" + name +
                ", email=" + email +
                ", gender=" + gender + "]";
    }
}
