package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationOfChaining {
	
	int BUCKET;
	ArrayList<LinkedList<Integer>> table;
	
//	constructor of the class
	
	ImplementationOfChaining(int b){
		BUCKET = b;
		table = new ArrayList<LinkedList<Integer>>();
		
		for(int i = 0; i<b; i++) {
			table.add(new LinkedList<Integer>());
		}
		
	}

	public static void main(String[] args) {
		
	    int bucket = 7;
		
		ImplementationOfChaining c = new ImplementationOfChaining(bucket);
		c.insert(10);
		c.insert(20);
		c.insert(15);
		c.insert(7);
		System.out.println(c.search(10));
		c.delete(15);
		System.out.println(c.search(15));
	}
	
	void insert(Integer k)
	{
		int i = k%BUCKET;
		table.get(i).add(k);
	}
	
	boolean search(Integer k)
	{
		int i = k%BUCKET;
		return table.get(i).contains(k);
	}
	void delete(Integer k)
	{
		int i = k%BUCKET;
		table.get(i).remove(k);
	}

}
