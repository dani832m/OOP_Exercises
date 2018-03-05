public class Customer {

    // Instance variables
    private int ID;
    private String name;
    private int discount;

    // Constructor with 3 parameters
    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    // Getters
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    // Setter
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // toString Method
    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }

}
