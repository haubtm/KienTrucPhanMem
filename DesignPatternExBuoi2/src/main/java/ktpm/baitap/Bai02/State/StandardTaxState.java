package ktpm.baitap.Bai02.State;

public class StandardTaxState implements TaxState {
    public double applyTax(double price) {
        return price * 0.1; // Standard 10% tax
    }
}
