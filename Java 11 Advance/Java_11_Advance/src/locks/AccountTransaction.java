package locks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class AccountTransaction {
	
	public static void main(String[] args) {
		
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Account account = new Account(1000);
		ReentrantLock lock = new ReentrantLock();
		
		System.out.println("Start Time: " + customFormatter.format(LocalDateTime.now()));
		
		// Creates a pool with 2 threads
		ExecutorService executorService = Executors.newFixedThreadPool(2); 
		
		// Executes run() in DepositThread
		executorService.execute(new DepositThread(lock, account, 500)); 
		
		// Executes run() in WithdrawThread
		executorService.execute(new WithdrawThread(lock, account, 1000)); 
		
		// Waits for currently running tasks to finish then shuts down
		executorService.shutdown(); 
		
		// Checking if shutdown is complete
		while (!executorService.isTerminated()) {
		} 
		
		System.out.println("End Time: " + customFormatter.format(LocalDateTime.now()));
		
	}
	
}
