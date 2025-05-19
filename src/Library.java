import java.util.ArrayList;
import java.util.List;

public class Library {
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

    public Book getBookToUser(User user, String title) {
        Book foundBook = books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
        if (foundBook != null) {
            user.addTakenBook(foundBook);
        }
        return foundBook;
    }

    public Book deleteBook(String title) {
        Book foundBook = books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
        if (foundBook != null) {
            books.remove(foundBook);
        }
        return foundBook;
    }
}
