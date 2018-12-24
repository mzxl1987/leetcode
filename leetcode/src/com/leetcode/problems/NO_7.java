package com.leetcode.problems;

/**
 * Reverse Integer
 * @author Administrator
 *
 */
public class NO_7 {

	public int reverse(int x) {

		if (x == 0 || (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE))
			return 0;

		long result = 0;
		int tmp_x = Math.abs(x);

		while (tmp_x != 0) {
			result = (result * 10) + tmp_x % 10;
			tmp_x /= 10;
		}

		if (result > Integer.MAX_VALUE)
			return 0;

		return (int) (x < 0 ? -result : result);
	}

}
