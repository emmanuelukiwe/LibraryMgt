package library.interfaces.entities;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.daos.JUnitTest;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.daos.JUnitTest;

import org.junit.Test;

public class BookgetLoanTestTest {

	@Test
	public void testCheckBorrow() {
		
		IBook book= new Book("Emman", "ProfProg","123",20);
	    IMember member=new Member("Emma","Ukiwe","00","uk@mail.com",43);
	    SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
	    Date date1=null;
	    Date date2=null;
	    try{
	        date1 = dateformat3.parse("01/10/2015");
	    

	    date2 = dateformat3.parse("15/10/2015");
	    }
	    catch(ParseException e){
	    	System.out.println(e.getMessage());
	    }

	    Loan loan = new Loan(book,member,date1,date2);
	    BookgetLoanTest instance = new BookgetLoanTest();
	    String expResult ="Emma " +"Thu Oct 15 00:00:00 EST 2015";
	    String result=instance.checkBorrow(loan);
	    System.out.println(result);
	    assertEquals(expResult, result);
	    
	}

}
