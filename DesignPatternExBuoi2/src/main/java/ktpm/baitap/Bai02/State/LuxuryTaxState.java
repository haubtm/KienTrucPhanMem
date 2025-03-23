package ktpm.baitap.Bai02.State;

public class LuxuryTaxState implements TaxState {
    public double applyTax(double price) {
        return price * 0.2; // Luxury 20% tax
    }
}
