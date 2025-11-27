package com.que1;
//1. Write a linear search algorithm to return index of last occurance of key.
public class Question01 {
    public static int linearSearch(int[] arr, int key) {
        int lastIndex = -1; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i; 
            }
        }
        return lastIndex; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        int key = 2;
        int result = linearSearch(arr, key);
        System.out.println("Last occurrence of " + key + " is at index: " + result);
    }
}
