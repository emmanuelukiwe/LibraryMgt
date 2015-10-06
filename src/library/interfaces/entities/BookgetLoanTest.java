package library.interfaces.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.daos.JUnitTest;

public class BookgetLoanTest {
	
	 public String checkBorrow(Loan loan){
	      IBook x=loan.getBook();
	      
	      x.borrow(loan);
	     
	      ILoan y= x.getLoan();
	      return y.getBorrower().getFirstName() + y.getReturnDate();
	              
   }
}
