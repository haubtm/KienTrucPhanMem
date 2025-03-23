package ktpm.baitap.Bai01.Decorator;

public class BasicOrder implements OrderComponent {
    public String getDescription() {
        return "Basic Order";
    }
    public double getCost() {
        return 50.0;
    }
}
