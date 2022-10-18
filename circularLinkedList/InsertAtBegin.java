package circularLinkedList;

import circularLinkedList.Traversal.Node;

public class InsertAtBegin {
	
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
//		head.next = new Node(8);
//		head.next.next = head;
		head.next = head;
		iterate(head);
		System.out.println();
		head = addBegin(head,6);
		iterate(head);
		
		
		

	}
	
//	                ............Naive approach ......
	
//	static Node addBegin(Node head, int key) {
//		
//		Node temp = new Node(key);
//		if(head == null) return temp;
//		
//		if(head.next == head) {
//			temp.next = head;
//			head.next = temp;
//			return temp;
//		}
//		
//		
//		Node current = head.next;
//		while(current.next != head) {
//			current = current.next;
//		}
//		temp.next = head;
//		current.next = temp;
//		return temp;
//	
//		
//	}
	
	
	
//	...................Efficient Approach.....................
	
	static Node addBegin(Node head, int x) {
		Node temp = new Node(x);
		
		if(head == null) {
			temp.next = temp;
			return temp;
		}else {
			
		
		temp.next = head.next;
		head.next = temp;
		
		int t = head.data;
		head.data = temp.data;
		temp.data = t;
		return head;
	   }
	}
	
	static void iterate(Node head) {
		if(head == null) return;
		
		Node current = head.next;
		System.out.print(head.data+" ");
		while(current != head) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		
	}

}
