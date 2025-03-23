package ktpm.baitap.Bai02.Strategy;

public class Test {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        taxCalculator.setTaxStrategy(new StandardTaxStrategy());
        System.out.println("Standard Tax on $1000: " + taxCalculator.calculateTax(1000));

        taxCalculator.setTaxStrategy(new LuxuryTaxStrategy());
        System.out.println("Luxury Tax on $5000: " + taxCalculator.calculateTax(5000));

        taxCalculator.setTaxStrategy(new NoTaxStrategy());
        System.out.println("No Tax on $500: " + taxCalculator.calculateTax(500));
    }
}
