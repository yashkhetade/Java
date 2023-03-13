package mypack;

import java.util.*;


public class Strings5Path {
	
	public static float getshort(String str) {
		
		int x=0,y=0;
		for(int i=0;i<str.length();i++) {
			
			
			char c=str.charAt(i);
			
			if(c=='E') {
				x++;
				
			}
			else if(c=='W') {
				x--;
			}
			
			else if (c=='N') {
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
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the direction string ");
		str=sc.nextLine();
		
		System.out.println("the shortest path is : ");
		
		System.out.println(getshort(str));
		/////////////////WNEENESENNN
		
	}
}
