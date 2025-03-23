package ktpm.baitap.Bai02.Strategy;

public class TaxCalculator {
    private TaxStrategy taxStrategy;

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax(double price) {
        if (taxStrategy == null) {
            throw new IllegalStateException("Tax strategy is not set.");
        }
        return taxStrategy.calculateTax(price);
    }
}
