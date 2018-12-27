package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class NO_000077 {

	List<List<Integer>> list = new ArrayList<>();
	List<Integer> tmp = new ArrayList<>();
	
	public List<List<Integer>> combine(int n, int k) {
		append(tmp,n,k);
        return list;
    }
	
	public void append(List<Integer> result,int n, int k){
		
		if(k == 0){
			list.add(new ArrayList<>(result));
			return ;
		}
		
		for(int i = n; i > 0; i--){ 
			tmp.add(i);
			append(tmp,i - 1,k - 1);
			tmp.remove(tmp.size() - 1);
		}
	}
	
}
