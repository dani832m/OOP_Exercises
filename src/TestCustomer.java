public class TestCustomer {

    public static void main(String[] args) {

        // New instance of class Customer
        Customer customer1 = new Customer(1, "Henning", 10);

        // Testing toString()
        System.out.println(customer1);

        // Testing Getters for instance customer1
        System.out.println(customer1.getID());
        System.out.println(customer1.getName());
        System.out.println(customer1.getDiscount());

        // Testing Setter for instance customer1
        customer1.setDiscount(20);
        System.out.println(customer1.getDiscount());

    }
}
