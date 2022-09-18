package recursion;

public class QuestionRecursion {
	
	static int i = 1; 
	static int d = 1;
	


	public static void main(String[] args) {
		
//		System.out.println(ques1(1));
		
//		int a = 2048,sum = 0;
//		ques2(a,sum);
//		System.out.println(sum);
		
//		System.out.println(ques3(5));
		
		count(3);
		
		

	}
	private static int ques1(int n) {
		 
		if(n >= 5) {
			return n;
		}
		n = n+i;
		i++;
		return ques1(n);
	}
		
	private static void ques2(int n, int sum) {
		
		int k = 0, j=0;
		if(n==0) return;
		k = n%10;
		j = n/10;
		sum = sum+k;
		ques2(j,sum);
		System.out.print(k+" ");
	}
	
	private static int ques3(int n ) {
		int x =1,k;
		if(n==1) return x;
		for(k = 1; k<n;++k) {
			x = x+ques3(k)*ques3(n-k);
		}
		return x;
	}
	
	private static void count(int n) {
		System.out.print(d+" ");
		System.out.print(n+" ");
		
		d++;
		if(n>1) {
			count(n-1);
		}
		System.out.print(d+" ");
	}
}
