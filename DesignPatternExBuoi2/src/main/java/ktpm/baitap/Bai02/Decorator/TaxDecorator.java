package ktpm.baitap.Bai02.Decorator;

import ktpm.baitap.Bai02.State.TaxState;

abstract class TaxDecorator implements TaxState {
    protected TaxState taxState;

    public TaxDecorator(TaxState taxState) {
        this.taxState = taxState;
    }

    public double applyTax(double price) {
        return taxState.applyTax(price);
    }
}
