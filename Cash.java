public class Cash extends Payment {
    public Cash(double amount) {
        super(amount);
    }

    public String getType() {
        return "Cash";
    }
}
