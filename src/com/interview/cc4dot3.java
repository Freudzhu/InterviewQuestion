package com.interview;
public class cc4dot3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8};
		TreeNode head = creatMinimalBST(array,0,array.length-1);
		System.out.print(height(head));

	}
	public static TreeNode creatMinimalBST(int[] array,int start,int end){
		if(start > end){
			return null;
		}
		int mid = start + ((end - start) >> 1) ;
		int mid2 = (start+end)/2;
		TreeNode node = new TreeNode();
		node.data = array[mid] ;
		node.left = creatMinimalBST(array,start,mid -1);
		node.right = creatMinimalBST(array,mid+1,end);
		return node;
	}
	public static int height(TreeNode head){
		if(head == null){
			return 0;
		}
		return Math.max(height(head.left), height(head.right)) + 1;
	}

}
