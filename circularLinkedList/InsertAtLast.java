package circularLinkedList;

public class InsertAtLast {
	
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = new Node(5);
		head.next = head;
//		Node head = null;
		head = InsertLast(head,6);
		head = InsertLast(head,7);
		head=InsertLast(head,8);
		iterate(head);
		

	}
	
	
	//................Naive Approach................
	
	
//	static Node InsertLast(Node head, int key) {
//		Node temp = new Node(key);
//		
//		if(head == null) {
//			temp.next = temp;
//			return temp;
//		}
//		Node current = head;
//		while(current.next != head) {
//			current = current.next;
//		}
//		temp.next = head;
//		current.next = temp;
//		return head;
//	}
	
	
//	.....................Efficient Approach.............................
	
	
	static Node InsertLast(Node head,int key) {
		Node temp = new Node(key);
		if(head == null) {
			temp.next = temp;
			return temp;
		}else {
			
		
		temp.next = head.next;
		head.next = temp;
		
		int t = head.data;
		head.data = temp.data;
		temp.data= t;
		return temp;
	    }
	}
	
	static void iterate(Node head) {
		System.out.print(head.data+" ");
		Node current = head.next;
		while(current != head) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

}
