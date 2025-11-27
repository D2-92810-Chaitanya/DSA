package com.que3;
//3. Count occurrences of each word in a line/file.
public class Question03 {
    public static void countWordOccurrences(String line) {
        String[] words = line.split("\\s+"); 
        java.util.Map<String, Integer> wordCountMap = new java.util.HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); 
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (java.util.Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Word: '" + entry.getKey() + "' - Occurrences: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String line = "This is a test. This test is only a test.";
        countWordOccurrences(line);
    }
}
