package designPatterns.iteratorDesignPattern;

import java.util.ArrayList;

public class UserManagement {
	
	private ArrayList<User> userList = new ArrayList<>();
	
	public void addUser(User user) {
		this.userList.add(user);
	}
	
	public User getUser(int index) {
		return this.userList.get(index);
	}
	
	public MyIterator<User> getIterator() {
		return new MyIteratorImpl<>(this.userList);
	}

}
