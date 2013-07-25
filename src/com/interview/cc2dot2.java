package com.interview;

public class cc2dot2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src={1,2,3,4,5,6,7,8,9,10};
		Node head = init(src);
		int n =11 ;
		Node k = FindNthLast(head,n);
		System.out.print(k.data);

	}
	public static Node FindNthLast(Node head,int n){
		Node p = head.next;
		Node q = head.next;
		while(true){
			if(n == 0){
				break;
			}
			if(q==null)
				return null;
			q = q.next;
			n--;
		}
		while(q!=null){
			q = q.next;
			p = p.next;
		}
		return p;
		
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
