package linkedList;

public class AddOnPosition {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(7);
		addPosition(head,2,5);
		addPosition(head,2,8);
		iterate(head);
		
		

	}
	
	private static Node addPosition(Node head , int pos , int x) {
		Node temp =new Node(x);
		if(pos == 1) {
			temp.next = head;
			return head;
		}
		Node current = head;
		for(int i = 1; i<pos-2 && current != null; i++) {
			current = current.next;
		}
		if(current == null) return head;
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
