package com.que03;

public class Queue {
    DoublelyList list = new DoublelyList();

    public void enqueue(int val) {
        list.addLast(val);
    }

    public int dequeue() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}
