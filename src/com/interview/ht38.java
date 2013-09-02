package com.interview;

public class ht38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,3,3,3,4,5,7};
		int s = getFirstK(array,0,array.length-1,3);
		int e = getLastK(array,array.length-1,0,array.length-1,3);
		System.out.println(e);
		System.out.println(s);

	}
	public static int getFirstK(int[] array,int start,int end,int k){
		if(start > end){
			return -1;
		}
		int midPos = start + (end - start)/2;
		int midData = array[midPos];
		if(midData == k){
			if( (midPos != 0 && array[midPos-1] != k )|| midPos == 0){
				return midPos;
			}else{
				end = midPos -1;
			}
			
		}
		else if(midData > k){
			end = midPos - 1;
		}else{
			start = midPos + 1;
		}
		return getFirstK(array,start,end,k);
		
	}
	public static int getLastK(int[] array,int length ,int start,int end,int k){
		if(start > end){
			return -1;
		}
		int midPos = start + (end - start)/2;
		int midData = array[midPos];
		if(midData == k){
			if( (midPos != length && array[midPos+1] != k) || midPos == length ){
				return midPos;
			}else{
				start = midPos + 1;
			}
			
		}
		else if(midData > k){
			end = midPos - 1;
		}else{
			start = midPos + 1;
		}
		return getLastK(array,length,start,end,k);
		
	}

}
