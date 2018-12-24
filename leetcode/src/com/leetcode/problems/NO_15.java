package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  3Sum
 * @author Administrator
 *
 */
public class NO_15 {
	public List<List<Integer>> threeSum(int[] nums) {

		if(null == nums || nums.length < 3) return new ArrayList<>();
		
		Arrays.sort(nums);
		
		List<List<Integer>> list = new ArrayList<>();
		
		int x,y,z;
		int MAX = nums.length - 2,max = nums.length,sum;
		
		for(x=0;x <= MAX;x++) {
			y = x + 1;
			z = max - 1;
			sum = -nums[x];
			
			if(x == 0 || (x != 0 && nums[x] != nums[x-1])) {
				while(y < z) {
					if(nums[y] + nums[z] > sum)            z--;
					else if(nums[y] + nums[z] < sum)       y++;
					else {
						list.add(Arrays.asList(nums[x],nums[y],nums[z]));
						
						while(y < z && nums[y] == nums[y+1]) y++;
						while(y < z && nums[z] == nums[z-1]) z--;
						
						y++;
						z--;
					}
				}
			}
		}
		
		return list;
    }
}
