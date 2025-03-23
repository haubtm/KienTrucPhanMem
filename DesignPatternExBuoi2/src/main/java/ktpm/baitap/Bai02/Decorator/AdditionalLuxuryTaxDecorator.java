package ktpm.baitap.Bai02.Decorator;

import ktpm.baitap.Bai02.State.TaxState;

public class AdditionalLuxuryTaxDecorator extends TaxDecorator{
    public AdditionalLuxuryTaxDecorator(TaxState taxState) {
        super(taxState);
    }

    public double applyTax(double price) {
        return super.applyTax(price) + (price * 0.05); // Additional 5% tax
    }
}
