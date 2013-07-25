package com.interview;

public class cc2dot3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src={1,2,3,4,5,6,7,8,9,10};
		Node head = init(src);
		Node p = head.next.next.next;
		removeNode(p);
		print(head);
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
	public static void removeNode(Node t){
		if(t==null){
			return; 
		}
		t.data = t.next.data;
		t.next = t.next.next;
		
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

}
