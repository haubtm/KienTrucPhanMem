package ktpm.baitap.Bai01.Strategy;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setPaymentStrategy(new CreditCardPayment());
        order.processPayment(100); // Pay using Credit Card

        order.setPaymentStrategy(new PayPalPayment());
        order.processPayment(200); // Pay using PayPal
    }
}
