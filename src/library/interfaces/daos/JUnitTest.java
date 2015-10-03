



	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */
	package library.interfaces.daos;
	import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import library.entities.Book;
import library.entities.Member;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;
import library.entities.Loan;
import library.interfaces.entities.EBookState;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
	/**

	/**
	 *
	 * @author emmanuelukiwe
	 */
	public class JUnitTest {
	
	    public void mainOne(Book book){
	  
	        
	        
	        book.returnBook(true);
	        
	    }
	    
	    public EBookState checkNewBookState(Book book){
	        return book.getState();
	    }
	    
	    //Confirm that books moves from available state to on loan
	    public void checkBorrow(Loan loan){
	      IBook x=loan.getBook();
	      System.out.println(x.getState());
	      x.borrow(loan);
	      System.out.println(x.getState());
	      System.out.print("");
	              
    }
	    
	    
	}



	    
	    

