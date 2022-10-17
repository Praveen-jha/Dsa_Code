package circularLinkedList;

public class CreateCircualrLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Node head = new Node(7);
//		head.next = new Node(8);
//		head.next.next = new Node(9);
//		head.next.next.next = new Node(10);
//		head.next.next.next.next = head;
		
		
		
//		creating circullar linkedList with single Node
		 	
		Node head = new Node(8);
		head.next = head;
		
		

	}
	
	
	

}
