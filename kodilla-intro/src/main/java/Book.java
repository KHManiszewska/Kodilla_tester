public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static void of(String author, String title) {
        Book book = new Book(author, title);
    }
}
