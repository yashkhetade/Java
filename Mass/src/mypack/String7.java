package mypack;

import java.util.*;

//largest string among two lexically

public class String7 {
	
	public static void largeststring(String array[]) {
		
		String large=array[0];
	for(int i=0;i<=array.length-1;i++) {
		
		if(large.compareTo(array[i])<0) {
			large=array[i];
			
		}
		
		
	}
	System.out.println(large);
		
		
	}
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
 
	
	
	String fruits[]= {"mango","apple","watermelon"};
	
	largeststring(fruits);
	
	
	
	
	sc.close();
}
}
