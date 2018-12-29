package com.leetcode.problems;

public class NO_000058 {
	public int lengthOfLastWord(String s) {
        if(s == null) return 0;
        String[] sArr = s.split(" ");
        return sArr.length > 0 ? sArr[sArr.length - 1].length() : 0;
    }
}
