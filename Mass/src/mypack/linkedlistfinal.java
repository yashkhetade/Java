package mypack;




public class linkedlistfinal{
	
	class Node{
		int data;
		Node next;
//		Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			
//			this.prev=null;
			
			
		}
		
		
	}
	
	
	public static Node head;
	public static Node tail;
	
	public static int size;
	
	
	
	public boolean isempty() {
		return head==null;
		
	}
	
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
			return ;
			
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
	

	
	
	public int remove() {
		
		if(size==0) {
			System.out.println("linked list is empty");
			return Integer.MIN_VALUE;
		}
		
		if(size==1) {
			
			int value=head.data;
			head=tail=null;
			size=0;
			return value;
		}
		
		int value=head.data;
		head=head.next;
//		head.prev=null;
		size--;
		return value;
		
		
	}
	
	public void print() {
		
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		
	}
	public void reverse() {
		
		
		Node prev=null;
		Node current=head;
		Node next;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
//			current.prev=next;
			
			prev=current;
			current=next;
			
		}
		head=prev;
		
	
		
		
	}
	
	public int linearsearch2(int key) {
		
		Node temp=head;
		int i=0;
		
		while(temp!=null) {
			if(temp.data==key) {
				
				return i;
			}
			temp=temp.next;
			i++;
		
			
		}
		return -1;
		
		
		
	}
	public static void main(String[] args) {
		
		
		linkedlistfinal obj=new linkedlistfinal();
		
		System.out.println("empty or not "+obj.isempty());
		obj.addlast(3);
		obj.addlast(4);
		obj.addlast(5);
		obj.addlast(6);
	
		obj.print();
		System.out.println( obj.linearsearch2(5));
		
		
		
		
		
		

		
		
		
		System.out.println("size is "+obj.size);
		
		
		
		
		
		
		
		
	}
	
	
	
}