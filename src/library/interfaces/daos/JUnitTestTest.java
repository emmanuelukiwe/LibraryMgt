package library.interfaces.daos;

import static org.junit.Assert.*;

import org.junit.Test;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
public class JUnitTestTest {

	
		@Test(expected=IllegalStateException.class)
	    public void testMainOne() {
	        System.out.println("mainOne");
	        Book book = new Book("Emman", "ProfProg","123",20);
	       JUnitTest instance = new JUnitTest();
	        instance.mainOne(book);
	        // TODO review the generated test code and remove the default call to fail.
	        
	    }
	

@Test
public void testcheckNewBookState() {
	System.out.println("checkNewBookState");
    Book book = new Book("Emman", "ProfProg","123",20);
    JUnitTest instance = new JUnitTest();
    EBookState expResult = EBookState.AVAILABLE;
    EBookState result = instance.checkNewBookState(book);
    assertEquals(expResult, result);
}

@Test
public void testCheckBorrow() {
    System.out.println("checkBorrow");
    IBook book= new Book("Emman", "ProfProg","123",20);
    IMember member=new Member("Emma","Ukiwe","00","uk@mail.com",43);
    SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
    Date date1=null;
    Date date2=null;
    try{
        date1 = dateformat3.parse("01/10/2015");
    

    date2 = dateformat3.parse("15/10/2015");
    }
    catch(ParseException e){}

    Loan loan = new Loan(book,member,date1,date2);
    JUnitTest instance = new JUnitTest();
    instance.checkBorrow(loan);
    
    
//this code will cause the program to throw illegalstateexception because the book
//state is on loan but this member wants to borrow
//IMember member1=new Member("Emmatu","Ukiwetu","00","uk@mail.com",50);
//Loan loan1 = new Loan(book,member1,date1,date2);
//instance.checkBorrow(loan);
}

}

