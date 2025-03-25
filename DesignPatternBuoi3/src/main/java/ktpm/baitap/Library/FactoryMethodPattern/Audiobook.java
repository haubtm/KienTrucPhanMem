package ktpm.baitap.Library.FactoryMethodPattern;

class Audiobook extends Book {
    public Audiobook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("🎧 Audiobook: " + title + " - " + author);
    }
}
