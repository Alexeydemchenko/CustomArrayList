package jv1614.MyArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayList<T> implements CustomList<T> {
	
	private int size = 0;
	private T[] arrayValues;

	CustomArrayList() { 
		arrayValues = (T[]) new Object[0];
	}
	
	public int size() {
		return size++;
	}
	
	public T get(int index) {
		return arrayValues[index];
	}
	
	public boolean add(T t) {
			T[] arrayTemp = arrayValues;
			arrayValues = (T[]) new Object[arrayTemp.length + 1];
			System.arraycopy(arrayTemp, 0, arrayValues, 0, arrayTemp.length);
			arrayValues[arrayValues.length - 1] = t;
			size++;
			return true;
	}
	
	public boolean add(int index, T t) {
		int oldCapacity = arrayValues.length;
		int newCapacity = oldCapacity + 1;
		arrayValues = Arrays.copyOf(arrayValues, newCapacity);
		System.arraycopy(arrayValues, index, arrayValues, index + 1, size - index);
		arrayValues[index] = t;
		size++;
		return true;
	}
		
	public T remove(int index) {
		T oldVal = (T)arrayValues[index];
		int removeNum = size - index - 1;
		System.arraycopy(arrayValues, index + 1, arrayValues, index, removeNum);
		arrayValues[--size] = null;
		return oldVal;
	}
	
	public void clear() {
		for(int i = 0; i < size; i++) {
			arrayValues[i] = null;
		}
		size = 0;
	}
	
	public void replace(int index, T t) {
		arrayValues[index] = t;
	}
	
	public Iterator<T> iterator() {
		return new ArrListIterator(arrayValues);
	}
}
