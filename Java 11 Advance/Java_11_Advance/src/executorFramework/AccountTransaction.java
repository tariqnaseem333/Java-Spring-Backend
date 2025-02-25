package executorFramework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTransaction {

	public static void main(String[] args) {
		
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Account account = new Account(1000);
		
		// Time before transaction starts
		System.out.println("Start Time: " + customFormatter.format(LocalDateTime.now()));  
		
		// Creates a pool with single worker thread
//		ExecutorService executorService = Executors.newSingleThreadExecutor(); 
		
		// Creates a pool with 2 threads
		ExecutorService executorService = Executors.newFixedThreadPool(2); 
		
		// Executes run() in DepositThread
		executorService.execute(new DepositThread(account, 500)); 
		
		// Executes run() in WithdrawThread
		executorService.execute(new WithdrawThread(account, 1200)); 
		
		// Waits for current tasks to end, then shuts down
		executorService.shutdown(); 
		
		// Checking if shutdown is complete
		while (!executorService.isTerminated()) {
		} 
		
		// Time after transaction ends
		System.out.println("End Time: " + customFormatter.format(LocalDateTime.now()));  
	}

}

