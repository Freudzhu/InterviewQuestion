package com.interview;

import java.util.Arrays;

public class cc1dot4 {
	public static boolean isAnagrams(String s,String t){
		if( s== null || t == null){
			return false;
		}
		if(s.length() != t.length()){
			return false;
		}
		char[] u = s.toCharArray();
		Arrays.sort(u);
		char[] v = t.toCharArray();
		Arrays.sort(v);
		if(new String(u).equals(new String(v))){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isAnagrams1(String s,String t){
		if( s== null || t == null){
			return false;
		}
		if(s.length() != t.length()){
			return false;
		}
		int[] map = new int[256];
		char[] u = s.toCharArray();
		char[] v = t.toCharArray();
		int len = u.length;
		for(int i=0;i<len;i++){
			map[(int)u[i]]++;
			map[(int)v[i]]--;
		}
		for(int i=0;i<256;i++){
			if(map[i]!=0){
				return false;
			}
		}
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abbczd";
		String test2 = "actdbb";
		System.out.println(isAnagrams1(test,test2));
	}

}
