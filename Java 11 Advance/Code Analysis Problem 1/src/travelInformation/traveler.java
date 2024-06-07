package travelInformation; // code violation: package name should have lowercase alphabets

import java.util.Calendar; // code violation: unused import
 
public class traveler { // code violation: class name should follow Pascalcase naming convention
	
//	Instance Variables
    private final int customerId = 1001; // code violation: final field should be static too
    private int travelerId;
    private int BaggageAmount; // code violation: variable name should follow camelcase naming convention
    private int expiryyear;
    private boolean nocStatus;
    
//  Method
    public boolean CheckBaggage() { // code violation: variable name should follow camelcase naming convention
        boolean ret = false;
        if(this.BaggageAmount>=0 && this.BaggageAmount<=40) {
            nocStatus = true;
            ret = true;
        }
        else {
            nocStatus = true;
            System.out.println("Invalid baggage amount");
        }
        return ret;
    }
 
//  Getters and Setters
    public int getTravelerId() {
        return travelerId;
    }
    public void setTravelerId(int travelerId) {
        this.travelerId = travelerId;
    }
    public int getBaggageAmount() {
        return BaggageAmount;
    }
    public void setBaggageAmount(int baggageAmount) {
        BaggageAmount = baggageAmount;
    }
    public int getExpiryyear() {
        return expiryyear;
    }
    public void setExpiryyear(int expiryyear) {
        this.expiryyear = expiryyear;
    }
    public boolean isNocStatus() {
        return nocStatus;
    }
    public void setNocStatus(boolean nocStatus) {
        this.nocStatus = nocStatus;
    }
    public int getId() {
        return customerId;
    }
 
}