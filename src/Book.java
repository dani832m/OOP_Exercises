public class Book {

    // Private instance variables
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    // 1st constructor with 3 parameters
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // 2nd constructor with 4 parameters
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Public methods
    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

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

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // Define toString()
    public String toString() {
        return "Book[name=" + name + ", " + author + ", price=" + price + ", qty=" + qty + "]";
    }
}
