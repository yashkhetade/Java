package mypack;

public class Linkedlist2{
	
	
public static class Node{	
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
		
		
	}

	
}

	
	public static Node head;
	public static Node tail;
	
	
	
	public void addfirst(int data) {
		 
		
		Node n1=new Node(data);
		
		if(head==null) {
			head=tail=n1;
			return ;
			
		}
		
	    n1.next=head;
	    head=n1;
		
	}
	
public void addlast(int data) {
		
	Node n1=new Node(data);
	
	if(head==null) {
		head=tail=n1;
		return ;
		
	}
	
    tail.next=n1;
    n1=tail;
		
	}
	
public void print() {
	

	
	Node temp=head;
	
	if(head==null) {
		System.out.println("linked list is empty");
		return ;
		
	}
	
	
	while(temp!=null) {
		
		System.out.print(temp.data+" ");
		temp=temp.next;
		
	}
	
	System.out.println();
	
	
	
}


	
	public static void main(String[] args) {
	 
		Linkedlist2 l1=new Linkedlist2();
		
		l1.print();
		l1.addfirst(2);
		l1.addfirst(4);
		l1.addfirst(5);
		l1.addfirst(6);
		
		l1.print();
		
	}
	
	
	
}