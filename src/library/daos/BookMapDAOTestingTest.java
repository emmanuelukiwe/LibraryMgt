package library.daos;
import java.util.List;

import library.entities.Book;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookMapDAOTestingTest {

	@Test
	 public void printAuthor() {


	System.out.println("printAuthor");
    BookMapDAOTesting instance = new BookMapDAOTesting ();
   String expResult = "RECEP";
   
    String result = instance.printAuthor("12");
    assertEquals(expResult, result);
}
	
	@Test
	 public void testprintTitle() {


	System.out.println("printTitle");
   BookMapDAOTesting instance = new BookMapDAOTesting ();
  String expResult = "PYTHON";
  
   String result = instance.printTitle("RECEP");
   assertEquals(expResult, result);
}
	@Test
	 public void testconfirmAddBook() {


	System.out.println("confirmAddBook");
  BookMapDAOTesting instance = new BookMapDAOTesting ();
  IBook book=new Book("EMMANUEL","HTML","12",14);
 boolean expResult = true;
 
  boolean result = instance.confirmAddBook(book);
  assertEquals(expResult, result);
}
	
	
	
}


