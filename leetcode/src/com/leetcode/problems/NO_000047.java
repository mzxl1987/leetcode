package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NO_000047 {

	List<List<Integer>> list = new ArrayList<>();
	List<Integer> tmp = new ArrayList<>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		combination(nums, 0, nums.length);
		return list;
	}

	public void combination(int[] nums, int start, int max) {

		if (tmp.size() == max) {
			list.add(new ArrayList<>(tmp));
			return;
		}

		if (start == max)
			return;

		int tmp_i;
		for (int i = start; i < max; i++) {
			tmp_i = nums[i];

			tmp.add(tmp_i);
			combination(nums, start + 1, max);
			tmp.remove(tmp.size() - 1);
		}
	}

	public static void main(String[] args) {
		NO_000047 t = new NO_000047();
		System.out.println(t.permuteUnique(new int[] { 1, 2, 1 }));
	}

}
