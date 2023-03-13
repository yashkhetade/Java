package mypack;

public class Linkedlistpractise {
	
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
			
			
		}
		
		
	}
	
	public static Node head;
	public static Node tail;
	
	public static int size;
	
	public void addfirst(int data) {
		
		Node n1=new Node(data);
		
		size++;
		
		if(head==null) {
			head=tail=n1;
			return ;
		}
		
		n1.next=head;
		head=n1;
		
		
	}
	
	public void addlast(int data) {
		
		
		Node n1=new Node(data);
		size++;
          
		if(head==null) {
			head=tail=n1;
			return;
		}
		
		tail.next=n1;
	    tail=n1;
	}
	
	public void addany(int index,int data) {
		
		Node n1=new Node(data);
		size++;
		
		Node temp=head;
		
		int i=0;
		
		while(i<index-1) {
			
			temp=temp.next;
			i++;
			
			
		}
		n1.next=temp.next;
		temp.next=n1;
		
	}
	
	
	public int removefirst() {
		
		if(size==0) {
			
			System.out.println("linked list empty");
			return Integer.MIN_VALUE;
			
		}
		
        if(size==1) {
			
			System.out.println("linked list empty");
			int value=head.data;
			head=tail=null;
			size=0;
			return value;
					
			
		}
		
		int value =head.data;
		head=head.next;
		size--;
		return value;
		
		
	}
	
	
	public void reverse() {
		
		Node prev=null;
		Node current=head;
		Node next;
		
		while(current !=null) {
			
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		head=prev;
		
		
	}
	public void print() {
		
		if(head==null) {
			System.out.println("linked list is empty");
			
		}
		
		Node temp=head;
		
		while(temp!=null) {
			
			System.out.println(temp.data);
			temp=temp.next;
			
		}
		
		System.out.println();
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Linkedlistpractise obj=new Linkedlistpractise();
		
		obj.addfirst(12);
		obj.addfirst(13);
		obj.addfirst(14);
		obj.addfirst(15);
		obj.addfirst(16);
		obj.addany(2, 55);
		
		obj.print();
		
	}
}
