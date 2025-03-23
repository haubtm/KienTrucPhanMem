package ktpm.baitap.Bai03.Strategy;

class BankTransferPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Bank Transfer.");
    }
}
