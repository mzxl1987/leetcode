package com.leetcode.problems;

/**
 * Merge Sorted Array
 * 
 * @author Administrator
 *
 */
public class NO_000088 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int last = m + n - 1;
		int tmp_m = m - 1, tmp_n = n - 1;
		while (tmp_m >= 0 && tmp_n >= 0)
			nums1[last--] = nums1[tmp_m] > nums2[tmp_n] ? nums1[tmp_m--] : nums2[tmp_n--];
		while (tmp_n >= 0)
			nums1[last--] = nums2[tmp_n--];
	}
}
