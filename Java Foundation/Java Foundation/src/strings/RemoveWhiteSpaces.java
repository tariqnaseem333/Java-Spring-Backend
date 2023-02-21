package strings;

public class RemoveWhiteSpaces {

	public static String removeWhiteSpaces(String str){

		String strnew = str.replace(" ", "");
		return strnew;

	}

	public static void main(String args[]){

		String str = "Hello How are you ";
		str = removeWhiteSpaces(str);
		System.out.println(str);

	}
}
