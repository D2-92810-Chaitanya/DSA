package com.que2;

import java.util.Iterator;
import java.util.Stack;

/*
 *  Implement following algorithms for multi digit numbers
 *  postfix evaluation
 *  prefix evaluation
 */

public class Question02 {

	public static void postfixEval() {
		String exp = "10 20 + 30 40 + *";
		Stack stack = new Stack();
		String[] tokens = exp.split(" ");
		for (String token : tokens) {
			if (token.equals("+")) {
				int b = (int) stack.pop();
				int a = (int) stack.pop();
				stack.push(a + b);
			} else if (token.equals("-")) {
				int b = (int) stack.pop();
				int a = (int) stack.pop();
				stack.push(a - b);
			} else if (token.equals("*")) {
				int b = (int) stack.pop();
				int a = (int) stack.pop();
				stack.push(a * b);
			} else if (token.equals("/")) {
				int b = (int) stack.pop();
				int a = (int) stack.pop();
				stack.push(a / b);
			} else {
				stack.push(Integer.parseInt(token));
			}
		}
		System.out.println("Postfix Eval Result: " + stack.pop());
	}

	public static void prefixEval() {
		String exp = "* + 10 20 + 30 40";
		Stack st = new Stack();
		String[] tokens = exp.split(" ");
		for (int i = tokens.length - 1; i > 0; i--) {
			if (tokens[i].equals("+")) {
				int a = (int) st.pop();
				int b = (int) st.pop();
				st.push(a + b);
			} else if (tokens[i].equals("-")) {
				int a = (int) st.pop();
				int b = (int) st.pop();
				st.push(a - b);
			} else if (tokens[i].equals("*")) {
				int a = (int) st.pop();
				int b = (int) st.pop();
				st.push(a * b);
			} else if (tokens[i].equals("/")) {
				int a = (int) st.pop();
				int b = (int) st.pop();
				st.push(a / b);
			} else {
				st.push(Integer.parseInt(tokens[i]));
			}
		}
		System.out.println("Prefix Eval Result: " + st.pop());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postfixEval();
		prefixEval();
	}

}
