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
}