package com.que2;

//In singly linear list implement following operations. i. insert a new node after a given node(data) ii.insert a new node before a given node(data

public class List {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	Node head;
	Node tail;
	public void insertSortedly(int data) {
		Node nn = new Node(data);
		if(head==null) {
			head = nn;
		}
		else if(head.next==null || head.data > data) {
			if(head.data > data) {
				nn.next=head;
				head = nn;
			}
		}
		else {
			Node trav = head;
			while(trav.next!=null) {
				if (trav.data < data && trav.next.data >= data) {
					nn.next = trav.next;
					trav.next = nn;
					return;
				}
				trav = trav.next;
			}
			trav.next=nn;
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
