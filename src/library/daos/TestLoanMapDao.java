package library.daos;

import java.util.Calendar;
import java.util.Date;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.entities.ELoanState;
import library.interfaces.entities.ILoan;

public class TestLoanMapDao {
	
public boolean testOverDue(){
	
	
		LoanHelper helper=new LoanHelper();
		

		Book book= new Book("Adenike","JAVA2","12",12);
		Member member=new Member("Emmanuel","Ukiwe","0470658130","emman@y.com",1);
		Date borrowDate=new Date();
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK,14);
		Date returnDate=cal.getTime();
		ILoan loan= helper.makeLoan(book, member, borrowDate, returnDate);
		loan.commit(1);
		
		return loan.checkOverDue(cal.getTime());
		
		
			}
public ELoanState testOverDue1(){
	
	
	LoanHelper helper=new LoanHelper();
	

	Book book= new Book("Adenike","JAVA2","12",12);
	Member member=new Member("Emmanuel","Ukiwe","0470658130","emman@y.com",1);
	Date borrowDate=new Date();
	Calendar cal=Calendar.getInstance();
	cal.set(Calendar.DAY_OF_WEEK,14);
	Date returnDate=cal.getTime();
	ILoan loan= helper.makeLoan(book, member, borrowDate, returnDate);
	loan.commit(1);
	
	
	ELoanState state=((Loan) loan).getState();
	return state;
	
	
		}

public ELoanState testOverDue2(){
	
	
	LoanHelper helper=new LoanHelper();
	

	Book book= new Book("Adenike","JAVA2","12",12);
	Member member=new Member("Emmanuel","Ukiwe","0470658130","emman@y.com",1);
	Date borrowDate=new Date();
	Calendar cal=Calendar.getInstance();
	cal.set(Calendar.DAY_OF_WEEK,14);
	Date returnDate=cal.getTime();
	ILoan loan= helper.makeLoan(book, member, borrowDate, returnDate);
	loan.commit(1);
	loan.complete();
	
	
	ELoanState state=((Loan) loan).getState();
	return state;
	
	
		}
public ELoanState testOverDue3(){
	
	
	LoanHelper helper=new LoanHelper();
	

	Book book= new Book("Adenike","JAVA2","12",12);
	Member member=new Member("Emmanuel","Ukiwe","0470658130","emman@y.com",1);
	Date borrowDate=new Date();
	Calendar cal=Calendar.getInstance();
	cal.set(Calendar.DAY_OF_WEEK,14);
	Date returnDate=cal.getTime();
	ILoan loan= helper.makeLoan(book, member, borrowDate, returnDate);
	
	
	loan.isOverDue();
	
	
	ELoanState state=((Loan) loan).getState();
	return state;


}
}



