package mypack;
import java.util.*;

public class Array5 {
	//linearesearch
//array is a object in java which store data in contiguous manner
	
	public static int firstocc(int array[],int n,int key) {
	 int start=0;
	 int end=n-1;
	 int mid=start+(end-start)/2;
	 
	 while(start<=end){
		 
		 if(array[mid]==key) {
			 array[mid]=key;
			 end=mid-1;
			 
		 }
		 else if(key>array[mid]) {
			 start=mid+1;
			 
		 }
		 else {
			 
			 end=mid-1;
		 }
		 mid=start+(end-start)/2;
	 }
	 return mid;
		
		
	}
	
	public static int lastocc(int array[],int n,int key) {
		 int start=0;
		 int end=n-1;
		 int mid=(start+end)/2;
		 
		 while(start<=end){
			 
			 if(array[mid]==key) {
				array[mid]=key ;
				start=mid+1;
				 
			 }
			 else if(key>array[mid]) {
				 start=mid+1;
				 
			 }
			 else {
				 
				 end=mid-1;
			 }
			  mid=(start+end)/2;
		 }
		 return mid;
			
			
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
		
		int key;
		System.out.println("enter the key");
		key=sc.nextInt();
		
		
		System.out.println(firstocc(array, n, key));
		System.out.println(lastocc(array, n, key));
		sc.close();
	}
}
