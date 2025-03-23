package ktpm.baitap.Bai03.State;

class RefundedPaymentState implements PaymentState {
    public void handlePayment(PaymentContext context) {
        System.out.println("Payment has been refunded.");
    }
}
