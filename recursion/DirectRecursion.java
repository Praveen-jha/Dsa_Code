package recursion;

public class DirectRecursion {

	public static void main(String[] args) {
		
		fun1(2);

	}
	static void fun1(int n) {
		if(n==0)
			 return;
		System.out.println("gfg");
		fun1(n-1);
	}

}
