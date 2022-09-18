package hashing;

import java.util.HashSet;

public class SubArray0Sum {

	public static void main(String[] args) {				
		int arr[]= {1,4,13,-3,-10,5};
		
		System.out.println(isSum(arr));
	}
	
 private static boolean isSum(int arr[] ){
		
		HashSet<Integer> s = new HashSet<Integer>();
		
		int prefixSum = 0;
		
		for(int i =0;i<arr.length;i++) {
			
			prefixSum+=arr[i];	
			
			if(s.contains(prefixSum))
				return true;
			if(prefixSum == 0)
				return true;
			s.add(prefixSum);
		}
		return false;
	}

	
//	private static boolean isSum(int arr[]) {
//		for(int i = 0; i<arr.length; i++) {
//			int currentSum = 0;
//			for(int j = i; j<arr.length;j++) {
//				currentSum+=arr[j];
//				if(currentSum == 0)
//					return true;
//			}
//		}
//		return false;
//
//	}
	
	
	
}
