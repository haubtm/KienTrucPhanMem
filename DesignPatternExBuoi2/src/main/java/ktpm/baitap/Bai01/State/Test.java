package ktpm.baitap.Bai01.State;

public class Test {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.processOrder(); // Checking order information
        orderContext.processOrder(); // Packing and shipping
        orderContext.cancelOrder(); // Order is canceled
        orderContext.processOrder(); // Order is canceled and refund issued
    }
}
