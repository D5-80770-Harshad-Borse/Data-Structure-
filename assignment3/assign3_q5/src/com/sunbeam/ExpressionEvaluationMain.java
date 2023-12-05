package com.sunbeam;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class ExpressionEvaluationMain {
	
	public static int calculate(int op1, int op2, char opr) {
	    switch (opr) {
	        case '+':
	            return op1 + op2;
	        case '-':
	            return op1 - op2;
	        case '*':
	            return op1 * op2;
	        case '/':
	            return op1 / op2;
	        case '%':
	            return op1 % op2;
	        case '$':
	            return (int) Math.pow(op1, op2);
	    }
	    return 0;
	}


	
//	public static int postfixEvaluate(String postfix) {
//        Stack<Integer> stack = new Stack<>();
//        int tempNegValue = 1;
//        String[] tokens = postfix.split(" ");
//
//        for (String token : tokens) {
//            if (Character.isDigit(token.charAt(0))) {
//                stack.push(Integer.parseInt(token) * tempNegValue);
//                tempNegValue = 1;
//            } else if (token.equals("-") && stack.isEmpty()) {
//                tempNegValue *= -1;
//            } else {
//                if (token.equals("-")) {
//                    tempNegValue *= -1;
//                } else {
//                    int op2 = stack.pop();
//                    int op1 = stack.pop();
//                    int res = calculate(op1, op2, token.charAt(0));
//                    System.out.println(res);
//                    stack.push(res * tempNegValue);
//                    tempNegValue = 1;
//                }
//            }
//        }
//
//        if (!stack.isEmpty())
//            return stack.pop();
//        return 0;
//    }
	
	public static int postfixEvaluate(String postfix) {
	        Stack<String> stack = new Stack<>();

	        String[] tokens = postfix.split(" ");

	        for(int i=0;i<tokens.length;i++) {
	        	System.out.println(stack.toString());
	            if (Character.isDigit(tokens[i].charAt(0))) {
	                stack.push(tokens[i]);
	            } else {
	                int op2 = Integer.parseInt(stack.pop());
	                int op1 = Integer.parseInt(stack.pop());
	                int res = calculate(op1, op2, tokens[i].charAt(0));
	                stack.push(""+res);
	            }
	        }

	        if (stack.size() != 1) {
	            System.out.println("Invalid expression");
	            return -1;
	        } else {
	            return Integer.parseInt(stack.pop());
	        }
	    }

//	public static int prefixEvaluate(String prefix) {
//		//1. create stack to  push operands
//		Stack st = new Stack(10);
//		//2. traverse prefix expression from right to left
//		for(int i = prefix.length()-1  ; i >= 0 ; i--) {
//			//3. extract element from ith index
//			char ele = prefix.charAt(i);
//			//4. check if operand
//			if(Character.isDigit(ele))
//				st.push(ele - '0');// push it on stack
//			//5. if operator
//			else {
//				//6. pop two elements from stack 
//				int op1 = st.pop();	//6.1 first popped will become first operand
//				int op2 = st.pop();	//6.2 second popped will become second operand
//				//7. perform operation of op1, op2 and ele
//				int res = calculate(op1, op2, ele);
//				//8. push result on stack
//				st.push(res);
//			}
//		}
//		//9. pop result from stack and return it
//		if(!st.isEmpty())
//			return st.pop();
//		return 0;
//	}
	
	public static void main(String[] args) {
		String str = "10 12 + 3 4 – +";
		String[] postfix = str.split(" ");
		System.out.println(Arrays.toString(postfix));
		int result = postfixEvaluate(str);
		System.out.println(result);
//		System.out.println("Post : " + postfix);
//		int result = postfixEvaluate(postfix);
//		System.out.println("Result : " + result);
		
//		String prefix = "-++4/*56397";
//		
//		System.out.println("Pre : " + prefix);
//		result = prefixEvaluate(prefix);
//		System.out.println("Result : " + result);
	}

}









