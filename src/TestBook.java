public class TestBook {

    public static void main(String[] args) {

        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()

        /**
         * All below works with exercise 2.1
         */
        /*
        // Construct an author instance
        Author putin = new Author("Vladimir Putin", "putin@slav.ru", 'm');
        System.out.println(putin);  // Author's toString()

        Book dummyBook = new Book("Welcome to Russia", putin, 39.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(10);
        System.out.println("Name is: " + dummyBook.getName());
        System.out.println("Price is: " + dummyBook.getPrice());
        System.out.println("Qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook =  new Book("Woop-Woop!",
                            new Author("Hugo Boss", "hugo@boss.com", 'f'), 9.95);
        System.out.println(anotherBook);  // toString()

        // Printing the name and email of the author from a Book instance
        System.out.println(dummyBook.getAuthor().getName());
        System.out.println(dummyBook.getAuthor().getEmail());

        // Printing the name and email with the defined methods from class Book
        System.out.println(dummyBook.getAuthorName());
        System.out.println(dummyBook.getAuthorEmail());
        */
    }
}
