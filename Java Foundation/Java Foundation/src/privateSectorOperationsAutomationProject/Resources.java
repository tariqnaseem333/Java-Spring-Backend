package privateSectorOperationsAutomationProject;

public class Resources {

	//	Method
	public static int getMonth( String month ) {
		int monthNumber = 0;
		switch(month) {
		case "Jan": monthNumber = 1;
		break;
		case "Feb": monthNumber = 2;
		break;
		case "Mar": monthNumber = 3;
		break;
		case "Apr": monthNumber = 4;
		break;
		case "May": monthNumber = 5;
		break;
		case "Jun": monthNumber = 6;
		break;
		case "Jul": monthNumber = 7;
		break;
		case "Aug": monthNumber = 8;
		break;
		case "Sep": monthNumber = 9;
		break;
		case "Oct": monthNumber = 10;
		break;
		case "Nov": monthNumber = 11;
		break;
		case "Dec": monthNumber = 12;
		break;
		}
		return monthNumber;
	}

}