package mypack;
import java.util.*;


public class Bitmanip3 {
	
public static int ithbit(int n,int i) {
	int bitmask =1<<i;
	
	if((n & bitmask)==0) {
		return 0;
		
	}
	else {
		
		return 1 ;
	}
	
}

public static int setithbit(int n,int i) {
	int bitmask= 1<<i;
	return n|bitmask;
	
}



public static int clearithbit(int n,int i) {
	int bitmask= ~(1<<i);
	return n & bitmask;
	
}

public static int updatebit(int n,int i,int newbit) {
	
	if(newbit==0) {
		return clearithbit(n,i);
	}
	else {
		return setithbit(n,i);
	}
	
}

public static int clearlastithbit(int n,int i) {
	int bitmask= (~0)<<i;
	return n & bitmask;
	
}




	public static void main(String[] args) {
		
	System.out.println(clearithbit(10,2));
		
		
		
	
	
	
	
	
	//left shift me-> a*2 ke power me b
	//right shift me-> a/2 ke power me b
	
		
	
	}
	
	
	//ith bit chahiye ->
	/*  8 4 2 1
	 *  1 0 1 0
	 *  
	 *  (10,2)->>0
	 * 
	 * 
	 * 
	 */
	
	/*
	 * set ith bit ->
	 * 8 4 2 1
	 * 1 0 1 0
	 * (10,2)
	 * after ->
	 * 1110 ->14
	 * 
	 * 
	 */
	
	/*
	 * clear ith bit ->
	 * 8 4 2 1
	 * 1 0 1 0
	 * 
	 * (10,3)
	 * 
	 * after ->
	 * 1110 ->2
	 * 
	 * 
	 */
	
	/*
	 * update ith bit ->
	 * 8 4 2 1
	 * 1 0 1 0
	 * 
	 * (10,2)
	 * 
	 * after ->
	 * 1110 ->14
	 * 
	 * 
	 */
	
	/*
	 * clear  lastith bit ->
	 * 8 4 2 1
	 * 1 0 1 0
	 * 
	 * (10,2)
	 * 
	 * after ->
	 * 1110 ->14
	 * 
	 * 
	 */
	
	
	
	
	
	
	
}
