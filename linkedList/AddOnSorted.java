package linkedList;

public class AddOnSorted {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(8);
		head.next = new Node(9);
		head.next.next = new Node(10);
		head.next.next.next = new Node(20);
		iterate(head);
		System.out.println();
		head = addOn(head,18);
		iterate(head);
		head = addOn(head,80);
		System.out.println();
		iterate(head);

	}
	
	static Node addOn(Node head,int x) {
		
		
		
		Node temp = new Node(x);
		
		if(head == null) return temp;
		if(x< head.data) {
			temp.next = head;
			return temp;
		}
		Node current = head;
		while(current.next != null && current.next.data < x  ) {			
			current = current.next;
	
		}
		temp.next = current.next;
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

}
