package com.interview;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class cc4dot8 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void sumPathByRoot(TreeNode root,int sum){
		LinkedList<Integer> col =new LinkedList<Integer>();
		findSum(root,sum,0,col);
	}
	public void findSum(TreeNode root,int sum,int curSum,LinkedList<Integer> col){
		if(root == null){
			return ;
		}
		curSum += root.data;
		col.add(root.data);
		if(root.left==null&&root.right==null&&curSum == sum){
			print(col);
		}
		if(root.left!=null)
			findSum(root.left,sum,curSum,col);
		if(root.right!=null)
			findSum(root.right,curSum,sum,col);
		curSum -= root.data;
		col.removeLast();
	}
	public void findSumWithoutRoot(TreeNode root,int sum,ArrayList<Integer> buffer,int level){
		if(root == null)
			return ;
		buffer.add(level, root.data);
		int tmp = 0;
		for(int i = level;i>0;i--){
			tmp += buffer.get(level);
			if(tmp == sum){
				print(buffer);
			}
		}
		ArrayList<Integer> left = (ArrayList<Integer>) buffer.clone();
		ArrayList<Integer> right = (ArrayList<Integer>) buffer.clone();
		findSumWithoutRoot(root.left,sum,left,level++);
		findSumWithoutRoot(root.right,sum,right,level++);
	}
	private void print(List<Integer> col) {
		// TODO Auto-generated method stub
		for(int i=0;i<col.size();i++){
			System.out.print(col.get(i) + ":");
		}
		System.out.println();
	}
}
