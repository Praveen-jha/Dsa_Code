package recursion;

public class TailHead {
	private static int x = 0;
	static int p=1,f=1;
	static int[] arr = new int [10];


	public static void main(String[] args) {
		
//		int n = 4;
//		for(int i = 0; i<n;i++) {
//			System.out.print(fibonacci(i)+" "); 
//		}
		
//		 System.out.println(power(3,2));
//		fun5(456);
//		System.out.println(taylorSeries(x,5));
//		for(int i = 0; i<10;i++) {
//			arr[i]=-1;
//		}
		System.out.println(ncr(5,2));
		
		

	}
	
	private static void fun(int n) {
		if(n > 0) {
			fun(n-1);
			System.out.print(" "+n);
		}
	}
	
	
	private static int fun2(int n) {
		if(n > 0 ) {
			return fun2(n-1)+n;
		}
		return 0;
	}
	
	
	private static int fun3(int n) {
		if(n > 0) {
			x++;
			return fun3(n-1)+x;
		}
		return 0;
	}
	
	// find the fibonacci Series
	
	private static int fibonacci(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	// memorization in fibonacci series
	

	private static int fib(int n) {
		if(n<=1) {
			arr[n]=n;
			return n;
		}else {
			if(arr[n-2]==-1) {
				arr[n-2]=fib(n-2);
			}
			if(arr[n-1]==-1) {
				arr[n-1]=fib(n-1);
			}
			arr[n]=arr[n-2]+arr[n-1];
		}
			return arr[n-2]+arr[n-1];
		
	}
	
	private static void fun4(int n) {
		
		if(n > 0) {
			
			System.out.print(n+" ");
			fun4(n-1);
			fun4(n-1);
		}
	}
	
	// factorial of n numbers
	
	private static int factorial(int n) {
		
		if(n ==0) return 1;
		return factorial(n-1)*n;
		
	}
	
	// find power of any number
	
	private static int power(int m, int n) {
//		if(n == 0) return 1;
//		return power(m,n-1)*m;
		
		if(n==0) return 1;
		if(n%2==0) {
			return power(m*m,n/2);
		}
			return m * power(m*m,(n-1)/2);
		
	}
	
	// reverse a number using recursion 
	
	private static void fun5(int n) {
		if(n==0) return;
		fun5(n%10);
		System.out.print(n+" ");
		fun5(n/10);
	}
	
//	find the taylorSeries
	
	private static int taylorSeries(int x , int n) {
			
		int r;
		
		if(n==0) {
			return 1;
		}
		else {
			r= taylorSeries(x,n-1);
			p = p*x;
			f=f*n;
			return r+p/f;
		}
		
	}
	
	// find the ncr 
	
	private static int ncr(int n, int r) {
		if(r==0 || n==r) {
			return 1;
		}else {
			return ncr(n-1,r-1)+ ncr(n-1,r);
		}
	}

}
