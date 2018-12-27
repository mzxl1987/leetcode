package com.leetcode.problems;

import java.util.LinkedList;
import java.util.List;

/**
 * Plus One
 * 
 * @author Administrator
 *
 */
public class NO_000066 {
	public int[] plusOne(int[] digits) {

		List<Integer> list = new LinkedList<Integer>();
		int left = 0;

		for (int max = digits.length - 1, i = max, tmp = 0; i >= 0; i--) {
			tmp = max == i ? digits[i] + 1 : digits[i];
			list.add(0, (tmp + left) % 10);
			left = (tmp + left) / 10;
		}

		if (left != 0)
			list.add(0, left);

		int[] r = new int[list.size()];
		for (int i = 0, max = list.size(); i < max; i++)
			r[i] = list.get(i);

		return r;
	}
}
