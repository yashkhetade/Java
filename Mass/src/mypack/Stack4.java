package mypack;


import java.util.*;


	public class Stack4{
		
		
	public static void pushb(Stack<Integer> st,int data) {
		
		if(st.isEmpty()) {
			
			st.push(data);
			return;
		}
		
		
    int top=st.pop();
    
    pushb(st,data);
    
    
    st.push(top);
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		Stack<Integer> st=new Stack<Integer>();
		
	    st.push(4);
	    st.push(5);
	    st.push(8);
	    
	    
//	    System.out.println("printing stack");
//	    while(!st.isEmpty()) {
//	    	
//	    	System.out.println(st.peek());
//	    	st.pop();
//	    }
//		
	    pushb(st,45);
	    
	    
	    System.out.println(" after pushing bottom printing stack");
        while(!st.isEmpty()) {
	    	
	    	System.out.println(st.peek());
	    	st.pop();
	    }
		
	}
		
		
		
	}

