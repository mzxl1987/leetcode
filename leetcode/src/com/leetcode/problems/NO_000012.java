package com.leetcode.problems;

public class NO_000012 {
	public final String[] I_1To9 = {"", "I","II","III","IV","V","VI","VII","VIII","IX"};
	public final String[] X_10To90 = {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	public final String[] C_100To900 = {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	public final String[] M_1000To3000 = {"", "M","MM","MMM"};
	
	public String intToRoman(int num) {

		if (num < 1 || num > 3999) return null;

		StringBuilder sb = new StringBuilder();
		
		sb.append(M_1000To3000[ num / 1000 ])
		.append(C_100To900[ num % 1000 / 100 ])
		.append(X_10To90[ num % 100 / 10 ])
		.append(I_1To9[ num % 10 ]);

		return sb.toString();
	}
}
