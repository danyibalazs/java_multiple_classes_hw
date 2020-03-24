import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> books;

    public Borrower(String name){
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public int getBooks(){
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}
