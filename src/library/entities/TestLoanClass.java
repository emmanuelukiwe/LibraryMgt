package library.entities;

import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

public class TestLoanClass {
	
	public ELoanState testNewLoanState(Loan loan){
		return loan.getState();
		
		
	}
	public String testGetBorrower(Loan loan){
		return loan.getBorrower().getFirstName();
	}

	public String testGetBook(Loan loan) {
		return loan.getBook().getAuthor();
}
}