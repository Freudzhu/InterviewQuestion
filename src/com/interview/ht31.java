package com.interview;

public class ht31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count1Number(100000000);
	}
	public static void count1Number(int n){
		int count = 0;
		int factor = 1;
		int cur = 0;
		int high = 0;
		int low = 0;
		while(n / factor != 0){
			low = n - (n / factor )  * factor;
			cur = (n / factor) % 10;
			high = n / factor / 10 ;
			if(cur == 0){
				count += (high) * factor; 
			}
			else if(cur == 1){
				count += high * factor + low + 1;
			}
			else{
				count += (high + 1)*factor;
			}
			factor *= 10;
		}
		System.out.println(count);
	}

}
