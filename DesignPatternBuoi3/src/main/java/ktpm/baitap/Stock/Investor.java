package ktpm.baitap.Stock;

class Investor implements StockObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    // Cập nhật thông tin khi giá cổ phiếu thay đổi
    @Override
    public void update(String stockName, double price) {
        System.out.println("🔔 Nhà đầu tư " + name + " nhận thông báo: Cổ phiếu " + stockName + " hiện có giá: " + price);
    }
}