package ktpm.baitap.Library.SingletonPattern;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("✅ Đã mượn sách: " + title);
        } else {
            System.out.println("❌ Sách " + title + " hiện không có sẵn!");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("📚 Đã trả sách: " + title);
    }
}
