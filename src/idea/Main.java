package idea;

import Controller.Bookcontroller;
import Model.Book;
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to our new Book library project!");
		System.out.println("|---------------------------------------|");
		Book book1 = new Book(1,234,1998,"This life is not enough","Marry Jane",122.4);
		Book book2 = new Book(2,234,2012,"Makito","Samuel",12);
		Book book3 = new Book(3,234,2012,"Imena","Sansa",122);
		Book newbook3 = new Book(3,300,2000,"Tina","Sansa",700);
//		System.out.println(book1.getAuthorname());
		Bookcontroller bookcontroller = new Bookcontroller();
		System.out.println(bookcontroller.addBook(book1));
		System.out.println(bookcontroller.addBook(book2));
		System.out.println(bookcontroller.addBook(book3));
		System.out.println(bookcontroller.removeBook(book1));
		System.out.println(bookcontroller.updateBook(book3,newbook3));
//		System.out.println(bookcontroller.getBooks());
		for (Book book : bookcontroller.getBooks()) {
		    System.out.println(book);
		}
	}

}
