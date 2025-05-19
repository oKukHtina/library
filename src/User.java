import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class User {
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

    public Book removeTakenBook(final String title) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username)
                && Objects.equals(takenBooksList, user.takenBooksList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, takenBooksList);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", takenBooksList=" + takenBooksList +
                '}';
    }
}
