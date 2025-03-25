package ktpm.baitap.Stock;

public interface StockObserver {
    void update(String stockName, double price); // Cập nhật giá cổ phiếu mới
}
