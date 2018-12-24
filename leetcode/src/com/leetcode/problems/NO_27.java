package com.leetcode.problems;

/**
 * Remove Element
 * @author Administrator
 *
 */
public class NO_27 {

	public int removeElement(int[] nums, int val) {
		int newLen = 0;
		for (int i = 0, max = nums.length; i < max; i++) 
			if (nums[i] != val)  
                nums[newLen++] = nums[i];

		return newLen;
	}
	
}
