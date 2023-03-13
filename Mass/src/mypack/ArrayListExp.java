package mypack;

import java.util.*;



public class ArrayListExp {
	
	public static void reverse(	ArrayList<Integer>a) {
		
		int n=a.size();
		
		int start=0;
		int end=n-1;
		
		int b=a.get(start);
		int c=a.get(end);
		
		while(start<=end) {
			int temp=b;
			b=c;
			c=temp;
			
			b++;
			c--;
			
			
		}
		
		
	}
	
	
	public static void reverse2(ArrayList<Integer>a) {
		
		
		System.out.println("after reversing : ");
		int n=a.size();
	    for(int i=n-1;i>=0;i--) {
	    	System.out.print(a.get(i)+" ");
	    	
	    }
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		 
		
		a.add(12);
		a.add(24);
		
		a.add(15);
		
		a.add(2);
		
		
		int n=a.size();
		
		System.out.println("the elements in arraylist are : ");
		for(int i=0;i<=n-1;i++) {
			
			System.out.println(a.get(i)+" ");
			
		}
		
	
		Collections.sort(a);

		System.out.println("the elements in arraylist  after sorting are : ");
		for(int i=0;i<=n-1;i++) {
			
			System.out.println(a.get(i)+" ");
			
		}
		
	
		
		
		
	}
}
