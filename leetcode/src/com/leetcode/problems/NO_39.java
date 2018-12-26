package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class NO_39 {

	List<List<Integer>> list = new ArrayList<>();
	List<Integer> tmp = new ArrayList<>();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		combination(candidates, 0,target,candidates.length);
		return list;
		
    }
	
	public void combination(int[] candidates, int start, int target, int max){
	
		if(target == 0){
			list.add(new ArrayList<>(tmp));
			return;
		}
		
		for(int i = start; i < max; i++){
			if(target < candidates[i]) continue;
			tmp.add(candidates[i]);
			combination(candidates, i, target - candidates[i], max);
			tmp.remove(tmp.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		NO_39 t = new NO_39();
		System.out.println(t.combinationSum(new int[]{2, 3, 5}, 8));
		
	}
	
}
