public class Credit extends Payment {
    private final String cardNumber; // Stores the credit card number

    // Constructor to initialize the payment type
    public Credit(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber; // Sets the credit card number
    }


    public String getType() {
        return "Credit Card";
    }

    // Overrides to show card details
    public String toString() {
        return super.toString() + ", Card Number: " + cardNumber;
    }
}
