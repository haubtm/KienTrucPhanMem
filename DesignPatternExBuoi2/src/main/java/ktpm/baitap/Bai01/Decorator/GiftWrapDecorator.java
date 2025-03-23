package ktpm.baitap.Bai01.Decorator;

public class GiftWrapDecorator extends OrderDecorator{
    public GiftWrapDecorator(OrderComponent order) {
        super(order);
    }

    public String getDescription() {
        return super.getDescription() + ", with Gift Wrap";
    }

    public double getCost() {
        return super.getCost() + 5.0;
    }
}
