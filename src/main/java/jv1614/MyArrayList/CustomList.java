package jv1614.MyArrayList;

import java.util.Arrays;

public interface CustomList<T> extends Iterable<T> {
	
	public int size();
	
	public T remove(int index);
	
	public boolean add(T t);
	
	public boolean add(int index, T t);
	
	T get(int index);
	
	public void replace(int index, T t);
	
	public void clear();

}
