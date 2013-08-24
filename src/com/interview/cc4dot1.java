package com.interview;
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
}

public class cc4dot1 {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode();
		
		
		TreeNode left = new TreeNode();
		root.left = left;
		TreeNode right = new TreeNode();
		root.right = right;
		TreeNode leftLeft = new TreeNode();
		root.left.left = leftLeft;
		TreeNode leftleftleft = new TreeNode();
		root.left.left.left = leftleftleft;
		System.out.println(judgeTreeBalancedMoreThanTwo(root));
		

	}
	public static boolean judgeTreeBalancedMoreThanTwo(TreeNode root){
		if(root == null){
			return true;
		}
		return maxDepth(root) - minDepth(root) > 1 ? false :true;
	}
	public static int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		
	}
	public static int minDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		return 1 + Math.min(maxDepth(root.left), maxDepth(root.right));
		
	}
	

}
