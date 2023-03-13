package mypack;

import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.println("enter the value of n");
		n=sc.nextInt();
		sc.close();
		
		int first=0, second=1,next;
		
		for(int i=0;i<n;i++) {
			
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
			
			
		}
		
	}
	
}
