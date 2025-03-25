package ktpm.baitap.Library.DecoratorPattern;

public class Test {
    public static void main(String[] args) {
        // Sách cơ bản
        BorrowableBook book1 = new BasicBook("Lập trình Java");
        BorrowableBook book2 = new BasicBook("Design Patterns");

        // Mượn sách với gia hạn thời gian
        BorrowableBook extendedBook = new ExtendedBorrowPeriod(book1);

        // Mượn sách với phiên bản đặc biệt (Chữ nổi)
        BorrowableBook specialEdition = new SpecialEditionBook(book2, "Chữ nổi (Braille)");

        // Kết hợp cả hai: Sách đặc biệt + Gia hạn thời gian
        BorrowableBook specialExtended = new ExtendedBorrowPeriod(new SpecialEditionBook(book1, "Bản dịch tiếng Anh"));

        // Hiển thị thông tin sách
        System.out.println(extendedBook.getDescription());
        extendedBook.borrowBook();

        System.out.println("\n" + specialEdition.getDescription());
        specialEdition.borrowBook();

        System.out.println("\n" + specialExtended.getDescription());
        specialExtended.borrowBook();
    }
}
