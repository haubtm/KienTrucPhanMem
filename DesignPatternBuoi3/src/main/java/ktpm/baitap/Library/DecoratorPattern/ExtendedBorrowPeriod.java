package ktpm.baitap.Library.DecoratorPattern;

// Decorator: Gia hạn thời gian mượn sách
public class ExtendedBorrowPeriod extends BookDecorator {
    public ExtendedBorrowPeriod(BorrowableBook decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Gia hạn thời gian mượn)";
    }

    @Override
    public void borrowBook() {
        super.borrowBook();
        System.out.println("⏳ Thời gian mượn đã được gia hạn.");
    }
}
