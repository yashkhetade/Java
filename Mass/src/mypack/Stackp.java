package mypack;

import java.util.*;


public class Stackp{
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
			
		}
		
		
		
	}
	
	
	public static class stack{
		
	
	public static Node head;
	
	
	public static boolean isempty() {
		
		return head==null;
		
		
	}
	
	public static void push(int data) {
		
		Node n1=new Node(data);
		if(head==null) {
			head=n1;
			return;
			
		}
		
		n1.next=head;
		head=n1;
		
		
	}
	
	public static int pop() {
		
		int value=head.data;
		head=head.next;
		return value;
		
		
	}
	
	
	public static int peek() {
		
		return head.data;
	}
	
	}
	
public static void main(String[] args) {
	
stack s1=new stack();

System.out.println("stack empty or not : "+s1.isempty());
s1.push(6);
s1.push(8);
s1.push(7);
s1.push(45);

System.out.println("peak element is : "+s1.peek());

while(!s1.isempty()) {
	
	System.out.println(s1.peek());
	s1.pop();
}


	
	
}
		
		
		
	
	
	
}
