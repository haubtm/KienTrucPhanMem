package ktpm.baitap.Bai01.State;

public class CanceledState implements OrderState{
    public void handleOrder(OrderContext context) {
        System.out.println("Order is canceled and refund issued.");
    }
}
