package jv1614.MyArrayList;

import java.util.*;

public class App {
	public static void main(String[] args) {
		CustomArrayList cs = new CustomArrayList();
		cs.add(1);
		cs.add(2);
		cs.add(3);
		cs.add(0, 10);
		
		for(Object obj : cs) {
			System.out.println(obj);
		}
	}
}
