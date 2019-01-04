package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * @author Administrator
 *
 */
public class NO_000118 {
	
	public List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		for(int row = 0; row < numRows; row++){
			List<Integer> r = new ArrayList<>();
			for(int col = 0; col <= row; col++){
				
				if(col == 0 || col == row){
					r.add(1);
					continue;
				}
				
				r.add(result.get(row - 1).get(col - 1) + result.get(row - 1).get(col));
			}
			result.add(r);			
		}
		
        return result;
    }
	
	public static void main(String[] args) {
		NO_000118 t = new NO_000118();
		System.out.println(t.generate(5));
	}
	
}
