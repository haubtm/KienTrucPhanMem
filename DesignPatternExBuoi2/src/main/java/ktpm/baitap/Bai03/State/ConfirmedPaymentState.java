package ktpm.baitap.Bai03.State;

class ConfirmedPaymentState implements PaymentState {
    public void handlePayment(PaymentContext context) {
        System.out.println("Payment is confirmed.");
    }
}
