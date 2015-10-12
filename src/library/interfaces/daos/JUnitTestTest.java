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

	
		@Test(expected=IllegalStateException.class)//expects illegal exceptions else JUnit will fail
	    public void returnBookTesting() {
	        System.out.println("testReturnBook");
	        //Create book instance
	        Book book = new Book("Emman", "ProfProg","123",20);
	       JUnitTest instance = new JUnitTest();//Creste class instance for calling method
	        instance.testReturnBook(book);//call method and pass book as argument
	        
	        
	    }
	

@Test
public void testcheckNewBookState() {
	System.out.println("checkNewBookState");
    Book book = new Book("Emman", "ProfProg","123",20);//create book instance
    JUnitTest instance = new JUnitTest();
    EBookState expResult = EBookState.AVAILABLE;//expected result
    EBookState result = instance.checkNewBookState(book);//call method and pass argument
    assertEquals(expResult, result);//check whether expected result =actual result
}

@Test
public void testCheckBorrow() {
    System.out.println("checkBorrow");
    IBook book= new Book("Emman", "ProfProg","123",20);//create book instance
    IMember member=new Member("Emma","Ukiwe","00","uk@mail.com",43);//create member instance
    SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");//create datefromat instance
    Date date1=null;
    Date date2=null;
    try{
        date1 = dateformat3.parse("01/10/2015");
    

    date2 = dateformat3.parse("15/10/2015");
    }
    catch(ParseException e){}

    Loan loan = new Loan(book,member,date1,date2);//create loan instance
    JUnitTest instance = new JUnitTest();
    EBookState result=instance.checkBorrow(loan);//call method 
    EBookState expResult = EBookState.ON_LOAN;//expected result
    assertEquals(expResult, result);//test results
}
@Test(expected=RuntimeException.class)
public void testException() {
    System.out.println("testException");
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
    EBookState result=instance.checkBorrow(loan);
    EBookState expResult = EBookState.ON_LOAN;
    assertEquals(expResult, result);
    
IMember member1=new Member("Emmatu","Ukiwetu","00","uk@mail.com",50);
Loan loan1 = new Loan(book,member1,date1,date2);
instance.checkBorrow(loan);
}

}

