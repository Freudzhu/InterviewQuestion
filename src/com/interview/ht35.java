package com.interview;

public class ht35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inversePairs(new int[]{7,5,6,4});
	}
	public static void inversePairs(int[] data){
		if(data == null || data.length < 0){
			return;
		}
		int[] copy = new int[data.length];
		int count = inversPairsCore(data,copy,0,data.length-1);
		System.out.println(count);
	}
	private static int inversPairsCore(int[] data,int[] copy,int start,int end) {
		// TODO Auto-generated method stub
		if(start == end){
			copy[start] = data[start];
			return 0;
		}
		int length = (end - start)/2;
		int left = inversPairsCore(data,copy,start,start+length);
		int right = inversPairsCore(data,copy,start+length+1,end);
		int i = start + length;
		int j = end;
		int count = 0;
		int indexCopy = end;
		while(j >= start + length+1 && i >= start){
			if(data[i] > data[j]){
				count += j  - start -length ;
				copy[indexCopy --] = data[i];
				i--;
			}else{
				copy[indexCopy --] = data[j];
				j--;
			}
		}
		while( j >= start + length+1){
			copy[indexCopy--] = data[j];
			j--;
		}
		while(i >= start){
			copy[indexCopy--] = data[i];
			i--;
		}
		//在归并排序中，排序完成后要将拷贝数组的数字重新拷回原数组
		for(int t= start;t<=end ; t++) 
			data[t]=copy[t]; 
		return count + left+right;
	}

}
