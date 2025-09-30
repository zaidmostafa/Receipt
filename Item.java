public class Item {
    private String name;
    private double price;
    private int quantity;

    // Default constructor
    public Item() {
        this.name = "";
        this.price = 0.0; // Default price is 0
        this.quantity = 0; // Default quantity is 0
    }

    // Custom constructor to initialize the item with specific values
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter method for the item's name
    public String getName() {
        return name;
    }

    // Getter method for the item's price
    public double getPrice() {
        return price;
    }

    // Getter method for the item's quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method for the item's name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for the item's price
    public void setPrice(double price) {
        this.price = price;
    }

    // Setter method for the item's quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
