package ktpm.baitap.Library.FactoryMethodPattern;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;

    private Library() {
        books = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // Thêm sách vào thư viện bằng Factory
    public void addBook(BookFactory factory, String title, String author) {
        Book book = factory.createBook(title, author);
        books.add(book);
        System.out.println("📚 Đã thêm sách: " + title);
    }

    // Hiển thị tất cả sách trong thư viện
    public void displayBooks() {
        System.out.println("\n📘 Danh sách sách trong thư viện:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
