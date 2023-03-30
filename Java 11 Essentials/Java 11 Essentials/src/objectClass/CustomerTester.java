package objectClass;

public class CustomerTester {
	
	 public static void main(String[] args) {
		 
	     Customer c1 = new Customer(105, "Max", "8574637281");
	     Customer c2 = new Customer(109, "Nick", "9453281756");
	     Customer c3 = new Customer(109, "Nick", "9453281756");
	     
	     if( c1.equals(c2) && c2.equals(c3) ) {
	    	 System.out.println(c1);
	     }
	     else if( c1.equals(c2) ) {
	    	 System.out.println(c1);
	    	 System.out.println(c3);
	     }
	     else if( c2.equals(c3) ) {
	    	 System.out.println(c1);
	    	 System.out.println(c2);
	     }
	     else {
	    	 System.out.println(c1);
	    	 System.out.println(c2);
		     System.out.println(c3);
	     }
	    
	 }

}
