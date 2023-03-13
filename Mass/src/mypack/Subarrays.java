package mypack;

import java.util.*;

public class Subarrays {

	public static void subarr(int array[],int n) {
		
	System.out.println("subarray is : ");
	
	 int sum=0;
	 int max=Integer.MIN_VALUE;
	for(int i=0;i<n;i++) {
		int start=i;

	for(int j=0;j<n;j++) {
		int end=j;
		
	
	for(int k =start;k<=end;k++) {
		
	 sum=sum+array[k];
	}
	System.out.println(sum);
	
	if(max<sum) {
		max=sum;
		
	}
	
	}
	}
	System.out.println("max sum is "+max);
	
	}
	
	
	public static void subarray2(int array[],int n) {
		
	System.out.println("subarray is : ");
	
	int counter=0;
	for(int i=0;i<n;i++) {
		int start=i;

	for(int j=i;j<n;j++) {
		int end=j;
		
	
	for(int k =start;k<=end;k++) {
		
	System.out.print(array[k]+" ");
	
	}
	counter++;
	
	
	
	
	System.out.println();
	}
	System.out.println();
	
	}
	System.out.println("number of subarrays are "+counter);
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		int array[]=new int [n];
		System.out.println("enter the elements in array ");
		
		for(int i=0;i<=n-1;i++) {
			array[i]=sc.nextInt();
			
		}
		
		System.out.println(" the elements in array are : ");
		
		for(int i=0;i<=n-1;i++) {
			System.out.println(array[i]);
			
		}
		
		subarr(array,n);
		
		sc.close();

		
		
		
		
		
	}
}
