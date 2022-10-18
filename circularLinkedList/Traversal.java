package circularLinkedList;

public class Traversal {

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
		head.next = head;
//		head.next = new Node(8);
//		head.next.next = new Node(9);
//		head.next.next.next = new Node(10);
//		head.next.next.next.next = head;
		iterate(head);

	}
	
	static void iterate(Node head) {
		Node current = head.next;
		

		if(head == null) return ;
		
		System.out.print(head.data+" ");
		
		while(current != head) {
			System.out.print(current.data+" ");
			current = current.next;
			
		}
	}

}
