package doubly_LinkedList;

import doubly_LinkedList.InsertAtEnd.Node;

public class ReverseDDL {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int x){
			data =x;
			
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(3);
		head = addLast(head,4);
		head = addLast(head,5);
		head = addLast(head,6);
		head = addLast(head,7);
		iterate(head);
		System.out.println();
		reverse(head);
		iterate(head);
		

	}
	
	static Node reverse(Node head) {
		Node current = head;
		
		Node prev = null;
		
		while(current != null) {
			prev = current.prev;
			current.prev = current.next;
			current.next = prev;
			current = current.prev;
			
		}
		
		
		return prev.prev;
	}
	
	static void iterate(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	static Node addLast(Node head, int data) {
		Node temp = new Node(data);
		Node current = head;
		if(head == null) {
			return temp;
		}
		while(current.next != null) {
			current = current.next;
		}
		current.next = temp;
		temp.prev = current;
		return head;
	}

}
