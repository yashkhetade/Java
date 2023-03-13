package mypack;


//linked list is a collection of nodes 
//each not carry data of current node and address of next node

//it is linear data structure

//non linear-tree and graph



public class Linkedlist1 {
	
	
public static class Node{
	
	int data;
	
	Node next;
	
	public Node(int data) {
		
		this.data=data;
		this.next=null;
		
	}
	
	
	
}

public static Node head;
public static Node tail;


////////////////////////////////////////

/*
 * we can add elements in linkedlist in two ways 
 * add to head
 * add to tail
 */


public  void addfirst(int data) {
	
	//0(1)
	//step1- create a node
	Node newnode=new Node(data);
	
	if(head==null) {
		head=tail=newnode;
		return ;
	}
	
	
	
	//new node->head=next
	newnode.next=head;
	head=newnode;
	
	
	
}


public  void addlast(int data) {
	
	//0(1)
	//step1- create a node
	Node newnode=new Node(data);
	
	if(head==null) {
		head=tail=newnode;
		return;
	}
	
	
	
	//new node->head=next
	tail.next=newnode;
	newnode=tail;
	
	
	
}

public  void remove() {
	
	
}

public void print() {
	
	//0(n)
	
	if(head==null) {
		
		System.out.println("linked list is empty");
		
		return ;
		
	}
	
	
	Node temp=head;
	
	while(temp!=null) {
		
		System.out.print(temp.data+"->");
		temp=temp.next;
		
	}
	
	System.out.println("null");
	
}

public  void search() {
	
	
}

	
	
	
	public static void main(String[] args) {
		
		Linkedlist1 l1=new Linkedlist1();
		
		l1.print();
		l1.addfirst(1);
		l1.print();
		l1.addfirst(2);
		l1.print();
		l1.addfirst(3);
		l1.print();
		
		l1.addfirst(4);
		l1.print();
		
		l1.addfirst(5);
		l1.print();
		
		
		
		
		
	}
	
	
	
}
