import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    private Book book1;
    private Book book2;
    private Book book3;

    private Borrower borrower;

    @Before
    public void before(){
        this.library = new Library(100);

        this.book1 = new Book("title1", "author1", "crime");
        this.book2 = new Book("title2", "author2", "horror");
        this.book3 = new Book("title3", "author3", "thriller");

        this.borrower = new Borrower("Bob");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBooks());
    }

    @Test
    public void testAddBookWithEnoughCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.getBooks());
    }

    @Test
    public void testAddBookWithoutEnoughCapacity(){
        Library smallLibrary = new Library(2);
        smallLibrary.addBook(book1);
        smallLibrary.addBook(book2);
        smallLibrary.addBook(book3);
        assertEquals(2, smallLibrary.getBooks());
    }

    @Test
    public void borrowBookToCustomer(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.borrowBook(book1, borrower);
        library.borrowBook(book2, borrower);
        assertEquals(1, library.getBooks());
        assertEquals(2, borrower.getBooks());
    }
}
