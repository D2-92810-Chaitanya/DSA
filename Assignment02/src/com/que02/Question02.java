package com.que02;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue queue = new CircularQueue();
		queue.push(10);
		queue.push(20);
		queue.push(30);
		queue.push(40);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}

}
