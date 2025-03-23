package ktpm.baitap.Bai03.State;

public class PaymentContext {
    private PaymentState state;

    public PaymentContext() {
        this.state = new PendingPaymentState(); // Mặc định đang xử lý
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void processPayment() {
        state.handlePayment(this);
    }

    public void refundPayment() {
        this.state = new RefundedPaymentState();
        this.state.handlePayment(this);
    }
}
