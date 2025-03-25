package ktpm.baitap.Library.StrategyPattern;

import java.util.List;
public class SearchByAuthor implements SearchStrategy {
    public void search(List<Book> books, String keyword) {
        System.out.println("\n🔎 Kết quả tìm kiếm theo TÁC GIẢ:");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(keyword)) {
                book.displayInfo();
            }
        }
    }
}
