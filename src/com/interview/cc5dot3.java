package com.interview;

public class cc5dot3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(nextWithSameBits(x));
		
	}
	public static int nextWithSameBits(int x){
		int bak = x;
		int bit = 0;
		for(;((x & 1) != 1) && bit < 32;x >>= 1,bit++);
		for(;((x & 1) != 0) && bit < 32;x >>= 1,bit++);
		if(bit == 31){
			return -1;
		}
		x |= 1;
		x <<= bit;
		if(bit == 32)
			x =0;
		int count = count1(bak) - count1(x);
		int c = 1;
		for(;count > 0; x |= c,c<<=1,count--);
		System.out.println(Integer.toBinaryString(x));
		return x;
		
	}
	public static int count1(int x){
		int count = 0;
		while(x != 0){
			x = x & (x - 1);
			count ++;
		}
		return count;
	}

}
