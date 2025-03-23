package ktpm.baitap.Bai02.Strategy;

public class LuxuryTaxStrategy implements TaxStrategy{
    public double calculateTax(double price) {
        return price * 0.2;
    }
}
