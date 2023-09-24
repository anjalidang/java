package gitHub;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner scannerInput=new Scanner(System.in);
		long a;
		long fact=1;
		System.out.println("Enter a number");
		long b=scannerInput.nextLong();
		for(a=1; a<=b; a++) {
			fact=a*fact;
		}
		System.out.println(fact);

	}

}
////class Factorial{  
//	 public static void main(String args[]){  
//	  int i,fact=1;  
//	  int number=7; 
//	  for(i=1;i<=number;i++){    
//	      fact=fact*i;    
//	  }    
//	  System.out.println("Factorial of "+number+" is: "+fact);    
//	 }  
//	} 