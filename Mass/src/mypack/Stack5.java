package mypack;

import java.util.*;


public class Stack5 {

	
	public static String reverse(String str ) {
		
	StringBuilder  sb=new StringBuilder(str);
	sb.reverse();
	
	return sb.toString();
		
		
	}
	


	public static void main(String[] args) {
		
		
		
  String str="yash";
		
  System.out.println(reverse(str));
		
	}
}
