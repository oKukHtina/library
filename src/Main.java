public class Main {
    public static void main(String[] args) {
        Book bookAboutCats = new Book(
                "Cats In Our Life",
                "Diana Meow",
                "Everything about cats",
                213
        );

        Book bookAboutDogs = new Book(
                "Dogs In Our Life",
                "Diana Gav",
                "Everything about dogs",
                352
        );

        Book bookAboutParrots = new Book(
                "Parrots In Our Life",
                "Diana Perr",
                "Everything about perrots",
                152
        );

        User bob = new User("Bob");

        Library library = new Library();
        library.addBook(bookAboutCats);
        library.addBook(bookAboutDogs);
        library.addBook(bookAboutParrots);

        System.out.println(library.getBooks());

        System.out.println();
        System.out.println(
                "the library lent the book \n"
                        + library.getBookToUser(bob, "Parrots In Our Life")
                        + "\nto this user : " + bob.getUsername()
        );

        System.out.println();
        System.out.println("User : " + bob.getUsername()
                + "\nhas the following books: \n"
                + bob.getTakenBooksList());

        System.out.println();
        System.out.println("Books before Library removing :\n" + library.getBooks());
        System.out.println();
        System.out.println("Deleted book : " + library.deleteBook("Dogs In Our Life"));
        System.out.println("Books after Library removing :\n" + library.getBooks());

        System.out.println();
        System.out.println("BookListByUser before removing : \n" + bob.getTakenBooksList());
        System.out.println();
        System.out.println("Removed book : " + bob.removeTakenBook("Parrots In Our Life"));
        System.out.println();
        System.out.println("BookListByUser after removing : \n" + bob.getTakenBooksList());

    }
}
