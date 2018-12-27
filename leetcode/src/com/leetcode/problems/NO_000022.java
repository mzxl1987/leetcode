package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class NO_000022 {
	
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		append(list, "", n, n);
		return list;
    }
	
	public void append(List<String> result, String pre,int left, int right){
		if(right == 0){
			result.add(pre);
			return;
		}
		
		if(left == right) append(result,pre + "(",left -1,right);
		else{
			if(left != 0) append(result,pre + "(",left -1,right);
			append(result,pre + ")",left,right - 1);
		}
	}
	
	public static void main(String[] args) {
		NO_000022 t = new NO_000022();
		System.out.println(t.generateParenthesis(4));
	}
	
}
