package jv1614.MyArrayList;

import java.util.*;

public class App {
	public static void main(String[] args) {
		CustomArrayList cs = new CustomArrayList();
		cs.add(1);
		cs.add(2);
		cs.add(3);
		cs.add(4);
		cs.add(5);
		
		cs.get(2);
		cs.remove(2);
		System.out.println(cs.get(2));
	}
}
