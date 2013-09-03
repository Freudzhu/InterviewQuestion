package com.interview;

public class cc4dot5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static TreeNode getInOrderNextNode(TreeNode e){
		if(e==null){
			return null;
		}
		if(e.right != null){
			return mostLeftChild(e.right);
		}else{
			TreeNode parent = e.parent;
			TreeNode children = e;
			while(parent != null){
				if(parent.left == children)
					break;
				children = parent;
				parent = parent.parent;
			}
			return parent;
		}
	}
	private static TreeNode mostLeftChild(TreeNode right) {
		// TODO Auto-generated method stub
		if(right == null){
			return null;
		}
		TreeNode n = right.left;
		while(n  != null ){
			n = n.left;
		}
		return n;
	}

}
