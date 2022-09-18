package hashing;

import java.util.*;

public class MyHash {
	

	public static void main(String[] args) {
		
		MyHash mh = new MyHash(7);
		mh.insert(20);
		mh.insert(30);
		mh.insert(40);
		System.out.println(mh.search(20));
		mh.remove(30);
		System.out.println(mh.search(30));
		
	}
	
	int bucket;
	
	ArrayList<LinkedList<Integer>> table;
	MyHash(int b){
		bucket = b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i = 0;i<b;i++) {
			table.add(new LinkedList<Integer>());
		}
		
	}
	  void insert(Integer key) {
		int i = key%bucket;
		table.get(i).add(key);
	}
	  void remove(Integer key) {
		  int i = key%bucket;
		  table.get(i).remove(key);
		  
	  }
	  boolean search(Integer key) {
		  int i = key%bucket;
		  return table.get(i).contains(key);
	  }
	

}
