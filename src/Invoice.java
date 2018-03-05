public class Invoice {

    // Instance variables
    private int ID;
    private Customer customer;
    private double amount;

    // Constructor with 3 parameters
    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    // Getters
    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        double discount = (amount * customer.getDiscount()) / 100;
        return amount - discount; // Wooo, Math Skills! xD
    }

    // Setters
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
