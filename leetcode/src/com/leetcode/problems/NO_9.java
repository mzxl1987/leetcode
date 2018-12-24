package com.leetcode.problems;

/**
 * Palindrome Number
 * @author Administrator
 *
 */
public class NO_9 {
	public boolean isPalindrome(int x) {

		char[] c_x = String.valueOf(x).toCharArray();
		int L = 0, R = c_x.length - 1;

		while (L < R) {

			if (c_x[L] != c_x[R])
				return false;

			L++;
			R--;
		}

		return true;
	}
}
