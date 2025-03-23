package ktpm.baitap.Bai03.Decorator;

abstract class PaymentDecorator implements PaymentComponent {
    protected PaymentComponent payment;

    public PaymentDecorator(PaymentComponent payment) {
        this.payment = payment;
    }

    public double getAmount() {
        return payment.getAmount();
    }

    public String getDescription() {
        return payment.getDescription();
    }
}
