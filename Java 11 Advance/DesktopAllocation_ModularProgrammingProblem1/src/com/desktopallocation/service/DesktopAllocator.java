package com.desktopallocation.service;

public class DesktopAllocator {
	
//	Static Variable
	static Integer number = 1;
	
//	Method
	public String allocateDesktopNumber( Integer rollNumber ) {
		String desktopNumber =number + (rollNumber%2==0 ? "A" : "B");
		number++;
		return desktopNumber;
	}

}
