public class Book {
    private String author;
    private String title;

    public Book(String a, String t) {
        this.author = a;
        this.title = t;
    }

    public static void of(String a, String t) {
        Book book = new Book(a, t);
    }
}
