package mypack;

import java.util.*;
public class primeno {
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,i;
	System.out.println("enter the number");
	n=sc.nextInt();
	
	sc.close();
	for( i=2;i<=n;i++) {
		 if(n%i==0) {
			 break;
			 
		 }
		
		
	}
	if(n==i) {
		System.out.println("prime");
		
	}
	else {
		System.out.println(" not prime");
		
	}
	
	
	
	
}
}
