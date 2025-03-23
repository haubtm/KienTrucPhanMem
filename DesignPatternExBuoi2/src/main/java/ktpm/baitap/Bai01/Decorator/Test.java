package ktpm.baitap.Bai01.Decorator;

public class Test {
    public static void main(String[] args) {
        OrderComponent myOrder = new BasicOrder();
        myOrder = new GiftWrapDecorator(myOrder);
        myOrder = new ExpressShippingDecorator(myOrder);

        System.out.println("Order Description: " + myOrder.getDescription());
        System.out.println("Total Cost: " + myOrder.getCost());
    }
}
