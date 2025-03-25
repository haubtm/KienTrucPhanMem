package ktpm.baitap.Library.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private List<Book> books;
    private SearchStrategy searchStrategy;

    private Library() {
        books = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    // Thiết lập chiến lược tìm kiếm
    public void setSearchStrategy(SearchStrategy strategy) {
        this.searchStrategy = strategy;
    }

    // Tìm kiếm sách
    public void searchBooks(String keyword) {
        if (searchStrategy == null) {
            System.out.println("⚠️ Chưa chọn chiến lược tìm kiếm!");
            return;
        }
        searchStrategy.search(books, keyword);
    }

    // Hiển thị danh sách sách có sẵn
    public void displayBooks() {
        System.out.println("\n📘 Danh sách sách trong thư viện:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
