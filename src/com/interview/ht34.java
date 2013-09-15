package com.interview;
public class ht34 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findTheUglyNumber(1501);
		findTheUglyNumber(2);
		findTheUglyNumber(3);
		findTheUglyNumber(4);
		findTheUglyNumber(5);
		findTheUglyNumber(6);
		findTheUglyNumber(7);
		findTheUglyNumber(8);
		findTheUglyNumber(9);
		findTheUglyNumber(10);
		findTheUglyNumber(1);
		findTheUglyNumber(0);
		
	}
	public static void findTheUglyNumber(int n){
		if(n==0){
			return;
		}
		int count = 0;
		int[] res = new int[n];
		int t2=0,t3=0,t5=0;
		res[count] = 1;
		while(count < n-1){
			while(res[t2] *2 <= res[count]){
				t2 ++;
			}
			while(res[t3]*3 <= res[count]){
				t3 ++;
			}
			while(res[t5]*5 <= res[count]){
				t5 ++;
			}
			int m = min(res[t2]*2,res[t3]*3,res[t5]*5);
			res[++count] = m;
		}
		System.out.println(res[n-1]);
		
	}
	private static int min(int i, int j, int k) {
		// TODO Auto-generated method stub
		int min = Math.min(i, j);
		return Math.min(min,k);
	}

}
