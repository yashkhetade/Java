package mypack;

//doubly linkedlist
//each node also has address of previous node



public class linkedlist4 {

	class Node{
		
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
			
			
		}
		
	}
	
	public static Node head;
	public static Node tail;
	public static int  size;
	
	
	
	public  void addfirst(int data) {
		
		Node n1=new Node(data);
		size++;
		
		if(head==null) {
			head=tail=n1;
			return ;
			
		}
		
		n1.next=head;
		n1.prev=n1;
		head=n1;
		
		
	}
	
	public  void print() {
		
		Node temp=head;
		
		while(temp!=null) {
			
			System.out.println(temp.data);
			temp=temp.next;
			
			
		}
		
		
		
		
	}
	
	
	public int removefirst() {
		
		if(head==null) {
			
			System.out.println("linked list is  empty ");
			return Integer.MIN_VALUE;
			 
			
		}
		
		
		if(size==1) {
			
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
			
			
		}
		int val=head.data;
		head=head.next;
		head.prev=null;
		size--;
		return val;
		
		
	}
	
	public void reverse() {
		
		Node prev=null;
		Node current=head;
		Node next;
		
		while(current!=null){
			next=current.next;
			current.next=prev;
			current.prev=next;
			
			prev=current;
			current=next;
			
			
		}
		head=prev;
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		linkedlist4 obj=new linkedlist4();
		
		
		obj.addfirst(3);
		obj.addfirst(4);
		obj.addfirst(5);
		
		obj.print();
		
//		obj.reverse();
		obj.removefirst();
		
		System.out.println("after removing");
		
		
		obj.print();
		
		System.out.println("size after removing "+obj.size);
		
		
		
		
		
	}
}
