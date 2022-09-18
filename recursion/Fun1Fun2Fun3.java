package recursion;

public class Fun1Fun2Fun3 {

	public static void main(String[] args) {
		
		fun(3);

	}

	private static void fun(int n) {
		
		if(n==0)
			return;
		
		System.out.println(n);
		
		fun(n-1);
		
		System.out.println(n);
		
		
	}

}
