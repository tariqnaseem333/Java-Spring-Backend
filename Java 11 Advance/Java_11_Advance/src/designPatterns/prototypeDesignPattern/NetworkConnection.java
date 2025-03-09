package designPatterns.prototypeDesignPattern;

public class NetworkConnection implements Cloneable {
	
	private String ip;
	private String importantData;
	
//	This method might be calling API or getting data from 
//	Database which will take some time
	public void loadImportantData() throws InterruptedException {
		System.out.println("Loading Very Important Data...");
		Thread.sleep(5000);
		this.importantData = "Very Important Data";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]";
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

}
