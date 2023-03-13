package mypack;
import java.util.*;

public class Array8unique {
	//linearesearch
//array is a object in java which store data in contiguous manner
	


public static int unique(int array[],int n) {
	
	int result=0;
	for(int i=0;i<=n-1;i++) {
		
		result=result^array[i];
	}
	return result;
	
}


//swapalternate elements in array

public static void swapalternate(int array[],int n){ 
    for(int i=0;i<n;i=i+2){
     if(i+1<n){
    	 int temp=array[i];
    	 array[i]=array[i+1];
    	 array[i+1]=temp;
     
     }
    
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
		
		System.out.println(" the elements in array are : ");
		for(int i=0;i<=n-1;i++) {
			System.out.print(array[i]);
			
			
		}
		
		
		
		
		swapalternate(array,n);
		
		System.out.println(" the elements in array after swapping are : ");
		for(int i=0;i<=n-1;i++) {
			System.out.print(array[i]);
			
			
		}
		
	
		sc.close();
	}
}
