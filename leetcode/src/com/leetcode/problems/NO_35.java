package com.leetcode.problems;

import java.util.Arrays;

/**
 * Search Insert Position
 * 
 * @author Administrator
 *
 */
public class NO_35 {
	public int searchInsert(int[] nums, int target) {

		if (null == nums || nums.length == 0)
			return 0;

		if (nums.length > 1)
			Arrays.sort(nums);

		for (int i = 0, MAX = nums.length; i < MAX; i++) {
			if (target <= nums[i])
				return i;
		}

		return nums.length;
	}
}
