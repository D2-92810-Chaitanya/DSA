package com.que3;
// 3. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities ofall operations. (Comparision can be done later)
public class List {
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node tail;
    public void insert(int data) {
        Node nn = new Node(data);
        if(tail==null) {
            tail = nn;
            tail.next = tail; 
        }
        else {
            nn.next = tail.next; 
            tail.next = nn; 
            tail = nn; 
        }
    }
    public void display() {
        System.out.print("\nhead");
        if(tail==null) {
            System.out.println("LL is empty");
            return;
        }
        Node trav = tail.next; 
        do {
            System.out.print(" -> " + trav.data);
            trav = trav.next;
        } while(trav != tail.next); 
        System.out.println(" -> head");
    }

}
