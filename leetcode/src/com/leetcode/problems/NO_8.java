package com.leetcode.problems;

public class NO_8 {
	public int myAtoi(String str) {

		boolean flag_positive = true;
		char tmp_c;
		long r = 0;

		if (null == str || (str = str.trim()).length() == 0)   return 0;

		if (str.startsWith("-") || str.startsWith("+")) {
			if (str.startsWith("-"))
				flag_positive = false;
			str = str.substring(1);
		}

		if (str.length() == 0 || !((tmp_c = str.charAt(0)) >= '0' && tmp_c <= '9'))  return 0;

		for (int i = 0, tmp_i = 0, max = str.length(); i < max
				&& ((tmp_c = str.charAt(i)) >= '0' && tmp_c <= '9'); i++) {
			tmp_i = Integer.parseInt(tmp_c + "");
			r = r * 10 + tmp_i;
			if (r > Integer.MAX_VALUE) {
				return flag_positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
		}

		return (int) (flag_positive ? r : -r);

	}
}
