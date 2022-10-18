package circularLinkedList;

import circularLinkedList.InsertAtBegin.Node;

public class DeleteHead {
	
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(7);
//		head.next = head;
		head.next = new Node(8);
//		head.next.next = head;
		head.next.next = new Node(9);
		head.next.next.next = head;
		iterate(head);
		head = DelHead(head);
		System.out.println();
		iterate(head);
		
		
		

	}
	static void iterate(Node head) {
		if(head == null) {
			System.out.println("null");
		}else {
			
		
		System.out.print(head.data+" ");
		Node current = head.next;
		while(current != head) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		}
	}
	
	static Node DelHead(Node head) {

		if(head == null) return null;
		if(head.next == head)return null;
		
//		Node current = head;
//		
//		while(current.next != head) {
//			current = current.next;
//		}
//		current.next = head.next;
//		return( current.next);
		
//	.....................	Efficient Approach .............
		
		head.data = head.next.data;
		head.next  = head.next.next;
		return head;
		
	}

}
