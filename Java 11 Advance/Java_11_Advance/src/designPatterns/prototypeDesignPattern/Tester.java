package designPatterns.prototypeDesignPattern;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Creating Object using Prototype Design Pattern");
		NetworkConnection networkConnection1 = new NetworkConnection();
		networkConnection1.setIp("968.1.23.253");
		networkConnection1.loadImportantData();
		System.out.println(networkConnection1);
		
//		Cloning the previous Object
		try {
			NetworkConnection networkConnection2 = (NetworkConnection)networkConnection1.clone(); 
			System.out.println(networkConnection2);
			NetworkConnection networkConnection3 = (NetworkConnection)networkConnection1.clone();
			System.out.println(networkConnection3);
		} catch (CloneNotSupportedException exception) {
			exception.printStackTrace();
		}
		
////		Creating 2nd Object normally
//		NetworkConnection networkConnection2 = new NetworkConnection();
//		networkConnection2.setIp("758.33.2.923");
//		networkConnection2.setImportantData("Getting Data from Database");
//		networkConnection2.loadImportantData();
//		System.out.println(networkConnection2);

	}

}
