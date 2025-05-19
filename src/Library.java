import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Library {
    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookToUser(final User user, final String title) {
        Book foundBook = books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
        if (foundBook != null) {
            user.addTakenBook(foundBook);
        }
        return foundBook;
    }

    public Book deleteBook(final String title) {
        Book foundBook = books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
        if (foundBook != null) {
            books.remove(foundBook);
        }

        return foundBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }
}
