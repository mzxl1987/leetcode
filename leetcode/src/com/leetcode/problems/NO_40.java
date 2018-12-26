package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO_40 {

	List<List<Integer>> list = new ArrayList<>();
	List<Integer> tmp = new ArrayList<>();
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		combination(candidates ,0,target,candidates.length);
		return list;
		
    }

	public void combination(int[] candidates, int start, int target, int max){
		
		if(target == 0){
			list.add(new ArrayList<>(tmp));
			return;
		}
		
		int tmp_i;
		for(int i = start; i < max; i++){
			tmp_i = candidates[i];
			
			if(target < tmp_i) break;
			if(i != start && candidates[i - 1] == tmp_i) continue;			
			
			tmp.add(tmp_i);
			combination(candidates, i+1, target - tmp_i, max);
			tmp.remove(tmp.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		NO_40 t = new NO_40();
		System.out.println(t.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
		
	}
	
}
