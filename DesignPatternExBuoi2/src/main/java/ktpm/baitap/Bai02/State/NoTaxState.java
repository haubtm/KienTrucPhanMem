package ktpm.baitap.Bai02.State;

public class NoTaxState implements TaxState {
    public double applyTax(double price) {
        return 0.0; // No tax
    }
}
