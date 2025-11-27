package com.que01;

import java.util.Arrays;


public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		int[] arr = {10,20,30,40,50,60};
		Arrays.toString(arr);
		for (int i : arr) {
			stack.push(i);
		}
		stack.display();
		for (int i=0; i<arr.length; i++) {
//			System.out.println(stack.pop());
			arr[i]=stack.pop();
		}
		stack.display();
		Arrays.toString(arr);
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " " );
		}
	}

}
