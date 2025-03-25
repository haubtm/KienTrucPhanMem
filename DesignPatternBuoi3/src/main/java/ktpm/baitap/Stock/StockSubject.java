package ktpm.baitap.Stock;

public interface StockSubject {
    void register(StockObserver observer); // Đăng ký nhà đầu tư
    void remove(StockObserver observer);   // Hủy đăng ký
    void notifyObservers();                // Thông báo đến nhà đầu tư
}
