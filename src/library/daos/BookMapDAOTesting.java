package library.daos;

import java.util.List;

import library.entities.Book;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

public class BookMapDAOTesting{

	public String printAuthor(String id){
	BookHelper helper=new BookHelper();
	BookMapDAO dao=new BookMapDAO(helper);
	IBook book1=dao.addBook("RECEP","PYTHON","12");
	IBook book2=dao.addBook("RECEP","CSS","13");
	IBook book3=dao.addBook("EMMANUEL","HTML","14");
	IBook book4=dao.addBook("ADENIKE","JAVASCRIPT","15");
	IBook book5=dao.addBook("DJANGO","JAVASCRIPT","15");
	String x="";;
		 if (book1.getCallNumber().equals(id)){
			 x+=book1.getAuthor();
			 
			
		 }
		 return x;
	
}
	public String printTitle(String author){
		BookHelper helper=new BookHelper();
		BookMapDAO dao=new BookMapDAO(helper);
		IBook book1=dao.addBook("RECEP","PYTHON","12");
		String title="";
		if (book1.getAuthor().equals(author)){
			title= book1.getTitle();
		}
		return title;
}
	
	public boolean confirmAddBook(IBook book){
		BookHelper helper=new BookHelper();
		BookMapDAO dao=new BookMapDAO(helper);
		
		 book=dao.addBook(book.getAuthor(),book.getTitle(),book.getCallNumber());
		
		boolean confirm=false;
		if(dao.listBooks().contains(book)){
			confirm=true;
			
		}
		return confirm;
}
}