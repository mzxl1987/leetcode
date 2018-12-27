package com.leetcode.problems;

import java.util.Arrays;

/**
 * N-Repeated Element in Size 2N Array
 * @author Administrator
 *
 */
public class NO_000961 {
public int repeatedNTimes(int[] A) {
		
		int pre = Integer.MIN_VALUE;
		int count = 1;
		int halfSize = A.length / 2;
		
		Arrays.sort(A);
		
		for(int i:A) {
			
			if(pre == i) {
				count++;
			}else {
				count = 1;
			}
			
			if(count == halfSize) return pre;
			
			pre = i;
			
			
			
		}
		
        return Integer.MIN_VALUE;
    }
}
