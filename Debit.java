public class Debit extends Payment {
    private final String cardNumber; // Stores the debit card number

    // Constructor to initialize the payment type
    public Debit(double amount, String cardNumber) {
        super(amount); // Calls to set payment amount
        this.cardNumber = cardNumber; // Set the debit card number
    }

    public String getType() {
        return "Debit Card";
    }

    //Displays card details
    public String toString() {
        return super.toString() + ", Card Number: " + cardNumber;
    }
}
