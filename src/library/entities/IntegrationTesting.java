//This is the integration testing of our assignment.
//In this phase, we are testing all the classes together to see how they interact
//having tested them individually
// We instantiated a book, a Member and a loan instance which we used mainly
//to manipulate the phases of the borrowing a book


package library.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.daos.LoanHelper;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

public class IntegrationTesting {
	public static void main(String [] args){
	
	//Here we create a book instance	
		Book book=new Book("Emmanuel", "Professional Java", "11",11);
		
		//Here we create a member instance
	    IMember member=new Member("Emma","Ukiwe","00","uk@mail.com",43);
	    
	    //Here we create a Date instance
	    SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
	    Date date1=null;
	    Date date2=null;
	    
	    //In this try and catch we initialize the borrow date and return date
	    //and also handle the exception that might occur due to wrong parsing
	    try{
	        date1 = dateformat3.parse("01/10/2015");
	    

	    date2 = dateformat3.parse("15/10/2015");
	    }
	    catch(ParseException e){}
	    
	    //Here we create a loan instance 
	    Loan loan = new Loan(book,member,date1,date2);
	    
	  //We then decided to check a books state before its been borrowed
	   System.out.println("Book's state before being borrowed :" +book.getState());
	   
	   //The borrow method is called on the book
	    book.borrow(loan);
	    
	    //We then check the state of the book after its been borrowed
	    System.out.println("Book state after being borrowed" +book.getState());
	    
	    //We also checked the name of the borrower of the book
	    System.out.println("Borrower :" +loan.getBorrower().getFirstName());  
	    
	    //We then checked the author of the borrowed book
	    System.out.println("Book's Author :" +book.getAuthor());
	    
	    //We also checked the title of the borrowed book
	    System.out.println( "Book's title :" + book.getTitle());
	    
	    //The book was then returned undamaged(false)
	    book.returnBook(false);
	    
	    //We then reconfirmed the state of the book after being returned
	    System.out.println("Book's State after being returned " +book.getState());
	    
	    System.out.println();
	   
	    //Here we moved to the loan object by checking the loan state befor its committed
	    System.out.println("Loan's State  before being committed: " +loan.getState());
	    
	    //We then committed the loan 
		loan.commit(1);
		//We then decided to check the state of the loan after its being committed
	    System.out.println("Loan State after being commited :"+ loan.getState());
	    
	    //We then completed the loan which is the final stage for the loan state
	    loan.complete();
	    
	    //We then checked the state after the loan was completed
	    System.out.println("Loan's State after being completed : "+ loan.getState());
	    System.out.println();
	    
	    //We decided to check if the loan was overdue
	    System.out.println("Is loan overdue? : " +loan.isOverDue());
	    
	    //We then checked the returnDate for the loan object
	    System.out.println("Return Date :" +loan.getReturnDate());
	    
	    //We then checked if the borrower has any fines payable
	    System.out.println("Any Fine payable ? :" +loan.getBorrower().hasFinesPayable());
	    System.out.println();
	    
	   //initialize a fine
	    float x=10.0F;
	    
	    //We then added fine to the borrowers account
	    loan.getBorrower().addFine(x);
	    
	    //We then confirmed that the fine has been added to his account
	    System.out.println("Any Fine payable ? :" +loan.getBorrower().hasFinesPayable());
	    
	    //We checked whether there borrower has reached loan limit
	    System.out.println("Has member reached loan Limit? :" +loan.getBorrower().hasReachedLoanLimit());
	    System.out.println();
	    
	    //We then called the get borrower method to create the member object
	    IMember member1=loan.getBorrower();
	    
	    //called the toString method of the member class, we could see from the output
	    //that the member has outstanding charges
	    
	    System.out.println(member1);
	    System.out.println("Any Fine payable ? :" +member1.hasFinesPayable());
	    
	    //We decided the pay the fine the member was owing
	    loan.getBorrower().payFine(x);
	    
	    System.out.println();
	    //We then called the member's ToString to confirm that it has been removed
	    System.out.println(member1);
	    
	    //We then called this method to confirm he has no fine payables
	    System.out.println("Any Fine payable ? :" +member1.hasFinesPayable());
	    
	    
	    
	    
	    
	    

}
}
