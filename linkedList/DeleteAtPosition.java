package linkedList;

public class DeleteAtPosition {
	
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
		addLast(head,3);
		addLast(head,4);
		addLast(head,5);
		addLast(head,6);
		addLast(head,7);
		iterate(head);
		System.out.println();
		delElement(head,2);
		iterate(head);
		
		
		

	}
	
	static Node addLast(Node head , int data) {
		Node temp = new Node(data);
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = temp;
		return head;
	}
	
	static void iterate(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	
	static Node delElement(Node head , int pos) {
		if(pos == 1) return head.next;
//		Node current = head;
//		for(int i = 0; i<pos-2 && current.next != null; i++) {
//			current = current.next;
//		}
//		current.next = current.next.next;
//		return head;
		Node p = null;
		Node q = head;
		
		
		for(int i = 0; i<pos-1 && q !=null; i++) {
			p = q;
			q = q.next;
		}
		p.next = q.next;
		return head;
		
	}

}
