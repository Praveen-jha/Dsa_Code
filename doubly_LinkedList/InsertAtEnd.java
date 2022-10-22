package doubly_LinkedList;

public class InsertAtEnd {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int x){
			data = x;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(3);
		addLast(head,4);
		addLast(head,5);
		addLast(head,6);
		addLast(head,7);
		iterate(head);

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
	
	
	
	
	static void iterate(Node head) {
		Node current = head;
		while(current != null){
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

}
