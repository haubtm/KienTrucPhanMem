package ktpm.baitap.Library.StrategyPattern;

import java.util.List;
public class SearchByGenre implements SearchStrategy {
    public void search(List<Book> books, String keyword) {
        System.out.println("\n🔎 Kết quả tìm kiếm theo THỂ LOẠI:");
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(keyword)) {
                book.displayInfo();
            }
        }
    }
}
