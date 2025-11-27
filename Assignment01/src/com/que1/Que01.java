package com.que1;

public class Que01 {
	public static void main(String[] args) {
		List ll = new List();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(50);
		
		ll.display();
		ll.insertBeforeAfer(30);
		ll.display();
	}
}
