package callableAndFuture;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AccountTransaction {
	
	public static void main(String[] args) {
		
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Account account = new Account(1000);
		System.out.println("Start Time: " + customFormatter.format(LocalDateTime.now()));
		
		// Creates a pool with single worker thread
		ExecutorService executorService = Executors.newSingleThreadExecutor(); 
		
		// Submits task that will return Future object
		Future<Boolean> future = executorService.submit(new DepositThread(account, 500)); 
		
		try {
			System.out.println("Deposit Completed: "+ future.get());
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		// Submits task that will return Future object
		Future<Boolean> future2 = executorService.submit(new WithdrawThread(account, 1200)); 
		
		try {
			System.out.println("Withdrawal Completed: "+ future2.get());
		} 
		catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		 // Waits for currently running tasks to finish then shuts down
		executorService.shutdown();
		
		// Checking if shutdown is complete
		while (!executorService.isTerminated()) {
		} 
		
		System.out.println("End Time: " + customFormatter.format(LocalDateTime.now()));
	}
	
}
