package com.leetcode.clazz;
import java.util.Stack;

public class MinStack {
	
	
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
