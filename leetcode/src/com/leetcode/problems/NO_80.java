package com.leetcode.problems;

/**
 * Remove Duplicates from Sorted Array II
 * @author Administrator
 *
 */
public class NO_80 {
public int removeDuplicates(int[] nums) {
        
		int length = nums.length;
		if(length < 3) return length;
		
		int pre = 1;
		int index = 2;
		while(index < length){
			if(nums[pre] != nums[index])                                       nums[++pre] = nums[index];
			else if(nums[pre] == nums[index] && nums[pre - 1] != nums[index])  nums[++pre] = nums[index];
			
			index++;
		}
		
		return pre + 1;
    }
}
