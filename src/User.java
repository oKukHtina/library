import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private final List<Book> takenBooksList;


    public User(String username) {
        this.username = username;
        takenBooksList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Book> getTakenBooksList() {
        return takenBooksList;
    }

    public void addTakenBook(Book book) {
        takenBooksList.add(book);
    }

    public Book removeTakenBook(String title) {
        Book removedBook = takenBooksList.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);
        if (removedBook != null) {
            takenBooksList.remove(removedBook);
        }
        return removedBook;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", takenBooksList=" + takenBooksList +
                '}';
    }
}
