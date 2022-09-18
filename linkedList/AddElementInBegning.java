package linkedList;

public class AddElementInBegning {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		
			Node head = null;
			head = addBegining(head,7);
			head = addBegining(head,6);
			head = addBegining(head,5);
			head = addBegining(head,4);
			head = addBegining(head,3);
			iterate(head);
			

	}
	static Node addBegining(Node head, int x) {
		Node temp = new Node(x);
		if(head == null) return temp;
		
		temp.next = head;
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
