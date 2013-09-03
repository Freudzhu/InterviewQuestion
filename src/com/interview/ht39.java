package com.interview;

import java.util.ArrayList;

public class ht39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root =new TreeNode();
		root.left = new TreeNode();
		root.left.left = new TreeNode();
		ArrayList<Integer> depth = new ArrayList<Integer>();
		depth.add(0);
		System.out.println(isBalance(root,depth));
		TreeNode root1 =new TreeNode();
		root1.left = new TreeNode();
		root1.left.left = new TreeNode();
		root1.left.right = new TreeNode();
		ArrayList<Integer> depth1 = new ArrayList<Integer>();
		root1.right = new TreeNode();
		root1.left.left = new TreeNode();
		root1.left.right = new TreeNode();
		depth1.add(0);
		System.out.println(isBalance(root1,depth1));

	}
	public static boolean isBalance(TreeNode root,ArrayList<Integer> depth){
		if(root == null){
			return true;
		}
		ArrayList<Integer> left = new ArrayList<Integer>();
		left.add(0);
		ArrayList<Integer> right = new ArrayList<Integer>();
		right.add(0);
		if(isBalance(root.left,left)&&isBalance(root.right,right)){
			int dist = left.get(0) - right.get(0);
			if(dist > 1 || dist < -1)
				return false;
		}
		depth.add(0,Math.max(left.get(0), right.get(0)) + 1);
		return true;
	}

}
