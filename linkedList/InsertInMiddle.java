package linkedList;

import linkedList.AddOnPosition.Node;

public class InsertInMiddle {

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
	head.next = new Node(8);
	System.out.println();
	head = insertInMid(head,2);
	

	}
	
	   public static Node insertInMid(Node head, int data){
	          
	         Node fast = head;
	         Node slow = head;
	         
	         while(fast.next != null && fast.next.next != null){
	             slow = slow.next;
	             fast = fast.next.next;
	         }
	         Node temp = new Node(data);
	         temp.next = slow.next;
	         slow.next = temp;
	         return head;
	    }

}
