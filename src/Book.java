import java.util.Objects;

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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(description, book.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, description, pages);
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
