package linkedList;

public class NnodeFromEnd {
	
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
		
		Node head = new Node (8);
		head.next = new Node(9);
		head.next.next = new Node(10);
		head.next.next.next = new Node(11);
	System.out.println(nFromEnd(head,2));

	}
	private static int nFromEnd(Node head , int n) {
		

//		Node current = head;
//		int count = 0;
//		
//		while(current != null) {
//			count++;
//			current = current.next;
//		}
//		if(count < n) return 0;
//		Node current1 = head;
//		int pos = count-n;
//		for(int i = 0 ; i<pos && current1 != null; i++) {
//			current1 = current1.next;
//		}
//		return current1.data;
		
		
		
//		-----------------------using single loop--------------------
		
		Node slow = head;
		Node fast= head;
		for(int i = 0; i<n ;i++) {
			if(fast == null) return -1;
			fast = fast.next;
		}
		
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;

	}

}
