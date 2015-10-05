package library.daos;
import java.util.List;

import library.entities.Book;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookMapDAOTestingTest {

	@Test
	 public void testcheckNewBookState() {


	System.out.println("checkNewBookState");
    BookMapDAOTesting instance = new BookMapDAOTesting ();
   String expResult = "RECEP";
   
    String result = instance.printAuthor("12");
    assertEquals(expResult, result);
}
}


