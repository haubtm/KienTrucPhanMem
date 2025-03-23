package ktpm.baitap.Bai03.Decorator;

class BasicPayment implements PaymentComponent {
    private double amount;

    public BasicPayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return "Basic Payment";
    }
}
