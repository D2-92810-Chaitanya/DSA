package com.que3;
// 3. Write a function to return level/depth of given node in a BST.
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

    int getLevel(Node node, int key, int level){
        if (node == null)
            return 0;
        if (node.data == key)
            return level;
        int downlevel = getLevel(node.left, key, level + 1);
        if (downlevel != 0)
            return downlevel;
        return getLevel(node.right, key, level + 1);
    }

    int getLevel(int key){
        return getLevel(root, key, 1);
    }
}
public class Question03 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        int keyToFindLevel = 60;
        int level = tree.getLevel(keyToFindLevel);
        if (level != 0)
            System.out.println("Level of node " + keyToFindLevel + " is: " + level);
        else
            System.out.println("Node " + keyToFindLevel + " not found in the BST.");
    }
}
