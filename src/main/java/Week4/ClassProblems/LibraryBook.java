package Week4.ClassProblems;

public class LibraryBook {
    private String title;
    private String isbn;
    private boolean catalogued;

    // Primary constructor[cite: 3]
    public LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.catalogued = true;
    }

    // Overloaded constructor chaining via this(...) for books with no ISBN[cite: 3]
    public LibraryBook(String title) {
        this(title, "PENDING"); 
    }

    public void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: " + catalogued);
    }

    public static void main(String[] args) {
        String[] titles = {"Clean Code", "Untitled Draft", "1984", "Notes"};
        String[] isbns = {"978-0132350884", "", "9780451524935", ""};

        for (int i = 0; i < titles.length; i++) {
            LibraryBook book;
            // Check condition and dispatch to the correct constructor[cite: 3]
            if (isbns[i].isEmpty()) {
                book = new LibraryBook(titles[i]);
            } else {
                book = new LibraryBook(titles[i], isbns[i]);
            }
            book.printStatus();
        }
    }
}