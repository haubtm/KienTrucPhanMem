package ktpm.baitap.Library.DecoratorPattern;

public abstract class BookDecorator implements BorrowableBook {
    protected BorrowableBook decoratedBook;

    public BookDecorator(BorrowableBook decoratedBook) {
        this.decoratedBook = decoratedBook;
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription();
    }

    @Override
    public void borrowBook() {
        decoratedBook.borrowBook();
    }
}
