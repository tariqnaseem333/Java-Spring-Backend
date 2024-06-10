package com.timeallocation.service;

public class TimeAllocator {
	
	public String allocateTimeSlot( String desktopNumber ) {
		return (desktopNumber.charAt(desktopNumber.length()-1) == 'A') ? "9:00 am" : "1:00 pm";
	}

}
