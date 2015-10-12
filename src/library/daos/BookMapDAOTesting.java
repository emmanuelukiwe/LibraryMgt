package library.daos;

import java.util.List;

import library.entities.Book;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

public class BookMapDAOTesting{

	public String printAuthor(String id){
	BookHelper helper=new BookHelper();//create a helper instance
	BookMapDAO dao=new BookMapDAO(helper);//create a BookMapDAO instance
	IBook book1=dao.addBook("RECEP","PYTHON","12");//create a book instance
	IBook book2=dao.addBook("RECEP","CSS","13");
	IBook book3=dao.addBook("EMMANUEL","HTML","14");
	IBook book4=dao.addBook("ADENIKE","JAVASCRIPT","15");
	IBook book5=dao.addBook("DJANGO","JAVASCRIPT","15");
	String x="";
	//check where book id is equal to received book id
		 if (book1.getCallNumber().equals(id)){
			 x+=book1.getAuthor();
			 
			
		 }
		 return x;//return the author of the book
	
}
	public String printTitle(String author){
		BookHelper helper=new BookHelper();
		BookMapDAO dao=new BookMapDAO(helper);
		IBook book1=dao.addBook("RECEP","PYTHON","12");
		String title="";
		
		//check book where received author is the author
		if (book1.getAuthor().equals(author)){
			title= book1.getTitle();
		}
		return title;//return the title of the book
}
	
	public boolean confirmAddBook(IBook book){//receives a book instance
		BookHelper helper=new BookHelper();//create a helper instance
		BookMapDAO dao=new BookMapDAO(helper);//create a BookMapDao instance
		//add a book instance to the list
		 book=dao.addBook(book.getAuthor(),book.getTitle(),book.getCallNumber()); 
		
		boolean confirm=false;
		if(dao.listBooks().contains(book)){
			confirm=true;//check and confirm that book was added
			
		}
		return confirm;//return true or false
}
}