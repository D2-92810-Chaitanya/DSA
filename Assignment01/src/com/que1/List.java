package com.que1;

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
	public void insert(int data) {
		Node nn = new Node(data);
		if(head==null) {
			head = nn;
		}
		else {
			Node trav = head;
			while(trav.next!=null) {
				trav = trav.next;
			}
			trav.next=nn;
		}
	}
	public void insertBeforeAfer(int data) {
		Node nn = new Node(data);
		if(head==null) {
			System.out.println("LL is empty");
			return;
		}
		Node trav = head;
		while(trav!=null) {
			if(trav.data==data) {
				//insert before
				Node nnBefore = new Node(data-1);
				if(trav==head) {
					nnBefore.next = head;
					head = nnBefore;
				}
				else {
					Node temp = head;
					while(temp.next!=trav) {
						temp = temp.next;
					}
					nnBefore.next = trav;
					temp.next = nnBefore;
				}
				//insert after
				Node nnAfter = new Node(data+1);
				nnAfter.next = trav.next;
				trav.next = nnAfter;
				return;
			}
			trav = trav.next;
		}
		System.out.println("Data not found");
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
