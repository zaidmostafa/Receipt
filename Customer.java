import java.util.ArrayList;

public class Customer implements User {
    // Name of the customer
    private String name;

    // List of receipts associated with the customer
    private ArrayList<Receipt> receipts = new ArrayList<Receipt>();

    // Default
    public Customer(){
        this.name = "";
    }

    // Initializes by taking customers name
    public Customer(String name){
        this.name = name;
    }

    // Gets the customers name
    public String getName(){
        return name;
    }

    // Gets receipts that are associated with the customers names
    public ArrayList<Receipt> getReceipts(){
        return receipts;
    }

    // Setter for the customer's name
    public void setName(String name){
        this.name = name;
    }

    // Setter for the list of receipts associated with the customer
    public void setReceipts(ArrayList<Receipt> receipts){
        this.receipts = receipts;
    }

    // Adds a receipt to the list
    public void addReceipt(Receipt receipt){
        receipts.add(receipt);
    }

    // Removes a receipt from list
    public void removeReceipt(Receipt receipt){
        receipts.remove(receipt);
    }

    // Displays all receipts associated with the customer
    public void viewReceipts(){
        for(Receipt r : receipts){
            r.print();
            System.out.println();
        }
    }
}
