package userinterface;

import com.infy.exception.InfyAcademyException;

import service.BookIssue;

public class Tester {
	
	public static void main(String[] args) throws InfyAcademyException {
		
		try {
			BookIssue b1 = new BookIssue(); 
			b1.bookDetails("The Book Thief");
			BookIssue b2 = new BookIssue(); 
			b2.bookDetails("The Kite Runner");
			BookIssue b3 = new BookIssue(); 
			b3.bookDetails("Greek Goddesses"); 

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
