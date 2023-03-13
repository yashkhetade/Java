package mypack;

//it lis a linear data structure 
//it follows last in first out concept


//w

public class Queue1 {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
		
	}
	
	 static class queue{
		
		public static Node head=null;
		public static Node tail=null;
		
		public static boolean isempty() {
			
			return head==null&tail==null;
			
		}
		
		//isfull -nahi rehta bcz linked list is dynamic
		
        public static void enque(int data) {
			
        	Node n1=new Node(data);
			
			if(tail==null) {
				head=tail=n1;
				return ;
				
			}
			tail.next=n1;
			tail=n1;
			
		}
        
          public static int deque() {
			
        	  if(head==null) {
        		  
        		  System.out.println("queue is emprty");
        		  return -1;
        	  }
        	  
        	int value=head.data;
        	
        	head=head.next;
        	return value;
			
		}
          
          public static int peak() {
        	  
        	  return head.data;
          }
		
          public static void print() {
        	  
        	  Node temp=head;
        	  while(temp!=null) {
        		  System.out.println(temp.data);
        		  temp=temp.next;
        	  }
        	  
          }
		
		
	}
	
	
	
	
	
 public static void main(String[] args) {
	
	 
	 queue q1 =new queue();
	 
	 System.out.println("empty or not : "+q1.isempty());
	 
	 q1.enque(4);
	 q1.enque(5);
	 q1.enque(6);
	 q1.enque(8);
	 
	 
   q1.print();
	 
   System.out.println("peak element is : "+q1.peak());
	 System.out.println("empty or not : "+q1.isempty());
	 
	 q1.deque();
	 System.out.println("after removing : ");
	 
	 q1.print();
	 
	 
	 
	 
}
 
 
}
