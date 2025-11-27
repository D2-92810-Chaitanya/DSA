package com.que03;
public class Question03 {

	public static void main(String[] args) {
		System.out.println("Stack (LIFO) using linked list ");
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		System.out.println("\nPopped: " + s.pop());
		s.display();

		System.out.println("\nQueue (FIFO) using linked list ");
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.display();
		System.out.println("\nDequeued: " + q.dequeue());
		q.display();
	}

}
