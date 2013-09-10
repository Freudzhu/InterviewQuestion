package com.interview;

public class ht29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,5,5,5,5,5,5,5,1,7,8,9};
		System.out.println(moreThanHalf(array));
		int[] array1 = {2,3,3,3,4,4,4};
		System.out.println(moreThanHalf(array1));
		System.out.println(moreThanHalfTwo(array));
		System.out.println(moreThanHalfTwo(array1));
	}
	public static int moreThanHalfTwo(int[] array){
		int element = array[0];
		int count = 1;
		for(int i = 1;i<array.length;i++){
			if(count == 0){
				element = array[i];
			}
			if(array[i] == element){
				count ++;
			}else{
				count --;
			}
		}
		return element;
	}
	public static int moreThanHalf(int[] array){
		int length = array.length;
		int middle = length / 2;
		int start = 0;
		int end = length - 1;
		int index = patition(array,start,end);
		while(index != middle){
			if(index > middle){
				end = index - 1;
				index = patition(array,start,index -1);
			}
			else{
				start = index + 1;
				index = patition(array,index +1,end);
			}
		}
		return array[index];
	}
	public static int patition(int[] array,int start,int end){
		if(array == null || start > end){
			return -1;
		}
		int index = (start+end )/2;
		swap(array,index,end);
		int small = start - 1;
		for(int i = start;i < end ;i++){
			if(array[i] < array[end]){
				small ++;
				swap(array,small,i);
			}
		}
		small ++;
		swap(array,small,end);
		return small;
		
	}
	public static void swap(int[] array,int i,int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
