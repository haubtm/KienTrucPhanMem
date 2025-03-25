package ktpm.baitap.Library.StrategyPattern;

import java.util.List;
public interface SearchStrategy {
    void search(List<Book> books, String keyword);
}
