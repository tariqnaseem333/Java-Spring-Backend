package designPatterns.iteratorDesignPattern;

public interface MyIterator<E> {
	
	public abstract boolean hasNext();
	
	public abstract E next();

}
