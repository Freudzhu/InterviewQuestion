package com.interview;

import java.util.LinkedList;
import java.util.Queue;

public class cc4dot2 {
	public static boolean[][] map = new boolean[6][6];
	public static boolean[] visited = new boolean[6];
	public static Queue q = new LinkedList();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map[0][1] = true;
		map[1][2] = true;
		map[2][5] = true;
		map[3][4] = true;
		System.out.println(route(0,4));

	}
	public static boolean route(int src,int dst){
		q.add(src);
		visited[src] = true;
		while(!q.isEmpty()){
			int t =(int) q.poll();
			if(t == dst){
				return true;
			}
			for(int i=0;i<map.length;i++){
				if(map[t][i]&&!visited[i]){
					q.add(i);
					visited[t] = true;
				}
			}
		}
		return false;
	}

}
