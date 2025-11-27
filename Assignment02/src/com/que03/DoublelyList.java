package com.que03;


public class DoublelyList {
	static class Node{
		int data;
		Node prev,next;
		public Node(int data) {
			this.data = data;
		}
	}
	Node head;
	Node tail;
	
	public void addFirst(int data) {
		Node nn = new Node(data);
		if(head==null) {
			head = tail = nn;
		}
		else {
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
	}
	public void addLast(int data) {
		Node nn = new Node(data);
		if(head==null) {
			head = tail = nn;
		}
		else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
				
			}
			nn.prev = trav;
			trav.next = nn;
			tail = nn;
		}
	}
	public int removeLast() {
		if(head==null) {
			System.out.println("Empty!!");
			return -1;
		}
		else if (head.next ==null) {
			int data =head.data;
			head = tail = null;
			return data;
		}
		else {
			int data = tail.data;
			tail = tail.prev;
			tail.next = null;
			return data;
		}
	}
	public int removeFirst() {
		if(head==null) {
			System.out.println("Empty!!");
			return -1;
		}
		else if (head.next ==null) {
			int data =head.data;
			head = tail = null;
			return data;
		}
		else {
			int data = head.data;
			head = head.next;
			head.prev = null;
			return data;
		}
	}
	
	public void display() {
		System.out.print("\nhead");
		if(head==null) {
			System.out.println("LL is empty");
		}
		else {
			Node trav = head;
			while(trav!=null) {
				System.out.print(" -> "+trav.data);
				trav = trav.next;
			}
		}
	}
	
}
