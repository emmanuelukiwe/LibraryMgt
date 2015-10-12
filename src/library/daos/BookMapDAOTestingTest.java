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
   String expResult = "RECEP";//Expects to receive RECEP
   
    String result = instance.printAuthor("12"); //Passes callnUmber as parameter
    System.out.println(result);
    assertEquals(expResult, result);//check whether expected result is actual result
}
	
	@Test
	 public void testprintTitle() {


	System.out.println("printTitle");
  BookMapDAOTesting instance = new BookMapDAOTesting ();
 String expResult = "PYTHON";//expects to receive PYTHON
 
  String result = instance.printTitle("RECEP");//Passes Author as parameter
  System.out.println(result);
  assertEquals(expResult, result);//check whether expected result is actual result
}
	@Test
	 public void testconfirmAddBook() {


	System.out.println("confirmAddBook");
 BookMapDAOTesting instance = new BookMapDAOTesting ();
 IBook book=new Book("EMMANUEL","HTML","12",14);
boolean expResult = true;//Expects to receive true

 boolean result = instance.confirmAddBook(book);//passess book as parameter
 System.out.println(result);
 assertEquals(expResult, result);//check whether expected result is actual result
}
	
	

	
}


