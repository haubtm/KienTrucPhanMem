package ktpm.baitap.Bai03.State;

class FailedPaymentState implements PaymentState {
    public void handlePayment(PaymentContext context) {
        System.out.println("Payment failed. Please try again.");
    }
}
