package ktpm.baitap.Library.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;

    // Private constructor để ngăn chặn tạo nhiều đối tượng
    private Library() {
        books = new ArrayList<>();
    }

    // Singleton - Chỉ có một instance của Library
    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // Thêm sách mới vào thư viện
    public void addBook(Book book) {
        books.add(book);
        System.out.println("📖 Đã thêm sách mới: " + book.getTitle());
    }

    // Hiển thị danh sách sách có sẵn
    public void displayAvailableBooks() {
        System.out.println("\n📚 Danh sách sách có sẵn:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle() + " (Tác giả: " + book.getAuthor() + ")");
            }
        }
    }

    // Mượn sách theo tên
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.borrow();
                return;
            }
        }
        System.out.println("❌ Không tìm thấy sách: " + title);
    }

    // Trả sách theo tên
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                return;
            }
        }
        System.out.println("❌ Không tìm thấy sách cần trả: " + title);
    }
}
