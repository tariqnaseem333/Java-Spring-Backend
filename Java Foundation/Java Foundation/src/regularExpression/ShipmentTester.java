package regularExpression;

public class ShipmentTester {
	
    public static void main(String[] args) {
        
        Shipment shipment = new Shipment();
        
        //Change the values for testing your code with different values
        
        String productName = "Digital Camera";
        System.out.println("The product name is "+ (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));

        String productId = "DC1911";
        System.out.println("The product Id is "+ (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));

        String trackerId = "D:CMDC:cmd:23";
        System.out.println("The tracker Id is "+ (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));
    
    }

}
