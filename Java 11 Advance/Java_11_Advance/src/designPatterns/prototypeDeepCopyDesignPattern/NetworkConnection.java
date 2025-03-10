package designPatterns.prototypeDeepCopyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String importantData;
	private List<String> domains = new ArrayList<>();
	
//	This method might be calling API or getting data from 
//	Database which will take some time
	public void loadImportantData() throws InterruptedException {
		System.out.println("Loading Very Important Data...");
		Thread.sleep(5000);
		this.importantData = "Very Important Data";
		this.domains.add("infosys");
		this.domains.add("google");
		this.domains.add("amazon");
		this.domains.add("flipkart");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Implementing Deep Copy, so clone won't copy reference of 
		// domains object. Instead, it will create another 
		// domains object and hold it's reference
		NetworkConnection clone = new NetworkConnection();
		clone.setIp(this.getIp());
		clone.setImportantData(this.getImportantData());
		for(String domain : this.getDomains()) {
			clone.getDomains().add(domain);
		}
		return clone;
	}
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getImportantData() {
		return importantData;
	}
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

}
