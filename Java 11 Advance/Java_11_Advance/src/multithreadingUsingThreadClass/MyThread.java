package multithreadingUsingThreadClass;

public class MyThread extends Thread {

	private Integer threadNumber;

	public MyThread(Integer threadNumber) {
		this.threadNumber = threadNumber;
		System.out.println(this+ "  Is Created");
	}

	@Override
	public void run() {
		System.out.println(this+ "  Is Running");
	}

	@Override
	public String toString() {
		return "MyThread :"+ threadNumber ;
	}
	
}
