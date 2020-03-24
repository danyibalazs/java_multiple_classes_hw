import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (this.capacity > getBooks()) {
            this.books.add(book);
        }
    }

    public void removeBook(Book book) {
       this.books.remove(book);
    }

    public void borrowBook(Book book, Borrower borrower){
        removeBook(book);
        borrower.addBook(book);
    }
}
