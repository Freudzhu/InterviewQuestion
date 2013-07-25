package com.interview;
import java.util.HashMap;
public class cc2dot1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = {1,1,2,3,4,4,5,6,6};
		Node head = init(src);
		removeduplicate1(head);
		print(head);
		removeduplicate(head);
		
	}
	public static void removeduplicate(Node head){
		if(head == null){
			return;
		}
		HashMap map = new HashMap();
		Node p = head.next;
		Node q = head;
		while(p!=null){
			if(map.containsKey(p.data)){
				q.next = p.next;
				p = p.next;
			}else{
				map.put(p.data, true);
				q = p;
				p = p.next;
			}
		}
	}
	public static void removeduplicate1(Node head){
		if(head == null){
			return;
		}
		Node c = head.next;
		while(c!=null){
			Node p = c.next;
			Node q = c;
			while(p!=null){
				if(p.data == q.data){
					q.next = p.next;
					p = p.next;
				}
				else{
					q = p;
					p = p.next;
				}
			}
			c = c.next;
		}
		
	}
	public static Node init(int[] src){
		Node head=new Node();
		Node p = head;
		for(int e :src){
			Node n = new Node();
			n.data = e;
			p.next = n;
			p = n;
		}
		return head;
	}
	public static void print(Node head){
		if(head != null){
			head = head.next;
			while(head != null){
				System.out.println(head.data);
				head = head.next;
			}
		}
	}
}
class Node{
	int data;
	Node next;
}