public class TestInvoice {

    public static void main(String[] args) {

        // New instance of class Customer
        Customer customer10 = new Customer(20, "Poul Dissing", 10);

        // Another new instance of class Customer
        Customer customer20 = new Customer(21, "Yahya Hassan", 1);

        // New instance of class Invoice
        Invoice invoice1 = new Invoice(1, customer10, 100.50);

        // Another new instance of class Invoice
        Invoice invoice2 = new Invoice(2, customer20, 59.50);

        // Testing Getters for instance invoice1
        System.out.println(invoice1.getCustomer());
        System.out.println(invoice1.getCustomerName());
        System.out.println(invoice1.getAmount());
        System.out.println(invoice1.getID());
        System.out.println(invoice1.getAmountAfterDiscount());

        // Testing Setters for instance invoice1 and 2
        invoice1.setCustomer(customer20);
        invoice2.setAmount(1000);
        System.out.println(invoice2.getAmountAfterDiscount());

    }
}
