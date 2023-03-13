package mypack;


import java.util.*;

public class Pp2 {
	
	public static void merge(int array[],int start,int mid,int end) {
		
		
		int temp[]=new int [end-start+1];
		
		//iterator for left part
		int i=start;
		//iterator for right part
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
		
		
		//left me agar kuch bacha hai
		while(i<=mid) {
			
			temp[k++]=array[i++];
		}
		
		//right part ke liye bachta hai
		while(j<=end) {
			
			temp[k++]=array[j++];
		}
		
		for(k=0,i=start;k<temp.length;k++,i++) {
			array[i]=temp[k];
			
		}
		
		
	}
	
	public static void merges(int array[],int start,int end) {
		
		if(start>=end) {
			
			return;
		}

		
		//middle element nikalo
		int mid=start+(end-start)/2;
		
		
		//left part nikalo
		merges(array,start,mid);
		
		//right part nikalo
		merges(array,mid+1,end);
		
		
		merge(array,start,mid,end);
		
		
		
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
		
		merges(array,0,n-1);
		System.out.println(" the elements in array after sorting are : ");
		for(int i=0;i<=n-1;i++) {
			System.out.println(array[i]);
			
			
		}
		
		sc.close();
	}
}
