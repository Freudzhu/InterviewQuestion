package com.interview;

public class cc5dot1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1<<10,m=21;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		setBitsIAndJ(n,m,2,6);
	}
	public static void setBitsIAndJ(int n,int m,int i,int j){
		int max = ~0;
		int left = max - (1<<(j+1) -1);
		int right = 1<<i -1;
		int mask = left | right;
		int result = (n&mask) | (m<<i);
		System.out.println(Integer.toBinaryString(result));
	}

}
