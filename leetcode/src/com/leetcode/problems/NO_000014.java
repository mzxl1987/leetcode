package com.leetcode.problems;

/**
 * Longest Common Prefix
 * @author Administrator
 *
 */
public class NO_000014 {
	public String longestCommonPrefix(String[] strs) {
        if(null == strs || strs.length == 0) return "";
		
		int offset = 0;
		char tmp_c;
		while(true){
			tmp_c = 0x00;
			for(String s : strs){
				
				if(null == s || offset >= s.length())   return offset == 0 ? "" : s.substring(0,offset);
				
				if(tmp_c == 0x00)       tmp_c = s.charAt(offset);
				
				if(tmp_c != s.charAt(offset))      return offset == 0 ? "" : s.substring(0,offset); 
				
			}
			
			offset ++;
		}	
    }
}
