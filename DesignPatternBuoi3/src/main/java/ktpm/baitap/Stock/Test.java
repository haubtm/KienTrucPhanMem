package ktpm.baitap.Stock;

public class Test {
    public static void main(String[] args) {
        // Tạo cổ phiếu
        Stock appleStock = new Stock("Apple", 150.0);
        Stock teslaStock = new Stock("Tesla", 700.0);

        // Tạo nhà đầu tư
        Investor investor1 = new Investor("John");
        Investor investor2 = new Investor("Alice");

        // Nhà đầu tư đăng ký theo dõi cổ phiếu
        appleStock.register(investor1);
        appleStock.register(investor2);

        teslaStock.register(investor2);

        // Thay đổi giá cổ phiếu
        appleStock.setPrice(155.0);
        teslaStock.setPrice(720.0);

        // Nhà đầu tư Alice hủy theo dõi cổ phiếu Apple
        appleStock.remove(investor2);

        // Giá cổ phiếu Apple tiếp tục thay đổi
        appleStock.setPrice(160.0);
    }
}
