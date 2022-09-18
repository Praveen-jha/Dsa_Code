package recursion;

public class Print_1_to_N {
	
	private static void fun(int n) {
		if(n==0)
			return;
		System.out.print(n+" ");

		fun(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);

	}

}
