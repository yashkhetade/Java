package mypack;

import java.util.*;

public class Array10 {

	public static void read (int array[][],int row,int col) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=row-1;i++) {
			 for(int j=0;j<=col-1;j++) {
				 array[i][j]=sc.nextInt();
			 }
			 System.out.println();
			
		}
		sc.close();
		
	}
	
	public static void print (int array[][],int row,int col) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=row-1;i++) {
			 for(int j=0;j<=col-1;j++) {
				 System.out.print(array[i][j]);
			 }
			 System.out.println();
			
		}
		sc.close();
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("enter the rows ");
		row=sc.nextInt();
		
		System.out.println("enter the coloumns ");
		col=sc.nextInt();
		sc.close();
		int array[][]=new int[row][col];
		
		read(array,row,col);
		print(array,row,col);
		
		
		
	
		
		
		
		
	}
}
