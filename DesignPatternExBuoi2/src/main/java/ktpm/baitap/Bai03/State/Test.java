package ktpm.baitap.Bai03.State;

public class Test {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.processPayment(); // Chờ xử lý -> Đã xác nhận
        paymentContext.processPayment(); // Đã xác nhận (không thay đổi)

        PaymentContext failedPayment = new PaymentContext();
        failedPayment.setState(new FailedPaymentState());
        failedPayment.processPayment(); // Thanh toán thất bại

        PaymentContext refundedPayment = new PaymentContext();
        refundedPayment.refundPayment(); // Hoàn tiền
    }
}
