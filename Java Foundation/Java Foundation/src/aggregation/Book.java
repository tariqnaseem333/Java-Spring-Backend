package aggregation;

public class Book {
	
//	Instance Variables
	private String name;
	private int quantity;
	private double price;
	private Author author;
	
//	Constructor
	public Book( String name, int quantity, double price, Author author ) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.author = author;
	}
	
//	Methods
	public void displayBookDetails() {
		System.out.println("Displaying Book Details \n***********");
		System.out.println("Book Name : " + name);
		System.out.println("Quantity : " + quantity);
		System.out.println("Book Price : " + price);
		this.author.displayAuthorDetails();
		System.out.println();
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	

}
