package com.que03;

public class Stack {
    DoublelyList list = new DoublelyList();

    public void push(int val) {
        list.addFirst(val);
    }

    public int pop() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}
