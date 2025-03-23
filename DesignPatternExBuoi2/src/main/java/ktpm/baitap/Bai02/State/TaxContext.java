package ktpm.baitap.Bai02.State;

public class TaxContext {
    private TaxState taxState;

    public TaxContext() {
        this.taxState = new NoTaxState(); // Default state
    }

    public void setTaxState(TaxState taxState) {
        this.taxState = taxState;
    }

    public double calculateTax(double price) {
        return taxState.applyTax(price);
    }
}
