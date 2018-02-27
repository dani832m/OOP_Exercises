public class Author {

    // Private instance variables
    private String name;
    private String email;
    private char gender;

    // 1st constructor with 3 parameters
    public Author (String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Public methods
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

    // Setters
    public void setEmail(String email) {
        this.email = email;
    }

    //Define toString()
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender +"]";
    }
}
