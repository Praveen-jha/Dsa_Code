package circularLinkedList;

public class DeleteKthElement {
	
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		head.next.next.next.next = head;
		iterate(head);
		delK(head,1);
		System.out.println();
		iterate(head);
		
		

	}
	
	static Node delK(Node head, int k) {
		
		Node current = head;
		if(k == 1) {
			head.data = head.next.data;
			head.next = head.next.next;
			return head;
		}
		for(int i = 0; i<k-2; i++) {
			current = current.next;
		}
		current.next = current.next.next;
		return head;
	}
	
	static void iterate(Node head) {
		Node curr = head.next;
		System.out.print(head.data+" ");
		while(curr != head) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}

}
