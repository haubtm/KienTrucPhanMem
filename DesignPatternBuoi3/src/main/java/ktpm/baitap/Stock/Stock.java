package ktpm.baitap.Stock;
import java.util.ArrayList;
import java.util.List;

class Stock implements StockSubject {
    private String name;
    private double price;
    private List<StockObserver> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Đăng ký nhà đầu tư
    @Override
    public void register(StockObserver observer) {
        observers.add(observer);
    }

    // Hủy đăng ký nhà đầu tư
    @Override
    public void remove(StockObserver observer) {
        observers.remove(observer);
    }

    // Thông báo đến nhà đầu tư khi giá thay đổi
    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(name, price);
        }
    }

    // Thay đổi giá cổ phiếu
    public void setPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("\n📈 Cổ phiếu " + name + " thay đổi giá: " + price);
        notifyObservers();
    }
}
