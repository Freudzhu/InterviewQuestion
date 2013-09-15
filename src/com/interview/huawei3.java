package com.interview;

import java.util.ArrayList;

public class huawei3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		earseDuplicateChar("aabdcddgs".toCharArray());

	}
	public static void earseDuplicateChar(char[] src){
		boolean[] map = new boolean[256];
		char[] result = new char[src.length];
		int j = 0;
		for(int i=0;i < src.length;i++){
			if(!map[src[i]]){
				result[j] = src[i];
				j++;
				map[src[i]] = true;
			}
		}
		System.out.println(new String(result));
	}

}
