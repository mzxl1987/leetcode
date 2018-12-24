package com.leetcode.problems;

import java.util.Arrays;
import java.util.List;

public class NO_13 {
	public final List<String> I_1To9 = Arrays.asList(new String[]{"", "I","II","III","IV","V","VI","VII","VIII","IX"});
	public final List<String> X_10To90 = Arrays.asList(new String[]{"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"});
	public final List<String> C_100To900 = Arrays.asList(new String[]{"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"});
	public final List<String> M_1000To3000 = Arrays.asList(new String[]{"", "M","MM","MMM"});
	
	public int romanToInt(String s) {
        int offset = 0;
        int r = 0;
        String mark = null;
        
        for(String m : M_1000To3000)  if(s.startsWith(m, offset))  mark = m;
        
        if(mark != null){
	        r += M_1000To3000.indexOf(mark) * 1000;
			offset += mark.length();
			mark = null;
        }
        
        for(String m : C_100To900)   if(s.startsWith(m, offset))  mark = m;
        
        if(mark != null){
	        r += C_100To900.indexOf(mark) * 100;
			offset += mark.length();
			mark = null;
        }
        
        for(String m : X_10To90)  if(s.startsWith(m, offset)) mark = m;
        
        if(mark != null){
	        r += X_10To90.indexOf(mark) * 10;
			offset += mark.length();
			mark = null;
        }
        
        for(String m : I_1To9)  if(s.startsWith(m, offset)) mark = m;
        
        if(mark != null){
	        r += I_1To9.indexOf(mark);
			offset += mark.length();
			mark = null;
        }
        
        return r;
    }
}
