package mypack;
import java.util.*;


public class Stringsp {
	public static void getsubarray(int array[],int n) {

		for(int i=0;i<=n-1;i++) {
			int start=i;
			for(int j=i;j<=n-1;j++) {
				int end=j;
				
				for(int k=start;k<=end;k++) {
					System.out.println(array[k]+ " ");
					
				}
				System.out.println();
				
			}
			
			System.out.println();
			
			
		}
		
		
		
	}
	
	public static void getduplicate(int array[],int n) {
		
	for(int i=0;i<n-1;i++) {
			
			for(int j=1;j<n-1-i;j++) {
				
				if(array[j]==array[j+1]) {
					
					System.out.println(array[j]);
				
					
					
				}
				
			}
			
			
		}
	
		
	}
	
	
	public static void getduplicatechar(String str) {
		
		int n=str.length();
	for(int i=0;i<n-1;i++) {
			
			for(int j=1;j<n-1-i;j++) {
				
				if(str.charAt(j)==str.charAt(j+1)) {
					
					System.out.println(str.charAt(j));
				
					
					
				}
				
			}
			
			
		}
	
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

//    int n;
//    
//    System.out.println("enter the value of n : ");
//    n=sc.nextInt();
//    int array[]=new int [n];
//    
//    System.out.println("enter the elements in array : "+" ");
//    
//    for(int i=0;i<=n-1;i++) {
//    	array[i]=sc.nextInt();
//    	
//    }
//    
//  System.out.println(" the elements in array are : ");
//    
//    for(int i=0;i<=n-1;i++) {
//    	System.out.print( array[i]+" ");
//    	
//    }
//
//    getduplicate(array,n);
		
		String str=" yaash ";
		
		getduplicatechar(str);
    
sc.close();
    
    
	}
	
	
}
