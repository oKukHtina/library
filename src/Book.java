public class Book {
    private final String title;
    private final String author;
    private final String description;
    private final int pages;

    public Book(String title, String author, String description, int pages) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", pages=" + pages +
                '}';
    }
}
