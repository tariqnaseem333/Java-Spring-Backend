package regularExpression;

public class Shipment {
	
    public boolean checkProductNameValidity(String productName) {
	    boolean flag = false;
	    String regex = "([A-Za-z]+)(\\s)([A-Za-z]+)(\\s)?([A-Za-z]+)?";
	    if( productName.matches(regex) ) {
	    	flag = true;
	    }
        return flag; 
	}
	
	public boolean checkProductIdValidity(String productId) {
	    boolean flag = false;
	    String regex = "[A-Za-z0-9]{2,20}";
	    if( productId.matches(regex) ) {
	    	flag = true;
	    }
        return flag; 
	}
	
	public boolean checkTrackerIdValidity(String trackerId) {
	    boolean flag = false;
	    String regex = "([A-Z]{1})(\\:)([A-Z]{4})(\\:)([a-z]{3})(\\:)([0-9]{2})";
	    if( trackerId.matches(regex) ) {
	    	flag = true;
	    }
        return flag; 
	}

}
