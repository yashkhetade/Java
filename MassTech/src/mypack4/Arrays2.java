package mypack4;
import java.util.*;

public class Arrays2 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int row,col;
		System.out.println("enter rows");
		row=sc.nextInt();
		
		System.out.println("enter col");
		col=sc.nextInt();
		
		
	
		
		int array[][]=new int[row][col];
		
	
		System.out.println("enter the elements in array : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
			
			array[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("the elements in array are : ");
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
			 System.out.print(array[i][j]+" ");
		
			}
			System.out.println();
			
		}
		

		sc.close();
	}
	
}
