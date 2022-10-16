package linkedList;

public class Delete_without_head_pointer {
	
	static class Node{
		int data;
		Node next;
		
		Node(int x){
			data = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void deleteNode(Node del)
    {
         // Your code here
         
         del.data = del.next.data;
         del.next = del.next.next;
    }

}
