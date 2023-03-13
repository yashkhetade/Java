package mypack;

import java.util.*;

public class Stack3 {
public static void main(String[] args) {
	
	//using java collection framework
	Stack <Integer> s1=new Stack<Integer>();
	
	s1.push(4);
	s1.push(5);
	s1.push(6);
	s1.push(8);
	
	s1.pop();
	
	System.out.println(s1.peek());
	
	
	while(!s1.isEmpty()) {
		System.out.println(s1.peek());
		s1.pop();
	}
	
}
}
