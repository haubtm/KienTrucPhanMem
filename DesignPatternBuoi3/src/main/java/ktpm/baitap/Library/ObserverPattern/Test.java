package ktpm.baitap.Library.ObserverPattern;

public class Test {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Tạo người dùng và nhân viên
        User user1 = new User("Nguyễn Văn A");
        User user2 = new User("Trần Thị B");
        Employee librarian = new Employee("Quản lý thư viện");

        // Đăng ký nhận thông báo
        library.addObserver(user1);
        library.addObserver(user2);
        library.addObserver(librarian);

        // Thêm sách mới
        Book book1 = new Book("Lập trình Java", "Nguyễn Văn A", "Lập trình");
        library.addBook(book1);

        Book book2 = new Book("Design Patterns", "Erich Gamma", "Khoa học máy tính");
        library.addBook(book2);

        // Trả sách
        library.returnBook(book1);

        // Hiển thị danh sách sách
        library.displayBooks();
    }
}
