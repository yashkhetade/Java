package mypack;
import java.util.*;




public class TwoArray1 {
	
	public static boolean linearsearch(int array[][],int row,int col,int key) {
		
		
		
	for(int  i=0;i<row;i++) {
			
			for(int  j=0;j<col;j++) {
				
				if(array[i][j]==key) {
					
					System.out.println("element found at index " +i+ "and "+j);
					return true;
				}
				
				
			}
		
			
		}
	System.out.println("key not found");
	return false;
		
		
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int row,col;
		System.out.println("enter the no of rows");
		row=sc.nextInt();
		
		System.out.println("enter the no of colomns");
		col=sc.nextInt();
		
		int array[][]=new int [row][col];
		
		System.out.println("enter the elements in array : ");
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				array[i][j]=sc.nextInt();
				
			}
			
		}
		
		System.out.println(" the elements in array are : ");
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		System.out.println(" Transpose Is : ");
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col;j++) {
				System.out.print(array[j][i]+" ");
				
			}
			System.out.println();
			
		}
		
//		int key ;
//		System.out.println("enter the element to be searched ");
//		key =sc.nextInt();
//		
//		linearsearch(array,row,col,key);
				
		
		sc.close();
		
		
	}
	
	
	
}
