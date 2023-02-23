package arrays;

public class LeapYear {

	public static int[] findLeapYears(int year){
		
		int[] leapYearArr = new int[15];
		
		while(true) {
			if( (year%4 == 0 && year%100 !=0) || year%400 == 0) {
				for( int i = 0; i < 15; i++ ) {
					leapYearArr[i] = year;
					year = year + 4;
				}
				break;
			} else {
				year++;
			}
		}
		
		return leapYearArr;
	}

	public static void main(String[] args) {
		int year = 1900;
		int[] leapYears;
		leapYears=findLeapYears(year);
		for ( int index = 0; index<leapYears.length; index++ ) {
			System.out.print( leapYears[index] + " " );
		}
		System.out.println();
	}

}
