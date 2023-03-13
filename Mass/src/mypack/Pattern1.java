package mypack;
import java.util.*;


public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
//		int row,col;
//		 System.out.print("enter the rows ");
//		 row=sc.nextInt();
//		 
//		 System.out.print("enter the colomns");
//		 col=sc.nextInt();
		 
		sc.close();
	
		/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");    increasing
				                      
				
			}
			System.out.println();
			
		}
		*/
		
		
		/*
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");     decreasing
				
			}
			System.out.println();
			
		}*/
		
		
//		for(int i=0;i<row;i++) {
//			 for(int j=0;j<col;j++) {
//				 System.out.print(" ");
//				 
//			 }
//			 
//            for(int j=i;j<col;j++) {
//				 
//            	 System.out.print(row-j+1);
//			 }
//			 
//			 
//			 System.out.println();
//			
//		}
		
		int count=1;
		for(int i=0;i<5;i++) {
			 for(int j=0;j<5;j++) {
				 
				 System.out.print(count);
				 count++;
				 
			 }
			 System.out.println();
			
		}
		
		
		
		
	}
	
}
