package ktpm.baitap.Bai03.State;

class PendingPaymentState implements PaymentState {
    public void handlePayment(PaymentContext context) {
        System.out.println("Payment is pending. Processing...");
        context.setState(new ConfirmedPaymentState());
    }
}
