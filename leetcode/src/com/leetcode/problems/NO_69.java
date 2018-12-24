package com.leetcode.problems;

/**
 * Sqrt(x)
 * 
 * @author Administrator
 *
 */
public class NO_69 {
	public int mySqrt(int x) {

		if (x <= 0 || x == 1)
			return x;

		long left = 0;
		long right = x;
		long mid = 1;

		while (left != right - 1) {
			mid = (left + right) / 2;
			if (mid * mid > x)
				right = mid;
			else
				left = mid;
		}

		return (int) (right * right > x ? left : right);

	}
}
