package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		
		TOH(2,'1','2','3');

	}
	private static void TOH(int n, char A, char B, char C ) {
		if(n>0) {
			TOH(n-1,A,C,B);
			System.out.println(A+" , "+C);
			TOH(n-1,B,A,C);
		}
	}

}
