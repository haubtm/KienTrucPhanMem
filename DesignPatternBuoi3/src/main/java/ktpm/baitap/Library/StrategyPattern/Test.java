package ktpm.baitap.Library.StrategyPattern;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Thêm sách vào thư viện
        library.addBook(new Book("Lập trình Java", "Nguyễn Văn A", "Lập trình"));
        library.addBook(new Book("Design Patterns", "Erich Gamma", "Khoa học máy tính"));
        library.addBook(new Book("Lịch sử Việt Nam", "Trần Quốc Vượng", "Lịch sử"));
        library.addBook(new Book("Kinh tế học cơ bản", "Adam Smith", "Kinh tế"));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "Lập trình"));

        library.displayBooks();

        // Menu tìm kiếm
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n📚 Chọn kiểu tìm kiếm:");
            System.out.println("1️⃣ Tìm theo tên");
            System.out.println("2️⃣ Tìm theo tác giả");
            System.out.println("3️⃣ Tìm theo thể loại");
            System.out.println("4️⃣ Thoát");
            System.out.print("👉 Nhập lựa chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            if (choice == 4) {
                System.out.println("👋 Tạm biệt!");
                break;
            }

            System.out.print("🔎 Nhập từ khóa tìm kiếm: ");
            String keyword = scanner.nextLine();

            switch (choice) {
                case 1:
                    library.setSearchStrategy(new SearchByTitle());
                    break;
                case 2:
                    library.setSearchStrategy(new SearchByAuthor());
                    break;
                case 3:
                    library.setSearchStrategy(new SearchByGenre());
                    break;
                default:
                    System.out.println("⚠️ Lựa chọn không hợp lệ!");
                    continue;
            }

            library.searchBooks(keyword);
        }

        scanner.close();
    }
}
