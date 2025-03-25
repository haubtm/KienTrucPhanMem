package ktpm.baitap.Library.FactoryMethodPattern;

// Factory Interface
interface BookFactory {
    Book createBook(String title, String author);
}

// Concrete Factory - Tạo sách giấy
class PhysicalBookFactory implements BookFactory {
    public Book createBook(String title, String author) {
        return new PhysicalBook(title, author);
    }
}

// Concrete Factory - Tạo Ebook
class EbookFactory implements BookFactory {
    public Book createBook(String title, String author) {
        return new Ebook(title, author);
    }
}

// Concrete Factory - Tạo Audiobook
class AudiobookFactory implements BookFactory {
    public Book createBook(String title, String author) {
        return new Audiobook(title, author);
    }
}

