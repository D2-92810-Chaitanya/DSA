package com.que2;
//2. Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence isnot found, return -1.
public class Question02 {
    public static int linearSearchNthOccurrence(int[] arr, int key, int n) {
        int occurrenceCount = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                occurrenceCount++; 
                if (occurrenceCount == n) {
                    return i; 
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int key = 2;
        int n = 3;
        int result = linearSearchNthOccurrence(arr, key, n);
        if (result != -1) {
            System.out.println(n + "th occurrence of " + key + " is at index: " + result);
        } else {
            System.out.println(n + "th occurrence of " + key + " not found.");
        }
    }
}
