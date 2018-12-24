package com.leetcode.problems;

/**
 * Climbing Stairs
 * @author Administrator
 *
 */
public class NO_70 {
	public int climbStairs(int n) {
        int one = 1, two = 1, three = 1, i = 2;
        for(;i <= n;i++){
            three = one + two;
            one = two;
            two = three;
        }

        return three;
    }
}
