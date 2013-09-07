package com.interview;

public class ht42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a student";
		System.out.println(reverseString(s));
		System.out.println(shitWordN("zhuhaihuan",10));
	}
	public static void reverseChar(char[] src,int begin,int end){
		if(begin > end){
			return ;
		}
		while(begin <= end){
			char tmp = src[begin];
			src[begin] = src[end];
			src[end] = tmp;
			begin ++;
			end --;
		}
		
	}
	public static String shitWordN(String s,int n){
		if(s!=null && n >= 0 && n <= s.length()){
			char[] shit =  s.toCharArray();
			reverseChar(shit,0,n-1);
			reverseChar(shit,n,s.length()-1);
			reverseChar(shit,0,s.length()-1);
			return new String(shit);
		}
		return null;
	}
	public static String reverseString(String s){
		if(s == null){
			return null;
		}
		char[] reverseArray =  s.toCharArray();
		int lastIndex = 0;
		for(int i =0;i <= s.length();i++){
			if(i == s.length() ||  reverseArray[i] == ' '){
				reverseChar(reverseArray,lastIndex,i-1);
				lastIndex = i+1;
			}
		}
		reverseChar(reverseArray,0,s.length()-1);
		return new String(reverseArray);
	}

}
