package mypack;




public class Practise{
	
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
			return ;
		}
		
		tail.next=n1;
		tail=n1;
		
	}
	
	public void addany(int i,int data) {
		
		Node n1=new Node(data);
		
		Node temp=head;
		
		 i=0;
		
		while(temp!=null) {
	          i++;
			temp=temp.next;
			
		}
		
		n1.next=temp.next;
		temp.next=n1;
		
		
		
		
	}
	
	
	public void print(){
		
		Node n1=new Node();
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Practise obj=new Practise();
		
	}
	
	
	

	
	
	
}

