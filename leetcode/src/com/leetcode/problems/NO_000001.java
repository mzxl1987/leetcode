package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * @author Administrator
 *
 */
public class NO_000001 {

	public int[] twoSum(int[] nums, int target) {
        
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0,max = nums.length; i < max; i++){
			if(map.containsKey(target - nums[i])) return new int[]{map.get(target - nums[i]), i};
			map.put(nums[i], i);
		}
		
		return null;
    }
	
	public static void main(String[] args) {
		
		NO_000001 t = new NO_000001();
		System.out.println(t.twoSum(new int[]{2,7,1,5}, 9));
		
	}

}
