package mypack;

import java.util.*;


public class Bitmanip2 {
	
	public static int ithbit (int n,int i) {
		
		int bitmask=1<<i;
		
		if((n & bitmask)==0) {
			
			return 0;
		}
		else {
			return 1;
			
		}
		
	}
	

	
	
	public static int setithbit (int n,int i) {
		
		int bitmask=1<<i;
	    return n|bitmask;
		
	}
	
	public static int clearithbit (int n,int i) {
		
		int bitmask= ~(1<<i);
	    return n&bitmask;
		
	}
	
	public static int updateithbit (int n,int i,int newbit) {
		
		if(newbit==0) {
			return clearithbit(n,i);
			
		}
		else {
			return setithbit(n,i);
			
		}
		
	}
	
   public static int clearlast(int n,int i) {
	   
	   int bitmask= ~(0)<<1;
	   return n&bitmask; 
	   
   }
   
   
	
	

	
	
	public static void main(String[] args) {
		
//		Scanner sc= new Scanner (System.in);
		int n;
//		System.out.println("enter the no");
//		n=sc.nextInt();
		
	System.out.println( updateithbit(10,2,1));
	 
	 
		
		
		////8  4  2  1
		////1  0  1  0
		
		//ans should be 0
		//lets check
		
		
		
		
	}
}
