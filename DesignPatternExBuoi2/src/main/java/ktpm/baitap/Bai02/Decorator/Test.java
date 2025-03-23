package ktpm.baitap.Bai02.Decorator;

import ktpm.baitap.Bai02.State.LuxuryTaxState;
import ktpm.baitap.Bai02.State.TaxState;

public class Test {
    public static void main(String[] args) {
        TaxState luxuryTaxWithAdditional = new AdditionalLuxuryTaxDecorator(new LuxuryTaxState());
        System.out.println("Luxury Tax with Additional Tax on 5000: " + luxuryTaxWithAdditional.applyTax(5000));
    }
}
