package mypack4;

import java .util.*;

public class Demo2 {

	
	public static int search(int array[],int n,int key) {
		
		
		
		for(int i=0;i<=n-1;i++) {
			
			if(array[i]==key) {
				
				return i;
			}
			
			
			
		}
		
		return -1;
		
		
	}
	
	public static void  read(int array[],int key) {
		
       
         Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			System.out.println("enter the number to be searcheed ");
			key=sc.nextInt();
			
			
            if(array[i]==key) {
            	break;
            }
            
		
            	
            
            
			
		
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		
		int array[]= {1,2,3,4,5};
		
		

		int key = 0;
		
		read(array,key);
		
		
		
		
	
		
		try {
			
			
		
			
			
			int c=search(array,5,key);
			
			System.out.println(c);
			
			
			
			
		}
		catch(Exception e ) {
		
		System.out.println(e);
	   
			
			
		}
		
		finally {
			
			System.out.println("wait for 10 sec");
			
		}
		
		
		sc.close();
		
		
		
	}
}