package array;

public class RotationOfArray {
	
	public static void reverse(int[] arr,int si,int ei) {
		int i = si;
		int j =ei;
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}


	}

	public static void main(String[] args) {
		
		
		
		int arr[] = {1,2,3,4,5,6,7};
		int d = 2;
		int n = arr.length;
		
	
		if(d==0 || d==n)return;
		
		 reverse(arr,0,d-1);
		 reverse(arr,d,n-1);
		 reverse(arr,0,n-1);
		 
		 for(int k = 0;k<arr.length;k++) {
				System.out.print(arr[k]+" ");
			}
		 

	}

}
