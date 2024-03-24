package Controller;

import Services.Bookservices;
import java.util.ArrayList;

import Model.Book;
public class Bookcontroller{
	Bookservices bookservices = new Bookservices();
	
	public ArrayList<Book> getBooks(){
		return bookservices.getBooks();
	}
	public String addBook(Book book) {
		return bookservices.addBook(book);
	}
	public String removeBook(Book book) {
		return bookservices.removeBook(book);
	}
	public String updateBook(Book exsistingbook,Book newbook) {
		return bookservices.updateBook(exsistingbook, newbook);
	}
}
