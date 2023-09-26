package gitHub;

public class fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34
		int num; int n1=0; int n2=1; int n3;
		System.out.println(n1+" ");
		System.out.println(n2+" ");
		for (num = 0; num <= 10; num++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3+" ");
		}
		
	}

}
