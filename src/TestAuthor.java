public class TestAuthor {

    public static void main(String[] args) {

        // Creates an instance of class Author using the 1st constructor
        Author dani = new Author("Daniel Lyck", "n4@n4.dk", 'm');
        System.out.println(dani);  // Test toString()
        dani.setEmail("newmail@n4.dk");  // Test setter
        System.out.println("Name is: " + dani.getName());     // Test getter
        System.out.println("E-mail is: " + dani.getEmail());   // Test getter
        System.out.println("Gender is: " + dani.getGender()); // Test getter
    }
}