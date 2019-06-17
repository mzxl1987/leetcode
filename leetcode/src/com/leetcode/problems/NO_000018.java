package com.leetcode.problems;

import java.util.List;

public class NO_000018 {
	
	public static void main(String[] args) {
		NO_000018 t = new NO_000018();
		System.out.println(t.fourSum(new int[]{1,0,-1,0,-2,2},0));
	}
	
	/**
	 * 该方法将4sum逐层分解
	 * 4sum = num + 3sum = num + num + 2sum
	 */
	public List<List<Integer>> fourSum(int[] num, int target) {
		ArrayList<List<Integer>> ans = new ArrayList<>();
		if(num.length<4)return ans;
		Arrays.sort(num);
		for(int i=0; i<num.length-3; i++){
		    if(num[i]+num[i+1]+num[i+2]+num[i+3] > target) break; //值太大
		    if(num[i]+num[num.length-1]+num[num.length-2]+num[num.length-3] < target) continue; //值太小
		    if(i>0 && num[i]==num[i-1]) continue; //跳过相同的值
		    for(int j=i+1; j<num.length-2; j++){
			if(num[i]+num[j]+num[j+1]+num[j+2] > target) break; //值太大
			if(num[i]+num[j]+num[num.length-1]+num[num.length-2] < target) continue; //值太小
			if(j > i+1 && num[j]==num[j-1]) continue; //跳过相同的值
			int low = j+1, high = num.length-1;
			while(low < high){
			    int sum = num[i]+num[j]+num[low]+num[high];
			    if(sum == target){
				ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
				while(low < high && num[low] == num[low+1]) low++; //跳过相同的值
				while(low<high&&num[high] == num[high-1]) high--; //跳过相同的值
				low++; 
				high--;
			    }
			    //move window
			    else if(sum<target)low++; 
			    else high--;
			}
		    }
		}
		return ans;
	    }
}
