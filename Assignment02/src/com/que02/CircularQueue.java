package com.que02;
//  Implement circular queue using counter method
public class CircularQueue {
	int SIZE = 5;
	int[] queue = new int[SIZE];
	int front = 0;
	int rear = 0;
	int count = 0;
	
	public void push(int val) {
		if(count==SIZE) {
			System.out.println("Queue is full!!");
		}
		else {
			queue[rear] = val;
			rear = (rear + 1) % SIZE;
			count++;
		}
	}
	public int pop() {
		if(count==0) {
			System.out.println("Queue is empty!!");
			return -1;
		}
		else {
			int temp = queue[front];
			front = (front + 1) % SIZE;
			count--;
			return temp;
		}
	}
	
}
