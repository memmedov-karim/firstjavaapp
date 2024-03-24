package Validator;
import java.util.ArrayList;
import Model.Book;

public class Bookvalidator {
	
	public static boolean isValidBook(Book book) {
		double price = book.getPrice();
		String name = book.getName();
		int numberofpages = book.getNumberofpage();
		int publishdate = book.getPublishdate();
		boolean checked = publishdate >=1998 && publishdate<=2015 && price>10 && !name.isEmpty() && numberofpages>100;
		return checked;
	}
	public static boolean isExsist(Book book,ArrayList<Book> books) {
		int id = book.getID();
		for(Book exsistingbook:books) {
			if(exsistingbook.getID() == id) {
				return true;
			}
		}
		return false;
		}
}
