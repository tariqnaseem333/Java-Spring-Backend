package designPatterns.observerDesignPattern;

public interface Subject {
	
	public abstract void subscribe(Observer observer);
	
	public abstract void unsubscribe(Observer observer);
	
	public abstract void newVideoUploaded(String title);

}
