package mypack;
import java.util.*;

public class factorial1 {
	
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
			
		}
		
		return n*factorial(n-1);
		
	}
	
 public static void main(String[] args) {
	 int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	
	System.out.println("the factorial of " +n+ " is "+factorial(n));
	
	sc.close();
	
	
}
 
 
}
