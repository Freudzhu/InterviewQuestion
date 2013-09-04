package com.interview;

public class ht41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,7,11,15};
		findNumbersWithSum(array,15);
		findNumbersWithSum(array,36);
		findContinuesNumber(9);
		findContinuesNumber(4);
	}
	public static void findNumbersWithSum(int[] array,int sum){
		if(array.length < 0){
			return ;
		}
		int begin = 0;
		int end = array.length - 1;
		int curSum = 0;
		while(begin < end){
			curSum = array[begin] + array[end];
			if(curSum == sum){
				System.out.println(array[begin] + " " + array[end]);
				break;
			}else if(curSum > sum){
				end --;
			}else{
				begin ++;
			}
			
		}
	}
	public static void findContinuesNumber(int sum){
		if(sum < 3){
			return ;
		}
		int begin = 1;
		int end = 2;
		int middle = (1 + sum)/2;
		int curSum = begin + end;
		while(begin < middle){
			
			if(curSum == sum){
				printContinuesNumber(begin,end);
				break;
			}
			else if(curSum > sum){
				curSum -= begin;
				begin ++;
			}else{
				end ++;
				curSum += end;
			}
		}
	}
	private static void printContinuesNumber(int begin, int end) {
		// TODO Auto-generated method stub
		for(int i = begin ; i <= end;i++){
			System.out .print(i+":");
			
		}
		System.out.println();
	}

}
