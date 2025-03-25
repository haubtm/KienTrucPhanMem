package ktpm.baitap.Library.DecoratorPattern;

public class BasicBook implements BorrowableBook {
    private String title;

    public BasicBook(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "📖 Sách: " + title;
    }

    @Override
    public void borrowBook() {
        System.out.println("📚 Đã mượn sách: " + title);
    }
}
