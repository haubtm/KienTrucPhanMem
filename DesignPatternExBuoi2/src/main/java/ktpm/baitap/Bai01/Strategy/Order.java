package ktpm.baitap.Bai01.Strategy;

public class Order {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
