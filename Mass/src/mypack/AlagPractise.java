package mypack;

public class AlagPractise{
	
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
		if(head==null) {
			
			head=tail=n1;
			return ;
		}
		size++;
		
		n1.next=head;
		head=n1;
		
	}
	
	
	public void addlast(int data) {
		
		Node n1=new Node(data);
		if(head==null) {
			
			head=tail=n1;
			return ;
		}
		size++;
		
		tail.next=n1;
		tail=n1;
		
	}
	
	public void addany(int i,int data) {
		
	 Node n1=new Node(data);
	if(head==null) {
			
			head=tail=n1;
			return ;
		}
	
	size++;
	 
	 Node temp=head;
	 
	  i=0;
	 
	 
	 while(temp!=null) {
		 
		 i++;
		 temp=temp.next;
		 
	 }
	 temp.next=n1.next;
	n1.next=temp.next;
	 
		
	}
	
	public int  remove() {
		
		
		if(size==0) {
			
			System.out.println("empty");
			return Integer.MIN_VALUE;
			
		}
		if(size==1) {
			
			
			int value=head.data;
			
			head=head.next;
			size=0;
			return value;
			
			
		}
		
		
		
		int value=head.data;
		head=head.next;
		size--;
		return value;
		
	}
	
	
	public void print() {
		
		if(head==null) {
			System.out.println("linkedlist is empty");
			return ;
			
		}
	Node temp =head;
	
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		AlagPractise obj=new AlagPractise();
		
	
		obj.addlast(3);
		obj.addlast(4);
		obj.addlast(5);
		obj.addlast(6);
		
		obj.remove();
		
		
		obj.print();
		
		
	}
	
	
}
