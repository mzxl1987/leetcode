package com.leetcode.problems;

import java.util.Arrays;

public class NO_000205 {

	public boolean isIsomorphic(String s, String t) {

		if (s == null && t == null)
			return true;
		if (s == null || t == null)
			return false;
		if (s.length() != t.length())
			return false;

		int i = 0;
		int max = s.length();
		int[] sArr = new int[256];
		int[] tArr = new int[256];

		Arrays.fill(sArr, -1);
		Arrays.fill(tArr, -1);

		while (i < max) {
			if (sArr[s.charAt(i)] != tArr[t.charAt(i)])
				return false;
			sArr[s.charAt(i)] = tArr[t.charAt(i)] = i;
			i++;
		}

		return true;

	}

	public static void main(String[] args) {
		NO_000205 t = new NO_000205();
		System.out.println(t.isIsomorphic("egg", "add"));
	}
}
