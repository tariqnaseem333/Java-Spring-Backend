package recursion;

public class GCDOfTwoNumbers {
	
	public static int temp;

    public static int findGCD(int num1, int num2) {

        // Everything divides 0
        if (num1 == 0)
          return num2;
        if (num2 == 0)
          return num1;
      
        // base case
        if (num1 == num2)
            return num1;
      
        // a is greater
        if (num1 > num2) {
        	return findGCD(num1-num2, num2);
        } else {
        	return findGCD(num1, num2-num1);
        }    
        
    }
    
    public static int findMax(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

    public static int findMin(int num1, int num2) {
        return (num1 < num2 ? num1 : num2);
    }

    public static void main(String args[]) {
        System.out.println(findGCD(8, 10));
    }

}
