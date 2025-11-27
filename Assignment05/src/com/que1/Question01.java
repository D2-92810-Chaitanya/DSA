package com.que1;
// 1. Write recursive function to perform binary search in BST.

class BST{
    class Node{
        int data;
        Node left, right;
        Node(int item){
            data = item;
            left = right = null;
        }
    }
    Node root;

    BST(){
        root = null;
    }

    void insert(int key){
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        return root;
    }

    boolean search(int key){
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key){
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (key < root.data)
            return searchRec(root.left, key);
        return searchRec(root.right, key);
    }
}
public class Question01 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        int keyToSearch = 40;
        if (tree.search(keyToSearch))
            System.out.println(keyToSearch + " found in the BST");
        else
            System.out.println(keyToSearch + " not found in the BST");
    }
}