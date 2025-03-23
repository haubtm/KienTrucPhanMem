package ktpm.baitap.Bai01.Decorator;

public class ExpressShippingDecorator extends OrderDecorator{
    public ExpressShippingDecorator(OrderComponent order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", with Express Shipping";
    }

    public double getCost() {
        return super.getCost() + 15.0;
    }
}
