package mypack;

import java.util.*;



//
//int first=0,second=1,next;
//
//int n;
//Scanner sc=new Scanner(System.in);
//System.out.println("enter the no");
//n=sc.nextInt();
//
//
//for(int i=0;i<=n;i++) {
//	
//	System.out.println(first);
//	next=first+second;
//	first=second;
//	second=next;
//	
//}



public class Strings4Pallindrome {
	
	public static boolean checkpalindrome(String str) {
		            
		  int n=str.length();
                  for(int i=0;i<n/2;i++)  {
                	
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				  System.out.println(" not pallindrome");
				return false;
			
			}
			
		}           
                  System.out.println("pallindrome");
                  return true;
	}
	
	
	
	
	


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter the string");
        str=sc.nextLine();
        
        checkpalindrome(str);
		sc.close();
	
		
	}
	
}
