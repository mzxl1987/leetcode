package com.leetcode.problems;

/**
 * Pow(x, n)
 * @author Administrator
 *
 */
public class NO_000050 {

	public double myPow(double x, int n) {
		if(n == 0) return 1;
		if(n == Integer.MIN_VALUE) return myPow(x,-1)*myPow(x,n+1);
		if(n < 0){
			n = -n;
			x = 1/x;
		}
		
        return n % 2 == 0 ? myPow(x*x, n / 2) : x * myPow(x*x, n / 2);
    }
	
	public static void main(String[] args) {
		NO_000050 t = new NO_000050();
		System.out.println(t.myPow(2, Integer.MIN_VALUE));
	}
	
}
