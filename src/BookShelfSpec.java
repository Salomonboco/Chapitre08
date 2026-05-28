import bookstoread.BookShelf;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

    public class BookShelfSpec {
        @Test
        public void shelfEmptyWhenNoBookAdded() throws Exception {
            BookShelf Shelf= new BookShelf();
            List<String> books = Shelf.books();
            assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
        }

        @Test
        void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
            bookstoread.BookShelf shelf = new bookstoread.BookShelf();
            shelf.add("Effective Java");
            shelf.add("Code Complete");
            List<String> books = shelf.books();
            assertEquals(2, books.size(), () -> "BookShelf should have two books.");
        }
    }

