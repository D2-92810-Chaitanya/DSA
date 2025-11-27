package com.que01;

public class Stack {
	int SIZE = 5;
	int[] stack=new int[SIZE];
	int top = -1;
	
	public void push(int val) {
		if(top == SIZE-1) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		stack[top]=val;
		
	}
	public int pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top--];
	}
	public void display() {
		System.out.print("\nTop");
		if(top==-1) {
			System.out.println("Stack is empty");
			return;
		}
		for(int i=top;i>=0;i--) {
			System.out.print(" -> " + stack[i]);
		}
		System.out.println(" -> Bottom");
	}
}
