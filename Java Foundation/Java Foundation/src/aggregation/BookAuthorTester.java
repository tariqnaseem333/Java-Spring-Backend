package aggregation;

public class BookAuthorTester {

	public static void main(String[] args) {
		
//		Creating Object of Author and Book
		Author author1 = new Author( "James", "james@gmail.com", 'M' );
		Book book1 = new Book("Harry Potter", 3, 17, author1);
		
		Author author2 = new Author( "jimmy", "jimmy@gmail.com", 'M' );
		Book book2 = new Book("Pursuit of Wonder", 1, 11, author2);
		
		Author author3 = new Author( "Lyn", "lyn@gmail.com", 'F' );
		Book book3 = new Book("The Invisible Man", 4, 21, author3);
		
		
//		Creating Array of Author and Book
		Book[] books = { book1, book2, book3 };
		Author[] authors = { author1, author2, author3 };
		
		
		for( int i = 0; i < books.length; i++ ) {
			books[i].displayBookDetails();
		} 
		
		
		
		

	}

}
