package com.leetcode.problems;

/**
 * 11. Container With Most Water
 * @author Administrator
 *
 */
public class NO_11 {

public int maxArea(int[] height) {
        
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;
		while(left < right){
			maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right])); 
			if(height[left] > height[right]) right--;
			else left++;
		}
		
		return maxArea;
    }
	
}
