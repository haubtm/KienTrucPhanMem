package ktpm.baitap.Bai01.State;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handleOrder(this);
    }

    public void cancelOrder() {
        this.state = new CanceledState();
        this.state.handleOrder(this);
    }
}
