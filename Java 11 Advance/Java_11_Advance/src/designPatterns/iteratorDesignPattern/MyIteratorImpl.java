package designPatterns.iteratorDesignPattern;

import java.util.List;

public class MyIteratorImpl<E> implements MyIterator<E> {
	
	private List<E> list;
	private int position;
	private int length;
	
	public MyIteratorImpl(List<E> list) {
		this.list = list;
		this.position = 0;
		this.length = list.size();
	}

	@Override
	public boolean hasNext() {
		return this.position >= 0 && this.position < this.length;
	}

	@Override
	public E next() {
		E e = list.get(position);
		position++;
		return e;
	}

}
