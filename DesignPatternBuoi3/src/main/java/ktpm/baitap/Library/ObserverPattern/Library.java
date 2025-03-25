package ktpm.baitap.Library.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
public class Library implements Observable {
    private static Library instance;
    private List<Book> books;
    private List<Observer> observers;

    private Library() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // Đăng ký người nhận thông báo
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Hủy đăng ký nhận thông báo
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Gửi thông báo đến tất cả người đăng ký
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Thêm sách mới và gửi thông báo
    public void addBook(Book book) {
        books.add(book);
        notifyObservers("📚 Sách mới: " + book.getTitle() + " đã được thêm vào thư viện!");
    }

    // Trả sách và gửi thông báo
    public void returnBook(Book book) {
        books.add(book);
        notifyObservers("✅ Sách '" + book.getTitle() + "' đã được trả lại và sẵn sàng mượn!");
    }

    // Hiển thị danh sách sách có sẵn
    public void displayBooks() {
        System.out.println("\n📘 Danh sách sách trong thư viện:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
