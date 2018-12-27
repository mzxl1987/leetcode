package com.leetcode.problems;

/**
 * Add Binary
 * @author Administrator
 *
 */
public class NO_000067 {
public String addBinary(String a, String b) {
		
		if(null == a || a.length() == 0) return b;
		if(null == b || b.length() == 0) return a;
		
        StringBuilder sb = new StringBuilder();
        int left = 0, i = 0, sum = 0;
        int a_index = a.length() - 1;
        int b_index = b.length() - 1;
        final char ZERO = '0';
        
        while(a_index >= 0 && b_index >= 0){
        	sum = (a.charAt(a_index) - ZERO) + (b.charAt(b_index) - ZERO) + left; 
        	i = sum % 2;
        	left = sum / 2;
        	sb.insert(0, i);
        	a_index--;
        	b_index--;
        }
        
        while(a_index >= 0){
        	sum = (a.charAt(a_index) - ZERO) + left; 
        	i = sum % 2;
        	left = sum / 2;
        	sb.insert(0, i);
        	a_index--;
        }
        
        while(b_index >= 0){
        	sum = (b.charAt(b_index) - ZERO) + left; 
        	i = sum % 2;
        	left = sum / 2;
        	sb.insert(0, i);
        	b_index--;
        }
        
        if(left == 1) sb.insert(0, left);
        
        return sb.toString();
    }
}
