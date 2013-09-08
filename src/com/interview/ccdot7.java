package com.interview;

public class ccdot7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode parent = new TreeNode(5);
		parent.left = new TreeNode(6);
		parent.right = new TreeNode(7);
		parent.left.left = new TreeNode(8);
		parent.left.right = new TreeNode(9);
		TreeNode children = new TreeNode(6);
		children.left = new TreeNode(8);
		children.right = new TreeNode(9);
		System.out.println(transTree(parent,children));
		
		System.out.println(transTree(null,children));
		
		System.out.println(transTree(parent,new TreeNode(9)));
		
		
		TreeNode parent1 = new TreeNode(5);
		parent1.left = new TreeNode(6);
		parent1.right = new TreeNode(7);
		parent1.left.left = new TreeNode(8);
		parent1.left.right = new TreeNode(9);
		System.out.println(transTree(parent,parent1));
		
		parent1.left = new TreeNode(6);
		parent1.left.left = new TreeNode(7);
		parent1.left.left.left = new TreeNode(8);
		parent1.left.left.left.left = new TreeNode(9);
		
		
		children = new TreeNode(8);
		children.left = new TreeNode(9);
		
		System.out.println(transTree(parent1,children));
		
		

	}
	public static boolean transTree(TreeNode parent,TreeNode children){
		if(parent == null && children == null){
			return true;
		}
		else if(parent == null){
			return false;
		}
		else if(children == null){
			return false;
		}
		else{
			if(parent.data == children.data){
				return isChildrenTree(parent,children);
			}else{
				return transTree(parent.left,children) || transTree(parent.right,children);
			}
		}
	}
	private static boolean isChildrenTree(TreeNode parent, TreeNode children) {
		// TODO Auto-generated method stub
		if(parent == null && children == null){
			return true;
		}
		else if(parent == null){
			return false;
		}
		else if(children == null){
			return false;
		}else{
			if(parent.data == children.data){
				return isChildrenTree(parent.left,children.left) && isChildrenTree(parent.right,children.right);
			}else{
				return false;
			}
			
		}
	}

}
