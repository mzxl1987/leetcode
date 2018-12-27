package com.leetcode.problems;

import java.util.Stack;

/**
 * Min Stack
 * @author Administrator
 *
 */
public class NO_000155 {
    //
}


class MinStack {

    /** initialize your data structure here. */
    public Stack<Integer> stack;
	public int min;
	
	public MinStack() {
		min = Integer.MAX_VALUE;
        stack = new Stack<>();
    }
    
    public void push(int x) {
    	if(x <= min){
    		stack.push(min);
    		min = x;
    	}
        stack.push(x);
    }
    
    public void pop() {
        if(min == stack.pop()){
        	min = stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}