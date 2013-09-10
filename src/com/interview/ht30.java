package com.interview;

import java.util.Iterator;
import java.util.TreeSet;

public class ht30 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = {7,6,8,3,4,5,3,2,1,8,9};
		int start = 0;
		int end = src.length-1;
		int index = patition(src,start,end);
		int k =4;
		while( index != k){
			if(index > k){
				end = index - 1;
				index = patition(src,start,end);
			}else{
				start = index + 1;
				index = patition(src,start,end);
			}
		}
		for(int i=0;i<=k;i++){
			System.out.println(src[i]+" ");
		}
		int[] src1 = {7,6,8,3,4,5,3,2,1,8,9};
		System.out.println("other");
		otherMethod(src1,k);
	}
	public static void otherMethod(int[] src,int k){
		if( k > src.length){
			return;
		}
		TreeSet<Integer> s = new TreeSet<Integer>();
		for(int i=0;i<k;i++){
			s.add(src[i]);
		}

		for(int i=k;i<src.length;i++){
			int last = s.last();
			if(last > src[i] ){
				s.remove(last);
				s.add(src[i]);
			}
		}
		Iterator t = s.iterator();
		while(t.hasNext()){
			System.out.println(t.next());
		}
		
	}
	public static int patition(int[] src,int start,int end){
		if(src == null || start > end){
			return -1;
		}
		int index = (start + end) / 2;
		swap(src,index,end);
		int small = -1;
		for(int i=0;i< src.length;i++){
			if(src[i] < src[end]){
				small++;
				swap(src,i,small);
			}
		}
		small++;
		swap(src,small,end);
		return small;
	}
	private static void swap(int[] src, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = src[i];
		src[i] = src[j];
		src[j] = tmp;
	}
}
