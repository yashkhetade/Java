package mypack;

import java.util.*;




public class String10 {
	
	
	
	public static boolean checkpalindrome(String str) {
		
		
		
		for(int i=0;i<=str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				return false;
				
			}
			
			
		}
		
		return true;
		
	}
	
	public static String Titlecase(String str) {
		
		StringBuilder sb=new StringBuilder(" ");
		char c=Character.toUpperCase(str.charAt(0));
		sb.append(c);
		
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)==' ') {
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
				
				
			}
			else {
				
				sb.append(str.charAt(i));
				
			}
			
			
			
			
		}
		return sb.toString();
			
			
		
	}
	
	
	
	
public static float shortpath(String str) {
	
	
	
	int x=0,y=0;
	
	for(int i=0;i<=str.length()-1;i++) {
		
		char c=str.charAt(i);
		if(c=='E') {
			x++;
			
		}
		else if(c=='W') {
			x--;
			
		}
		else if(c=='N') {
			y++;
			
		}
		else {
			y--;
			
		}
		
	}
	int x2=x*x;
	int y2=y*y;
	return (float)Math.sqrt(x2+y2);
	
	
	
}

	public static void main(String[] args) {
		
	String str ="noon bro how are you";
	
	System.out.println(Titlecase(str));
	
		
	}
}
