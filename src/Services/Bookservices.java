package Services;
import java.util.ArrayList;

import Model.Book;
import Validator.Bookvalidator;
public class Bookservices {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public ArrayList<Book> getBooks() {
		return books;
	}
	public String addBook(Book book) {
		boolean isExsist = Bookvalidator.isExsist(book, books);
		if(isExsist) {
			return book.getID()+" is already exsist please add different book!";
		}
		boolean isChecked = Bookvalidator.isValidBook(book);
		if(!isChecked) {
			return "This book is not valid for our library";
		}
		books.add(book);
		return book.getName()+" book added to our library succesfully!";
	}
	public String removeBook(Book book) {
		boolean isExsist = Bookvalidator.isExsist(book, books);
		if(!isExsist) {
			return "There is not book with this id:"+book.getID();
		}
		books.remove(book);
		return "Book deleted succesfully";
	}
	public String updateBook(Book exsistinbook,Book updatedbook) {
		boolean isExsist = Bookvalidator.isExsist(exsistinbook, books);
		if(!isExsist) {
			return "There is not book with this id:"+exsistinbook.getID();
		}
		int exsistingbookid = exsistinbook.getID();
		for(int i=0;i<books.size();i++) {
			int eachbookid = books.get(i).getID();
			if(eachbookid == exsistingbookid) {
				books.set(i, updatedbook);
				return "Book updated succesfully!";
			}
		}
		return "";
	}
	
}
