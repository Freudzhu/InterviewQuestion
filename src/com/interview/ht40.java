package com.interview;

import java.util.ArrayList;
import java.util.Iterator;

public class ht40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array ={1,3,3,4,4,5,6,7,6,1};
		ArrayList<Integer> result = new ArrayList<Integer>();
		findTwoValueDiff(array,result);
		Iterator iterator = result.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
	public static void findTwoValueDiff(int[] array,ArrayList<Integer> result){
		if(array == null || array.length < 0 ){
			return ;
		}
		int res = array[0];
		for(int i =1;i<array.length;i++){
			res ^= array[i];
		}
		int position = findFirstBit1(res);
		int firstValue = 0;
		int secondvalue = 0;
		for(int i=0;i<array.length;i++){
			if(isBit1(array[i],position)){
				firstValue ^= array[i];
			}
			else{
				secondvalue ^= array[i];
			}
		}
		result.add(firstValue);
		result.add(secondvalue);
		
		
	}
	public static int findFirstBit1(int src){
		int position = 0;
		while((src & 1) != 1 && position <= 32 ){//especialy 00000000000.....000 32bit
			position ++;
			src = src >> 1;
		}
		return position;
	}
	public static boolean isBit1(int src,int position){
		if(src ==0 || position < 0){
			return false;
		}
		src >>= position;
		if((src & 1) == 1){
			return true;
		}else{
			return false;
		}
	}

}
