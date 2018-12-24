package com.leetcode.problems;

import java.util.Stack;

/**
 * Valid Parentheses
 * 
 * @author Administrator
 *
 */
public class NO_20 {
public boolean isValid(String s) {
        
		if(null == s || s.length() == 0) return true;
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
								
				if((c == ')' && !stack.isEmpty() && stack.lastElement() == '(') ||
				   (c == ']' && !stack.isEmpty() && stack.lastElement() == '[') ||
				   (c == '}' && !stack.isEmpty() && stack.lastElement() == '{')) {
					stack.pop();
					continue;
				}
			
			stack.push(c);
		}
		
		return stack.isEmpty();
    }
}
