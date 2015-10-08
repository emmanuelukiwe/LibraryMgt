package library.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.interfaces.daos.JUnitTest;
import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

public class BookTest {

	
	public EBookState testLose(){
		Book book=new Book("Emmanuel", "Professional Java", "11",11);
		
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
	   
	    book.borrow(loan);
	    System.out.println(book.getState());
	    
	    book.lose();
	    System.out.println(book.getState());
	    
	    return book.getState();
	}
	
	public EBookState testDispose(){
		Book book1=new Book("Samuel", "Python", "12",1);
		
	    
	   
	    System.out.println(book1.getState());
	    
	    book1.dispose();
	    System.out.println(book1.getState());
	    
	    return book1.getState();
}
	
	public EBookState testDamage(){
		
		Book book=new Book("Emmanuel", "Professional Java", "11",11);
		
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
	   
	    book.borrow(loan);
	    System.out.println(book.getState());
	    book.returnBook(true);
	    System.out.println(book.getState());
	    
	    return book.getState();
}
public EBookState testRepair(){
		
		Book book=new Book("Emmanuel", "Professional Java", "11",11);
		
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
	   
	    book.borrow(loan);
	    System.out.println(book.getState());
	    book.returnBook(true);
	    System.out.println(book.getState());
	    book.repair();
	    System.out.println(book.getState());
	    return book.getState();
}
}
