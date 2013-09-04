package com.interview;

import java.util.HashMap;
import java.util.Map;

public class ccdot6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode();
		root.data = 6;
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);
		TreeNode result = commomAncestorWithBinarySearchTree(new TreeNode(7),new TreeNode(9),root);
		System.out.println(result.data);
		
		TreeNode root1 = new TreeNode(6);
		root1.left = new TreeNode(4);
		root1.left.parent = root1;
		root1.left.left = new TreeNode(2);
		root1.left.left.parent = root1.left.left; 
		root1.left.right = new TreeNode(5);
		root1.left.right.parent = root1.left.left;
		root1.right = new TreeNode(8);
		root1.right.left = new TreeNode(7);
		root1.right.left.parent = root1.right;
		root1.right.right = new TreeNode(9);
		root1.right.right.parent = root1.right;
		TreeNode result1 = commomAncestorWithBinaryTreeHasParent(root.left.left,root.left.right);
		System.out.println(result.data);

	}
	public static TreeNode commomAncestorWithBinarySearchTree(TreeNode p,TreeNode q,TreeNode root){
		if(root==null){
			return null;
		}
		if(root.data > p.data && root.data < q.data){
			return root;
		}
		TreeNode left = commomAncestorWithBinarySearchTree(p,q,root.left);
		if(left!=null){
			return left;
		}
		TreeNode right = commomAncestorWithBinarySearchTree(p,q,root.right);
		if(right != null){
			return right;
		}
		return null;
	}
	public static TreeNode commomAncestorWithBinaryTreeHasParent(TreeNode p,TreeNode q){
		Map<TreeNode,Boolean> ancestorPath = new HashMap<TreeNode,Boolean>();
		while(p.parent != null){
			ancestorPath.put(p, true);
			p = p.parent;
		}
		while(q.parent != null){
			if(ancestorPath.get(q)){
				return q;
			}
			q = q.parent;
		}
		return null;
	}

}
