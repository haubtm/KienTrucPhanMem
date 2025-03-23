package ktpm.baitap.Bai01.Decorator;

abstract class OrderDecorator implements OrderComponent {
    protected OrderComponent order;

    public OrderDecorator(OrderComponent order) {
        this.order = order;
    }

    public String getDescription() {
        return order.getDescription();
    }

    public double getCost() {
        return order.getCost();
    }
}
