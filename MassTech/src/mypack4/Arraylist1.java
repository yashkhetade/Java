package mypack4;

import java.util.*;




public class Arraylist1 {
	
	
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
		
		for( k=0,i=start;k<=temp.length;k++,i++) {
			temp[k]=array[i];
			
			
		}
		
		
		
		
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
		
		
		merges(array,0,n-1);
		
		  System.out.println(" the elements in array after sorting are : ");
			
			for(int i=0;i<=n-1;i++) {
				System.out.print(array[i]+" ");
				
			}
		
		
		
		sc.close();
	}

}
