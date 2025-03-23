package ktpm.baitap.Bai02.State;

public class Test {
    public static void main(String[] args) {
        TaxContext taxContext = new TaxContext();

        taxContext.setTaxState(new StandardTaxState());
        System.out.println("State - Standard Tax on $1000: " + taxContext.calculateTax(1000));

        taxContext.setTaxState(new LuxuryTaxState());
        System.out.println("State - Luxury Tax on $5000: " + taxContext.calculateTax(5000));
    }
}
