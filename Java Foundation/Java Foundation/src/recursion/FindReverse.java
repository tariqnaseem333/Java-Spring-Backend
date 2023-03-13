package recursion;

public class FindReverse {
	
	public static int reverseNum = 0;
    public static int findReverse(int num, int temp){
    	if( num == 0 ) {
    		return temp;
    	}
    	else {
    		int rem = num%10;
        	String numbers = String.valueOf(num);
        	int i = numbers.length() - 1;
    		temp = temp + rem*(int)Math.pow(10, i);
    		num = num / 10;
    		return findReverse( num, temp );
    	}
	}
	
	public static void main(String args[]){
	    int num = 12321;
        int reverseNum = findReverse(num,0);
        if(num == reverseNum)
            System.out.println(num +" is a palindrome!");
        else
            System.out.println(num +" is not a palindrome!");
	}

}
