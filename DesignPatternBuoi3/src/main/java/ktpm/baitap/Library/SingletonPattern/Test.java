package ktpm.baitap.Library.SingletonPattern;

public class Test {
    public static void main(String[] args) {
        // Lấy instance của thư viện
        Library library = Library.getInstance();

        // Thêm sách vào thư viện
        library.addBook(new Book("Lập trình Java", "Nguyễn Văn A"));
        library.addBook(new Book("Design Patterns", "Erich Gamma"));
        library.addBook(new Book("Dữ liệu lớn", "Nguyễn Văn B"));

        // Hiển thị danh sách sách có sẵn
        library.displayAvailableBooks();

        // Mượn sách
        library.borrowBook("Design Patterns");
        library.borrowBook("Design Patterns");
        library.borrowBook("Lập trình Java");

        // Hiển thị danh sách sau khi mượn
        library.displayAvailableBooks();

        // Trả sách
        library.returnBook("Design Patterns");

        // Hiển thị danh sách sau khi trả sách
        library.displayAvailableBooks();
    }
}
