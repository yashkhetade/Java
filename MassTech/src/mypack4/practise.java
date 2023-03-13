package mypack4;
import java.util.*;

public class practise {

	
	public static void merge(int array[],int start,int mid,int end) {
		
		int temp[]=new int[end-start+1];
		
		int i=start;
		int j=mid+1;
		int k=0;
		
		while(i<=mid&&j<=end) {
			
			if(array[i]<array[j]) {
				i++;
				temp[k]=array[i];
			
			}
			else {
				j++;
				temp[k]=array[j];
				
			}
			k++;
			
		}
		
		while(i<=mid) {
			temp[k++]=array[i++];
			
		}
		
		while(j<=end) {
			temp[k++]=array[j++];
			
		}
		
		for( i=start,k=0;k<temp.length;k++,i++) {
			array[i]=temp[k];
			
			
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
		
		n=sc.nextInt();
		
		int array[]=new int[n];
		
		System.out.println("enter elements");
		
		for(int i=0;i<=n-1;i++) {
			
			array[i]=sc.nextInt();
		}
		
		System.out.println("the elements are : ");
        for(int i=0;i<=n-1;i++) {
			
			System.out.print(array[i]+" ");
		}

        
        merges(array,0,n-1);
    	System.out.println("the elements after sorting are : ");
        for(int i=0;i<=n-1;i++) {
			
			System.out.print(array[i]+" ");
		}
		
		sc.close();
	}
	
	
	
}
