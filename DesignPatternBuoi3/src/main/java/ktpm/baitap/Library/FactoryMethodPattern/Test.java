package ktpm.baitap.Library.FactoryMethodPattern;

public class Test {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Tạo Factory cho từng loại sách
        BookFactory physicalFactory = new PhysicalBookFactory();
        BookFactory ebookFactory = new EbookFactory();
        BookFactory audiobookFactory = new AudiobookFactory();

        // Thêm sách vào thư viện
        library.addBook(physicalFactory, "Lập trình Java", "Nguyễn Văn A");
        library.addBook(ebookFactory, "Design Patterns", "Erich Gamma");
        library.addBook(audiobookFactory, "Kinh tế học cơ bản", "Adam Smith");

        // Hiển thị danh sách sách
        library.displayBooks();
    }
}
