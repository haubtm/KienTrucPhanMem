package ktpm.baitap.Library.DecoratorPattern;

// Decorator: Mượn sách phiên bản đặc biệt (ví dụ: sách chữ nổi, bản dịch)
public class SpecialEditionBook extends BookDecorator {
    private String editionType;

    public SpecialEditionBook(BorrowableBook decoratedBook, String editionType) {
        super(decoratedBook);
        this.editionType = editionType;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Phiên bản: " + editionType + ")";
    }

    @Override
    public void borrowBook() {
        super.borrowBook();
        System.out.println("🎁 Mượn phiên bản đặc biệt: " + editionType);
    }
}
