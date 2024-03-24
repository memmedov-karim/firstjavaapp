package Model;

public class Book {
	private int id;
	private int numberofpage;
	private int publishdate;
	private String name;
	private String authorname;
	private double price;
	public Book(int id,int numberofpage,int publishdate,String name,String authorname,double price) {
		this.id = id;
		this.numberofpage = numberofpage;
		this.publishdate = publishdate;
		this.name = name;
		this.authorname = authorname;
		this.price = price;
	}
	public int getID() {
		return id;
	}
	public int getNumberofpage() {
		return numberofpage;
	}
	public int getPublishdate() {
		return publishdate;
	}
	public String getName() {
		return name;
	}
	public String getAuthorname() {
		return authorname;
	}
	public double getPrice() {
		return price;
	}
	 @Override
	    public String toString() {
	        return "Book{" +
	                "id=" + id +
	                ", numberOfPage=" + numberofpage +
	                ", publishDate=" + publishdate +
	                ", name='" + name + '\'' +
	                ", authorName='" + authorname + '\'' +
	                ", price=" + price +
	                '}';
	    }
	
}
