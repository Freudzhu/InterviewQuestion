package com.interview;

public class cc1dot1 {
	public static boolean isUnique(String src){
		boolean[] map= new boolean[256];
		char[] chSrc = src.toCharArray();
		for(int i=0;i<chSrc.length;i++){
			if(!map[chSrc[i]]){
				map[chSrc[i]] = true;
			}else{
				return false;
			}
		}
		return true;
	}
	public static boolean isUnique1(String src){
		char[] chSrc = src.toCharArray();
		int check = 0;
		for(int i=0;i<chSrc.length;i++){
			if((check & (1 << (chSrc[i] - 'a'))) != 0){
				return false;
			}
			check |= 1 << (chSrc[i] - 'a');
		}
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "zhuhaihuan";
		String test1 = "heloffff";
		System.out.println(isUnique(test));
		System.out.println(isUnique(test1));
		System.out.println(isUnique1(test1));
	}

}
