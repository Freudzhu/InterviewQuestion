package com.interview;
import java.util.Arrays;
import java.util.Comparator;
public class ht33 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minNumber(new String[]{"3","32","321"}));
	}
	public static String minNumber(String[] src){
		if(src == null){
			return null;
		}
		Arrays.sort(src,new Comparator(){
			@Override
			public int compare(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
				char[] s = ((String)arg0).toCharArray();
				char[] t = ((String)arg1).toCharArray();
				int i = 0,j=0;
				while(i < s.length && j < t.length){
					if(s[i] > t[j]){
						return -1;
					}else if(s[i] < t[j]){
						return 1;
					}else{
						i++;
						j++;
						if( i == s.length && j != t.length){
							return 1;
						}
						if( j == t.length && i != s.length)
							return -1;
						
						}
				}
				return 0;
			}
			
		});
		StringBuilder result = new StringBuilder();
		for(String r : src){
			result.append(r);
		}
		return result.toString();
	}
}
