package jv1614.MyArrayList;

import java.util.Iterator;

public class ArrListIterator<T> implements Iterator<T> {
	private int index = 0;
	private T[] values;
	
	ArrListIterator(T[] values){
		this.values = values;
	}

	public boolean hasNext() {
		return index < values.length;
	}
	
	public T next() {
		return values[index++];
	}
	
}
