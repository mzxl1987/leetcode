package com.leetcode.problems;

/**
 * Single Number
 * @author Administrator
 *
 */
public class NO_136 {
	public int singleNumber(int[] nums) {
        int r = 0;
		for(int i : nums){
			r ^= i;
		}
		
		return r;
    }
}
