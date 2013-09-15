package com.interview;

public class huawei2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		notReaptedNumber(54);
		notReaptedNumber(10);
		notReaptedNumber(21009);
	}
	public static void notReaptedNumber(int a){
		while(true){
			a++;
			String src = String.valueOf(a);
			char[] cSrc = src.toCharArray();
			boolean flag = false;
			for(int i=1;i<cSrc.length;i++){
				if(cSrc[i-1] == cSrc[i]){
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println(a);
				break;
			}
			
		}
		
	}

}
