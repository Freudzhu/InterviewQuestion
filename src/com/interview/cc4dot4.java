package com.interview;

import java.util.ArrayList;
import java.util.LinkedList;

public class cc4dot4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<LinkedList<TreeNode>> findLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		int level = 0;
		list.add(root);
		result.add(level, list);
		while(true){
			list = new LinkedList<TreeNode>();
			for(int i =0;i<result.get(level).size();i++){
				TreeNode node  = result.get(level).get(i);
				
				if(node != null){
					if(node.left!=null){
						list.add(node.left);
					}
					if(node.right!=null){
						list.add(node.right);
					}
				}
			}
			if(list.size() == 0){
				break;
			}
			level++;
			result.add(level,list);
		}
		return result;
	}

}
