package com.leetcode.problems;

/**
 * Jump Game
 * @author Administrator
 *
 */
public class NO_55 {

	public boolean canJump(int[] nums) {
		int pre = nums.length - 1;
        for(int i = pre; i >= 0;i--){
        	if(i + nums[i] >= pre) pre = nums[i];
        }
        
        return pre == 0;
    }
	
	public static void main(String[] args) {
		NO_55 t = new NO_55();
		System.out.println(t.canJump(new int[]{2,3,1,1,4}));
	}
	
}
