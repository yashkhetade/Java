package mypack;

import java.util.*;

public class fibonacci2 {

	public static int fib(int n) {
		if(n<=1) {
			return n;
			
		}
		return n*fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		sc.close();
		
		System.out.println("fibonacci series : "+fib(n));
	
		
	}
	
}