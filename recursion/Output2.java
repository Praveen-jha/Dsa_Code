package recursion;

public class Output2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun(3);

	}
	private static void fun(int n) {
		
		if(n==0)
			return;
		fun(n-1);
		System.out.println(n);
		fun(n-1);
	}

}
