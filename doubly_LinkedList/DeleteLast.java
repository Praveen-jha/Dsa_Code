package doubly_LinkedList;

import doubly_LinkedList.Introduction.Node;

public class DeleteLast {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		iterate(head);
		head = delLast(head);
		System.out.println();
		iterate(head);
		
		

	}
	static Node delLast(Node head) {
		Node current = head;
//		while(current.next != null) {
//			current = current.next;
//		}
//		current.prev.next = null;
		if(head == null || head.next == null) return null;
		
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		return head;
	}
	
	static void iterate(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

}
