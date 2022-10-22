package doubly_LinkedList;

import doubly_LinkedList.InsertAtEnd.Node;

public class DeleteFirstItem {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int x){
			data = x;
			next = null;
			prev = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(5);
		head = addBegin(head,4);
		head = addBegin(head,3);
		head = addBegin(head,2);
		iterate(head);
		head = delHead(head);
		System.out.println();
		iterate(head);

	}
	
	static Node delHead(Node head) {
		Node current = head.next;
		current.prev = null;
		return current;
	}
	
	static Node addBegin(Node head, int key) {
		Node temp = new Node(key);
		
		temp.next = head;
		if(head != null) {
			head.prev = temp;
		}
		return temp;
	}
	

	static void iterate(Node head) {
		Node current = head;
		while(current != null){
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

}
