package array;

public class ReverseOfArray {
	
	public static void reverse(int[] arr) {
		
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
			
		}
		for(int k = 0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[] = {1,2,3,4,5,6,7,8,9};
		
		reverse(arr);
		
		
		

		

	}

}
