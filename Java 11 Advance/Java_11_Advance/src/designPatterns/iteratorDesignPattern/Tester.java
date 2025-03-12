package designPatterns.iteratorDesignPattern;

public class Tester {

	public static void main(String[] args) {
		
		User user1 = new User(1001, "Greg");
		User user2 = new User(1002, "Emma");
		User user3 = new User(1003, "John");
		User user4 = new User(1004, "Lynda");
		
		UserManagement userManagement = new UserManagement();
		userManagement.addUser(user1);
		userManagement.addUser(user2);
		userManagement.addUser(user3);
		userManagement.addUser(user4);
		
		MyIterator<User> iterator = userManagement.getIterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user);
		}
		

	}

}
