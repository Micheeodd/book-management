import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Père riche, père pauvre", "Robert Kiyosaki", 1997);
        library.addBook(book);
        assertEquals(1, library.listBooks().size());
    }

    @Test
    public void testRemoveBookByTitle() {
        Library library = new Library();
        library.addBook(new Book("Central Park", "Guillaume Musso", 2014));
        boolean removed = library.removeBookByTitle("Central Park");
        assertTrue(removed);
        assertEquals(0, library.listBooks().size());
    }

    @Test
    public void testFindBookByTitle() {
        Library library = new Library();
        Book book = new Book("Holocauste au Congo", "Charles Onana", 2023);
        library.addBook(book);
        Book found = library.findBookByTitle("holocauste au congo");
        assertNotNull(found);
        assertEquals("Holocauste au Congo", found.getTitle());
    }

    @Test
    public void testListBooks() {
        Library library = new Library();
        library.addBook(new Book("Père riche, père pauvre", "Robert Kiyosaki", 1997));
        library.addBook(new Book("Central Park", "Guillaume Musso", 2014));
        List<Book> books = library.listBooks();
        assertEquals(2, books.size());
    }
}
