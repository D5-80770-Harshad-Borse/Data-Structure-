package com.sunbeam;

public class Main {

	public static void main(String[] args) {
		List l = new List();
		
		l.add(45);
		l.add(43);
		l.add(23);
		l.add(67);
		l.add(78);
		l.add(12);
		l.insertAfter(2,34);
		l.insertBefore(3, 23);
		l.display();
		

	}

}
