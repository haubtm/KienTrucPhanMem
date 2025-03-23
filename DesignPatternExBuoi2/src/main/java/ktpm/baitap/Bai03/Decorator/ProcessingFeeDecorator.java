package ktpm.baitap.Bai03.Decorator;

class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(PaymentComponent payment) {
        super(payment);
    }

    public double getAmount() {
        return super.getAmount() + 5.0; // Thêm $5 phí xử lý
    }

    public String getDescription() {
        return super.getDescription() + ", with Processing Fee";
    }
}
