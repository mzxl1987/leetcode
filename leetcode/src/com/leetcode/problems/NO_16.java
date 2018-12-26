package com.leetcode.problems;

import java.util.Arrays;

/**
 * 
 * 16. 3Sum Closest
 * 
 * @author Administrator
 *
 */
public class NO_16 {
	public int threeSumClosest(int[] nums, int target) {

		if(nums.length == 3) return nums[0] + nums[1] + nums[2];
		
		Arrays.sort(nums);
		
		int left = 0;
		final int MAX = nums.length - 1;
		int sum = 0, tmp,tmp_sum = Integer.MAX_VALUE;
		
		while(left < MAX){
			int min = left + 1;
			int max = MAX;
			
			while(min < max){
				tmp = nums[left] + nums[min] + nums[max];
				
				if(tmp == target) return target;
				if(tmp_sum > Math.abs(target - tmp)){
					sum = tmp;
					tmp_sum = Math.abs(target - tmp);
				}
								
				if(target < tmp){
					max--;
				}else{
					min++;
				}
			}
			
			
			left++;
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		NO_16 t = new NO_16();
		System.out.println(t.threeSumClosest(new int[]{1,1,1,1}, 0));
		
	}
}
