package library.entities;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import library.interfaces.entities.ELoanState;

import org.junit.Test;

public class LoanClassTesting {

	@Test
	public void testTestNewLoanState() {
		
		Book book= new Book("Adenike","JAVA2","12",12);
		Member member=new Member("Emmanuel","Ukiwe","0470658130","emman@y.com",1);
		Date borrowDate=new Date();
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK,14);
		Date returnDate=cal.getTime();
		
		
		Loan loan= new Loan( book, member, borrowDate, returnDate);
		ELoanState expResult=ELoanState.PENDING;
		TestLoanClass instance=new TestLoanClass();
		ELoanState result=instance.testNewLoanState(loan);
		assertEquals(expResult,result);

}
	

	@Test
	public void testTestGetBorrower() {
		
		Book book= new Book("Adenike","JAVA2","12",12);
		Member member=new Member("Emmanuel","Ukiwe","0470658130","emman@y.com",1);
		Date borrowDate=new Date();
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK,14);
		Date returnDate=cal.getTime();
		
		
		Loan loan= new Loan( book, member, borrowDate, returnDate);
		String expResult="Emmanuel";
		TestLoanClass instance=new TestLoanClass();
		String result=instance.testGetBorrower(loan);
		assertEquals(expResult,result);

}
	@Test
	public void testTestGetBook() {
		

		Book book= new Book("Adenike","JAVA2","12",12);
		Member member=new Member("Emmanuel","Ukiwe","0470658130","emman@y.com",1);
		Date borrowDate=new Date();
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK,14);
		Date returnDate=cal.getTime();
		
		
		Loan loan= new Loan( book, member, borrowDate, returnDate);
		String expResult="Adenike";
		TestLoanClass instance=new TestLoanClass();
		String result=instance.testGetBook(loan);
		assertEquals(expResult,result);
	}
	
	

}
