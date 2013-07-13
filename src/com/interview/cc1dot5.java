package com.interview;
public class cc1dot5 {
	public static char[] replace(char[] src,int length){
		int spaceCount = 0;
		for(char c : src){
			if(c == ' '){
				spaceCount++;
			}
		}
		int newLength = spaceCount * 2 + length;
		char[] dst = new char[newLength];
		int i = 0;
		for(i = length - 1;i >= 0; i--){
			if(src[i] == ' '){
				dst[newLength-1] = '%';
				dst[newLength-2] = '2';
				dst[newLength-3] = '0';
				newLength = newLength - 3;
				
			}else{
				dst[newLength-1] = src[i];
				newLength--;
			}
		}
		return dst;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] src = "i am hawstein".toCharArray();
		System.out.println(new String(replace(src,src.length)));
	}

}
