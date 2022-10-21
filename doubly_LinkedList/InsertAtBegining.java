package doubly_LinkedList;

public class InsertAtBegining {
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int x){
			data = x;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(2);
		iterate(head);
		System.out.println();
		head = addBegin(head,3);
		head = addBegin(head,4);
		head = addBegin(head,5);
		iterate(head);

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
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	

}
