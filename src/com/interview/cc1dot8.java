package com.interview;

public class cc1dot8 {
	public static boolean isRolateString(String s,String t){
		if(s == null || t == null){
			return false;
		}
		s += s;
		if(s.contains(t)){
			return true;
		}
		return false;
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "waterbottle";
		String t = "erbottlewat";
		System.out.println(isRolateString(s,t));
		s = "aaaa";
		t = "bbbb";
		System.out.println(isRolateString(s,t));
		s = "";
		t = "";
		System.out.println(isRolateString(s,t));
		s = "ab";
		t = "ba";
		System.out.println(isRolateString(s,t));
		s = "a";
		t = "a";
		System.out.println(isRolateString(s,t));
	}

}
