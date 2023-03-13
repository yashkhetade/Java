package mypack;
import java.util.*;


public class Stack234 {

 static	class stack{
	 
	static ArrayList<Integer>list=new ArrayList<Integer>();
	
	
	static void push(int data) {
		list.add(data);
		
	}
	 
	static boolean isempty() {
		
		return list.size()==0;
		
		
	}
	
	static int pop() {
		if(list.size()==0) {
			return -1;
		}
		
		int value=list.get(list.size()-1);
		list.remove(list.size()-1);
		return value;
		
	}
	
	static int peek() {
		
		return list.get(list.size()-1);
	}

	
	
	
	 
	 
 }
	
 
 
	public static void main(String[] args) {
		stack s1=new stack();
		s1.isempty();
		
		s1.push(4);
		s1.push(5);
		s1.push(6);
		s1.push(8);
		
		s1.pop();
		
		while(!s1.isempty()) {
			
			System.out.println(s1.peek());
			
			s1.pop();
		}
		
		
		
	}
	
	
}
