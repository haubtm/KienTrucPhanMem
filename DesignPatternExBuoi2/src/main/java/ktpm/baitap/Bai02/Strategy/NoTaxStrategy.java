package ktpm.baitap.Bai02.Strategy;

public class NoTaxStrategy implements TaxStrategy {
    public double calculateTax(double price) {
        return 0.0;
    }
}
