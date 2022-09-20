package linkedList;

public class MiddleOfLinkedlist1 {
	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(6);
		head.next = new Node(8);
		head.next.next = new Node(9);
		head.next.next.next = new Node(10);
		head.next.next.next.next= new Node(11);
		printMiddle(head);
		

	}
	   static void printMiddle(Node head){
	        if(head==null)return;
	        Node slow=head,fast=head;
	        while(fast!=null&&fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        System.out.print(slow.data);
	    }

}
