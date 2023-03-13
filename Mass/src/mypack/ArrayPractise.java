package mypack;
import java.util.*;

public class ArrayPractise {
	
	public static void selectionsort(int array[],int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(array[i]<array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
					
				}
				
			}
			
		}
		
		
	}
	
	public static void bubblesort(int array[],int n) {
		
		int counter=1;
		
		while(counter<n) {
			for(int i=0;i<n-counter;i++) {
				if(array[i]>array[i+1]) {
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					
				}
			}
			counter++;
		}
	}
	
	public static void insertionsort(int array[],int n) {
		
		for(int i=0;i<n;i++) {
			int temp=array[i];
			int j=i-1;
			
			for(;j>=0;j--) {
			if(array[j]>temp) {
				
				array[j+1]=array[j];
				
			}
			else {
				break;
				
			}
				
				
			}
			
			array[j+1]=temp;
			
		}
	}




	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		
		
		int array[]=new int[n];
		System.out.println("enter the elements in array");
		for(int i=0;i<=n-1;i++) {
			array[i]=sc.nextInt();
			
			
		}
		
		System.out.println(" the elements in array arre : ");
		for(int i=0;i<=n-1;i++) {
			System.out.println(array[i]);
			
			
		}
		
		insertionsort(array,n);
		
		System.out.println(" the elements in array after sorting are : ");
		for(int i=0;i<=n-1;i++) {
			System.out.println(array[i]);
			
			
		}
		
		
		
	
		sc.close();
	}
}