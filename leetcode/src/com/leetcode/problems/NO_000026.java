package com.leetcode.problems;

/**
 * Remove Duplicates from Sorted Array
 * 
 * @author Administrator
 *
 */
public class NO_000026 {
	public int removeDuplicates(int[] nums) {

		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;

		int newLen = 0;
		for (int i = 1, max = nums.length; i < max; i++) {
			if (nums[i] != nums[newLen]) {
				nums[++newLen] = nums[i];
			}
		}

		return newLen + 1;
	}
}
