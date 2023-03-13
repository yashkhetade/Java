package mypack4;

import java .util.*;

public class Demo {

	
	public static int search(int array[],int n,int key) {
		
		for(int i=0;i<=n-1;i++) {
			
			if(array[i]==key) {
				
				return i;
			}
			
			
			
		}
		
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		
		int array[]= {1,2,3,4,5};
		
		
		
		int key;
		
		System.out.println("enter the number to be searcheed ");
		key=sc.nextInt();
		
		
		try {
			
			int c=search(array,5,key);
			
			System.out.println(c);
			
			
			
			
		}
		catch(Exception e ) {
			System.out.println("invalid entry");
			
		}
		
		finally {
			
			System.out.println("bhai mujhe maro");
			
		}
		
		
		sc.close();
		
		
		
	}
}
