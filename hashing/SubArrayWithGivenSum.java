package hashing;

import java.util.*;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int arr[]= {5,8,6,13,3,-1};
		int sum = 22;
		int n = arr.length;
		System.out.println(isSum(arr,sum,n));  
	}	
	private static ArrayList<Integer>  isSum(int arr[],int sum,int n) {	
//		HashSet<Integer> s = new HashSet<Integer>();
//		
//		int prefixSum[]= new int [n];	
//        prefixSum[0] = arr[0];	
//        
//		for(int i =1;i<n;i++) {
//			prefixSum[i] = prefixSum[i - 1] + arr[i];
//		}	
//		
//		for(int i = 0; i<n; i++) {			
//			if(prefixSum[i] == sum)
//				return true;								
//			if(s.contains(prefixSum[i] - sum))
//				return true;
//			s.add(prefixSum[i]);			
//		}
//		return false;
		
		
		int currentSum = 0;
		int start = 0;
		int end = -1;
		
		HashMap<Integer,Integer> s = new HashMap<>();
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			currentSum+=arr[i];
			if(currentSum == sum) {
				start = 0;
				end = i;
				break;
			}
			if(s.containsKey(currentSum-sum)) {
				start = s.get(currentSum-sum)+1;
				end = i;
				break;
			}
			s.put(currentSum, i);

		}
		if(end == -1) {
			a.add(-1);
		}else {
			a.add(start);
			a.add(end);
		}
		return a;
		
	}
}


