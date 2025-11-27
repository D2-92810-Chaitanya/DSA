package com.que1;
// Write all possibilites to check palindrome. Also do time and space complexity analysis
public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM";
		System.out.println("Original String: " + str);
		System.out.println("Is Palindrome (Using Loop): " + isPalindromeUsingLoop(str));

	}

	private static String isPalindromeUsingLoop(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++) {
			if (str.charAt(i) != str.charAt(n - i - 1)) {
				return "No";
			}
		}
		return "Yes";
	}

}


// TIME COMPLEXITY  :  O(n);
// SPACE COMPLEXITY :  O(1);