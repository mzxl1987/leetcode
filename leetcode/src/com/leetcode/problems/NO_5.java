package com.leetcode.problems;

/**
 * Longest Palindromic Substring
 * 
 * @author Administrator
 *
 */
public class NO_5 {

	private int start;
	private int length;
	private int max;

	public String longestPalindrome(String s) {

		if (s == null)
			return "";
		if (s.length() < 2)
			return s;

		max = s.length() - 1;
		for (int i = 0; i <= max; i++) {
			maxHuiWenString(s, i, i);
			maxHuiWenString(s, i, i + 1);
		}

		return s.substring(start, start + length);
	}

	public void maxHuiWenString(String s, int Left, int Right) {
		int L = Left;
		int R = Right;
		int tmp_len;
		while (L >= 0 && R <= max && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}

		tmp_len = R - L - 1;
		if (tmp_len > length) {
			start = L + 1;
			length = tmp_len;
		}

	}
}
