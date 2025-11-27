package com.que4;
// 4. Calculate the mode of an array. The mode is the element occurred maximum time in the array.
public class Question04 {
    public static int calculateMode(int[] arr) {
        java.util.Map<Integer, Integer> frequencyMap = new java.util.HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = arr[0];
        int maxCount = 0;

        for (java.util.Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 4, 3, 5, 2, 1};
        int mode = calculateMode(arr);
        System.out.println("The mode of the array is: " + mode);
    }
}
