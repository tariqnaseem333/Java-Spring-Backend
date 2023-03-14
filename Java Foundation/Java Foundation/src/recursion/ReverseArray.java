package recursion;

public class ReverseArray {
	
    public static void swapArrayElements(int numbers[], int startIndex, int endIndex) {
        int temp = numbers[startIndex];
        numbers[startIndex] = numbers[endIndex];
        numbers[endIndex] = temp;
    }
	
    public static int[] reverseArray(int numbers[], int startIndex, int endIndex) {
        if( startIndex < endIndex ) {
        	swapArrayElements(numbers, startIndex, endIndex);
        	startIndex++;
        	endIndex--;
        	return reverseArray(numbers, startIndex, endIndex);
        } else {
        	return numbers;
        }
    }
    
    public static void main(String args[]) {
        int numbers[] = new int[] { 1, 2, 3, 4, 5, 6 };

        int reversedNumbers[] = reverseArray(numbers, 0, numbers.length - 1);
        System.out.println("Reversed array");
        for (int number : reversedNumbers) {
            System.out.println(number);
        }
    }

}
