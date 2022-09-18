package linkedList;

public class MiddleOfLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(8);
		head.next = new Node(7);
		head.next.next = new Node(6);
		middleNode(head);
		
		

	}
	
	static void middleNode(Node head) {
		if(head == null) return ;
		int count = 0;
		Node current;
		
		for(current = head; current != null; current = current.next) {
			count++;
		}
		current = head;
		for(int i = 0; i< count/2;i++) {
			current = current.next;
		}
		System.out.println("middle node is = "+current.data);
		
	}

}
