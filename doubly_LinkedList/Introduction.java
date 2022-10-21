package doubly_LinkedList;

public class Introduction {
	
	static class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int x){
			data = x;
			prev = null;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(10);
//		head.prev = null;
//		head.next = new Node(20);
//		head.next.prev = head;
//		head.next.next = new Node(30);
//		head.next.next.prev = head.next;
//		head.next.next.next = null;
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		iterate(head);

	}
	
	static void iterate(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

}
