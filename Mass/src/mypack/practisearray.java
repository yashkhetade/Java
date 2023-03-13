package mypack;

import java.util.*;







public class practisearray {
	
	
	public static void read(int array[],int n) {
		
		System.out.println("enter the elements in array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=n-1;i++) {
			array[i]=sc.nextInt();
			
		}
		sc.close();
	}
	////////////////////////////////////////////////////////
	
	public static void print(int array[],int n) {
		
		System.out.println(" the elements in array are : ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=n-1;i++) {
			System.out.println(array[i]+" ");
			
		}
		sc.close();
		
		
	}
	//////////////////////////////////////////////////////////
	
	
	public static void total(int array[],int n) {
		int sum=0;
		for(int i=0;i<=n-1;i++) {
			sum=sum+array[i];
			
		}
	}
	///////////////////////////////////
	
	public static boolean linearsearch(int array[],int n,int key) {
		
		for(int i=0;i<=n-1;i++) {
			
			if(array[i]==key) {
				System.out.println("element found at index "+i);
				return true;
				
			}
			
			
		}
		System.out.println("element not found");
		return false;
		
		
	}
	////////////////////////////////////////
	
	public static int binarysearch(int array[],int n,int key) {
		
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;
		
		while(start<=end) {
			
			if(array[mid]==key) {
				return mid;
			}
			else if(key>array[mid]) {
				start=mid+1;
			}
			else {
				
				end=mid-1;
			}
			mid=start+(end-start)/2;
			
		}
		return -1;
		
	}
	
	///////////////////////////////////////////////////

	public static int firstocc(int array[],int n,int key) {
		
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;
		int ans=-1;
		
		while(start<=end) {
			
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
		return ans;
		
	}
	
	//////////////////////////////////////////////////////
	

	public static int lastocc(int array[],int n,int key) {
		
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;
		int ans=-1;
		
		while(start<=end) {
			
			if(array[mid]==key) {
				array[mid]=key;
				start=mid+1;
			}
			else if(key>array[mid]) {
				start=mid+1;
			}
			else {
				
				end=mid-1;
			}
			mid=start+(end-start)/2;
			
		}
		return ans;
		
	}
	
	////////////////////////////////////////////////////
	public static void reverse(int array[],int n) {
		
		int start=0;
		int end=n-1;
		
		while(start<=end) {
			
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			
			start++;
			end--;
			
			
		}
		
	}
	///////////////////////////////////////////////
	public static void swapalternate(int array[],int n) {
		
		
		for(int i=0;i<=n;i=i+2) {
			if(i+1<n) {
				int temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
				
			}
			
		}
		
		
	}
	////////////////////////////////////////////////////
	
	public static int  maxelement(int array[],int n) {
		
		int max=array[0];
		
		for(int i=0;i<=n-1;i++) {
			if(max<array[i]) {
				max=array[i];
				
			}
			
			
		}
		return max;
		
		
	}
	///////////////////////////////////////////////
	public static int  minelement(int array[],int n) {
		
		int min=array[0];
		
		for(int i=0;i<=n-1;i++) {
			if(min>array[i]) {
				min=array[i];
				
			}
			
			
		}
		return min;
		
		
	}
	///////////////////////////////////////////////
	
//	SORTING 
	
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
	//////////////////////////////////////////////////
	
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

////////////////////////////////////////////////////


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


//////////////////////////////////////////////////////





	
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 int n;
	 
	 System.out.println("enter the size of array");
	 n=sc.nextInt();
	 
	 int array[]=new int [n];
	 
	 read(array,n);
	 print(array,n);
	 
	 sc.close();
	 
	 
}
 
 
}
