package com.interview;

import java.util.Stack;

public class cc3dot6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> r =new Stack<Integer>();
		r.push(1);
		r.push(7);
		r.push(8);
		r.push(19);
		r.push(12);
		Stack<Integer> m = sortStack(r);
		while(!m.isEmpty()){
			System.out.println(m.pop());
		}
	}
	public static Stack<Integer> sortStack(Stack<Integer> s){
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()){
			Integer e = s.pop();
			while(!r.isEmpty() && r.peek() > e){
				s.push(r.pop());
			}
			r.push(e);
		}
		return r;
	}

}
