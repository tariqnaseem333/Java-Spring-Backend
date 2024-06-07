package travelInformation;

import java.util.Calendar;
 
public class traveler {
	
    private final int customerId = 1001;
    private int travelerId;
    private int BaggageAmount;
    private int expiryyear;
    private boolean nocStatus;
 
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
 
    public boolean CheckBaggage() {
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
}