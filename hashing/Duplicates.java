package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		
		
		int arr[]= {13 ,9, 25, 1 ,1 ,0 ,22, 13 ,22 ,20 ,3 ,8 ,11, 25 ,10 ,3 ,15, 11, 19 ,20 ,2 ,4 ,25, 14, 23, 14
};
		
		System.out.println(duplicates(arr));
		  // duplicates(arr);

	}
	
	private static ArrayList<Integer> duplicates(int arr[]) {
//		
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		
//		HashSet<Integer> s = new HashSet<Integer>();
//		
//		
//		for(int i = 0; i<arr.length;i++) {
//			
//			   if(s.contains(arr[i])) {					       
//			      a.add(arr[i]);				
//			   }
//		
//		s.add(arr[i]);
//					
//		}
//		if(a.isEmpty()) {
//			a.add(-1);
//		}
//					
//		return a;
		  ArrayList<Integer> x = new ArrayList<>();
	       Arrays.sort(arr);
	       for(int i=0;i<arr.length-1;i++)
	       {
	           if(arr[i+1]==arr[i])
	           {
	               x.add(arr[i]);
	           }
	       }
	       if(x.size()==0)
	       {
	           x.add(-1);
	       }
	       
	       Set<Integer> z = new LinkedHashSet<>(x);
	       ArrayList<Integer> y = new ArrayList<>(z);
	       return y;
	   }
	

 
		
	}	

