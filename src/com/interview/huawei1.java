package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class huawei1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(newString("some local buses some1234123drivers"));

	}
	public static String newString(String src){
		String[] spits = src.split(" ");
		List<String> resultList = new ArrayList<String>();
		for(String s: spits){
			char[] c = s.toCharArray();
			boolean flag = true;
			for(char r : c){
				if( (r >= 'a' && r <= 'z') || (r >= 'A' && r<= 'Z') ){
					
				}else{
					flag = false;
					break;
				}
			}
			if(flag){
				resultList.add(s);
			}
		}
		Collections.sort(resultList,new Comparator(){

			@Override
			public int compare(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
				String s = (String)arg0;
				String t = (String)arg1;
				if(s.length() > t.length())
					return 1;
				else if(s.length() == t.length()){
					return 0;
				}else{
					return -1;
				}
				
			}
			
		});
		Set<String> res = new HashSet<String>(resultList);
		Iterator iter = res.iterator();
		String r = "";
		while(iter.hasNext()){
			r += (String)iter.next() + " ";
		}
		return r.trim();
	}

}
