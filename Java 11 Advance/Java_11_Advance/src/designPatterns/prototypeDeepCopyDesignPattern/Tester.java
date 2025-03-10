package designPatterns.prototypeDeepCopyDesignPattern;

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
			NetworkConnection networkConnection3 = (NetworkConnection)networkConnection1.clone();
			
			networkConnection1.getDomains().remove(0);
			
			System.out.println(networkConnection1);
			System.out.println(networkConnection2);
			System.out.println(networkConnection3);
		} catch (CloneNotSupportedException exception) {
			exception.printStackTrace();
		}

	}

}
