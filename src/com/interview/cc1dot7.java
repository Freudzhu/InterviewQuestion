package com.interview;
public class cc1dot7 {
	public static void setZero(int[][] array){
		boolean[] col = new boolean[array[0].length];
		boolean[] row = new boolean[array.length];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				if(array[i][j] == 0){
					col[j] = true;
					row[i] = true;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[0].length;j++){
				if(col[j] || row[i]){
					 array[i][j] = 0;
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array ={{1,2,0,3},{1,2,3,0},{1,1,1,1},{1,1,2,0}};
		setZero(array);
	}

}
