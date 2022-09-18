package recursion;

public class Print_N_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(10);

	}
	private static void fun(int n) {
		 
		if(n==0)
			return;
		System.out.print(n+" ");
		fun(n-1);
	}

}
