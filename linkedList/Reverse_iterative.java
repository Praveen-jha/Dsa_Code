package linkedList;

import java.util.ArrayList;

public class Reverse_iterative {
	
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		Node head = null;
	head=add(head,8);
	head = add(head,9);
	head = add(head,7);
	print(head);
	reverseList(head);
	System.out.println();
	print(head);
	

	}
	
	
	// Naive solution using auxulry array 
	
	static Node reverseList(Node head) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(Node curr = head; curr != null; curr = curr.next) {
			arr.add(curr.data);
		}
		
		for(Node curr =  head; curr != null; curr = curr.next) {
			curr.data = arr.remove(arr.size()-1);
		}
		return head;
		
	}
	
	
// add Node in a LinkedList at the last .....
	
	static Node add(Node head ,int x) {
		Node current = head;
		Node temp = new Node(x);
		if(head == null) return temp;
		while(current.next != null) {
			current = current.next;
		}
		current.next = temp;
		return head;
	}
	
	
	// print the linkedList..
	
	static void print(Node head) {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}

}
