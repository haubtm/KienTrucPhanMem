package ktpm.baitap.Bai01.State;

public class DeliveredState implements OrderState {
    public void handleOrder(OrderContext context) {
        System.out.println("Order has been delivered.");
    }
}
