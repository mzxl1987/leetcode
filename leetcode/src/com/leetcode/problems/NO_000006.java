package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class NO_000006 {

	public List<StringBuilder> arr = new ArrayList<>();

	public String convert(String s, int numRows) {

		if (null == s || numRows < 1)
			return "";
		if (s.length() < numRows || numRows == 1)
			return s;

		boolean flag = true;
		int cursor = 0, index = 0, max = s.length(), maxRow = numRows - 1;

		for (int i = 0; i < numRows; i++)
			arr.add(new StringBuilder());

		while (index < max) {

			arr.get(cursor).append(s.charAt(index));

			cursor = flag ? cursor + 1 : cursor - 1;

			index++;

			flag = (index % maxRow == 0) ? !flag : flag;
		}

		StringBuilder sb = new StringBuilder();
		for (StringBuilder c : arr)
			sb.append(c);

		return sb.toString();
	}

}
