package ktpm.baitap.Library.FactoryMethodPattern;

class Ebook extends Book {
    public Ebook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("📱 Ebook: " + title + " - " + author);
    }
}
