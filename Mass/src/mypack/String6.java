package mypack;
import java.util.*;

// 2 strings value ke hisab se compare karna hai to .equals use karo
// strings object level pe same nahi hoti
//str or new ke time



/*
 * 
 * 
 * 
 * 
 * 	System.out.println("substring is : ");
		int c=0;
		for(int i=0;i<=n-1;i++) {
			int start=i;
			
			for(int j=i;j<=n-1;j++) {
				
				int end=j;
				
				for(int k=start;k<=end;k++) {
					System.out.println(array[k]+" ");
					
				}
				c++;
				System.out.println();
			}
			System.out.println();
			
			
		}
		System.out.println("count of substring is : "+c);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class String6 {
	
	public static void substring(String str) {
		int c=0;
		int n=str.length();
		for(int i=0;i<=n-1;i++) {
			int start=i;
			
			for(int j=i;j<=n-1;j++) {
				int end=j;
				
				for(int k=start;k<=end;k++) {
					System.out.println(str.charAt(k)+" ");
					
				}
				c++;
				System.out.println();
			}
			System.out.println();
			
		}
		
	
		System.out.println("the total substrings are : "+c);
		
		
		
		
	}
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	
	String str;
	
	System.out.println("enter the string : " );
	str=sc.nextLine();
	
	substring(str);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Scanner sc=new Scanner(System.in);
//	int n;
//	System.out.println("enter the size of array");
//	n=sc.nextInt();
//	int array[]=new int [n];
//	System.out.println("enter the elements in array");
//	for(int i=0;i<=n-1;i++) {
//		array[i]=sc.nextInt();
//		
//	}
//	System.out.println(" the elements in array are ");
//	
//	for(int i=0;i<=n-1;i++) {
//		System.out.println(array[i]);
//		
//	}
//	
//	substring(array,n);
	
	sc.close();
}
}
