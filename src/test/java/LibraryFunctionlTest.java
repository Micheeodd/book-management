import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class LibraryFunctionlTest {
    @Test
    public void functionalScenarioTest() {
        Library library = new Library();
        library.addBook(new Book("Et si on arrêtait de se mentir", "Olivier Sibony", 2023));
        library.addBook(new Book("La vie est une fête", "David Laroche", 2022));
        library.removeBookByTitle("Et si on arrêtait de se mentir");

        List<Book> books = library.listBooks();
        assertEquals(1, books.size());
        assertEquals("La vie est une fête by David Laroche (2022)", books.get(0).toString());
    }
}
