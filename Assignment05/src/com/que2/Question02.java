package com.que2;
// 2. find successor of given node and return it in BST.
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

    Node minValueNode(Node node){
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    Node findSuccessor(Node root, int key){
        Node current = searchNode(root, key);
        if (current == null)
            return null;
        if (current.right != null)
            return minValueNode(current.right);
        Node successor = null;
        Node ancestor = root;
        while (ancestor != current){
            if (current.data < ancestor.data){
                successor = ancestor;
                ancestor = ancestor.left;
            } else
                ancestor = ancestor.right;
        }
        return successor;
    }

    Node searchNode(Node root, int key){
        if (root == null || root.data == key)
            return root;
        if (key < root.data)
            return searchNode(root.left, key);
        return searchNode(root.right, key);
    }
}
public class Question02 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        int keyToFindSuccessor = 40;
        BST.Node successor = tree.findSuccessor(tree.root, keyToFindSuccessor);
        if (successor != null)
            System.out.println("Successor of " + keyToFindSuccessor + " is " + successor.data);
        else
            System.out.println("No successor found for " + keyToFindSuccessor);
    }
}
