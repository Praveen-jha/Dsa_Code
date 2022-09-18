package hashing;

public class CountPairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 5, 7, 1};
		int n = arr.length;
		int k = 8;
		System.out.println(sum(arr,n,k));

	}
	
	private static int sum(int arr[], int n, int k) {
		
		int count = 0;
		
		
		for(int i =0; i<n; i++) {
			
			
			for(int j = i+1; j<n; j++) {
				
				if(arr[i]+arr[j] ==k) {
					
					count++;
				}
			}
		}
		return count;
	}

}
