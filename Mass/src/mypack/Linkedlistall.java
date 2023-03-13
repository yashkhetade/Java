package mypack;
public class Linkedlistall{

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
	public boolean isempty() {
		 if(head==null) {
			 return true;
		 }
		 else {
			 return false;
			 
		 }
	 
	}
	
	
	public void addf(int data) {
		
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
			return ;
		}
		tail.next=n1;
		tail=n1;
		
		
	}
	
	public int remove() {
		
		if(size==0) {
			
			System.out.println("linked list is empty ");
			return -1;
		}
				
		if(size==1) {
			
			int top=head.data;
			head=tail=null;
			size=0;
			return top;
			
		}
		
		int top=head.data;
		head=head.next;
		size--;
		return top;
		
		
	}
	
	public void addany2(int index,int data) {
		
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
	
	
	public void peak() {
		
		System.out.println("peak element is "+head.data);
	}
	
	public void reverse() {
		Node prev=null;
		Node current=head;
		Node next;
		
		while(current!=null) {
			
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
			
		}
		head=prev;
		
	}
	
	public void print() {
		
		Node temp=head;
		while (temp!=null) {
			
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	

	
	public static void main(String[] args) {
		
	    Linkedlistall obj=new Linkedlistall();
		
		System.out.println(obj.isempty());
		
		System.out.println("size of linkedlist before insert is "+size);
		
		
		obj.addlast(4);
		obj.addlast(5);
		obj.addlast(8);
		obj.addlast(6);
		obj.addany2(2, 88);
		
		obj.print();
		
		System.out.println("size of linkedlist after insert is "+size);
		
		obj.peak();
		
		obj.reverse();
		
		obj.print();
		
//		obj.remove();
		
		
		
		
		
		
		
		
	}
	
	
}
