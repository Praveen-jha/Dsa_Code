package linkedList;

public class DeleteElementInSortedList {
	
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
//		addLast(head,4);
//		addLast(head,5);
//		addLast(head,9);
//		addLast(head,9);
//		addLast(head,9);
//		addLast(head,9);
//		addLast(head,9);
//		addLast(head,9);
//		addLast(head,9);
		addLast(head,11);
		addLast(head,11);
		iterate(head);
		System.out.println();
		remDuplicates(head);
		iterate(head);
		
		
		
		

	}
	
	static Node addLast(Node head, int x) {
		Node current = head;
		Node temp = new Node(x);
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
	
	
	
	
	static Node remDuplicates(Node head) {
		
//		Node current  = head;
//		int data = head.data;
//		Node temp = head;
//		while(current.next != null) {
//			if(data != current.next.data) {
//				data = current.next.data;
//				temp = current;
//			}
//			
//			else {
//				temp.next = current.next;
//			}
//			current = current.next;
//			
//			
//			
//		}
//		return temp;
		
		
		
		Node current = head;
		Node temp = head;
		int data = head.data;
		if(head.next == null) return head;
		
		while(current != null) {
			
			if(data == current.data) {
				temp.next = current.next;
			}
			else {
				temp = current;
				data = temp.data;
			}
			current = current.next;
		}
		return head;
//		
//		Node current = head;
//		Node temp = head;
//		while(current.next !=null) {
//			
//		}
		
		
	}

}
