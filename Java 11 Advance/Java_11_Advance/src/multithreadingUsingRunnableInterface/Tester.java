package multithreadingUsingRunnableInterface;

public class Tester {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new MyThread(1));
		thread1.start();
		
		Thread thread2 = new Thread(new MyThread(2));
		thread2.start();
		
    }
}