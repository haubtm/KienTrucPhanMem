package ktpm.baitap.Library.StrategyPattern;

import java.util.List;
public class SearchByTitle implements SearchStrategy {
    public void search(List<Book> books, String keyword) {
        System.out.println("\n🔎 Kết quả tìm kiếm theo TÊN:");
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(keyword)) {
                book.displayInfo();
            }
        }
    }
}
