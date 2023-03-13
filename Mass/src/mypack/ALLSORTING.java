package mypack;

import java.util.*;




public class ALLSORTING {
	
	
	public static void merge(int array[],int start,int mid,int end) {
		
		int temp[]=new int[end-start+1];
		
		int i=start;
		int j=mid+1;
		int k=0;
		
		while(i<=mid&&j<=end) {
			
			
			if(array[i]<array[j]) {
				
				temp[k]=array[i];
				i++;
				
				
				
			}
			else {
				temp[k]=array[j];
				j++;
			}
			k++;
			
			
		}
		
		
		while(i<=mid) {
			temp[k++]=array[i++];
		}
		
		
		while(j<=end) {
			temp[k++]=array[j++];
		}
		
		for( k=0,i=start;k<temp.length;k++,i++) {
			array[i]=temp[k];
			
			
		}
		
		
	}
	
	///////////////////////////////////////////////////////////
	
	
	public static int  partition(int array[],int start,int end) {
		
		int pivot=array[end];
		
		int i=start-1;
		
		
		for(int j=start;j<end;j++) {
			if(array[j]<=pivot) {
				
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
				
				
			}
		}
			i++;
			int temp=pivot;
			array[end]=array[i];
			array[i]=temp;
			
		
		
		return i;
		
	}
	
	////////////////////////////////////////////////////////////
	
	
	
	public static void quicks(int array [],int start,int end) {
		
		if(start>=end) {
			return ;
		}
		
		int pivotindex=partition(array,start,end);
		
		quicks(array,start,pivotindex-1);
		quicks(array,pivotindex+1,end);
				
				
		
		
		
		
		
	}
	
	
	
	
	public static void merges(int array[],int start,int end) {
		
		if(start>=end) {
			return ;
			
		}
		
		int mid=start+(end-start)/2;
		
		merges(array,start,mid);
		merges(array,mid+1,end);
		
		merge(array,start,mid,end);
		
		
	}
	
	
	///////////////////////////////////////////////////////////////////
	
	
	
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
	
	///////////////////////////////////////////////////////////
	
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
		
		
	for(int i=1;i<n;i++) {
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
		System.out.println("enter the value of n : ");
		n=sc.nextInt();
		
		int array[]=new int[n];
		
		System.out.println("enter the elements in array : ");
		
		for(int i=0;i<=n-1;i++) {
			array[i]=sc.nextInt();
			
		}
		
		
        System.out.println(" the elements in array are : ");
		
		for(int i=0;i<=n-1;i++) {
			System.out.print(array[i]+" ");
			
		}
		
		
		bubblesort(array,n);
		
		  System.out.println(" the elements in array after sorting are : ");
			
			for(int i=0;i<=n-1;i++) {
				System.out.print(array[i]+" ");
				
			}
		
		
		
		sc.close();
	}

}
