package ktpm.baitap.Bai03.Decorator;

public class Test {
    public static void main(String[] args) {
        PaymentComponent myPayment = new BasicPayment(100);
        myPayment = new ProcessingFeeDecorator(myPayment);
        myPayment = new DiscountDecorator(myPayment);

        System.out.println("Payment Description: " + myPayment.getDescription());
        System.out.println("Total Amount: $" + myPayment.getAmount());
    }
}
