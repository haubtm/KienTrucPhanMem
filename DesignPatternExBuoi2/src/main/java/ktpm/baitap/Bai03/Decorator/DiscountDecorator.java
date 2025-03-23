package ktpm.baitap.Bai03.Decorator;

class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentComponent payment) {
        super(payment);
    }

    public double getAmount() {
        return super.getAmount() - 10.0; // Giảm $10
    }

    public String getDescription() {
        return super.getDescription() + ", with Discount";
    }
}
