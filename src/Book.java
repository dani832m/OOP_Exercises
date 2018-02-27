public class Book {

    // Private instance variables
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // 1st constructor with 3 parameters
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    // 2nd constructor with 4 parameters
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Public methods
    // Getters
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    /**
     * Commented out methods are for exercise 2.1
     */
    /*
    public String getAuthorName() {
        return author.getName();
        // Cannot use author.name as name is private in Author class
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }
    */

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Define toString()
    public String toString() {
        return "Book[name=" + name + ", " + authors + ", price=" + price + ", qty=" + qty + "]";
    }
}
