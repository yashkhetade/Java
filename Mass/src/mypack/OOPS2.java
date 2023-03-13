package mypack;



 class Demo{
	
	public int id;
	public String name;
	 
	 Demo(Demo s1){
		 
		this.id=s1.id;
		this.name=s1.name;
		 
	 }
	 
	 Demo(int id,String name){
		 this.id=id;
		 this.name=name;
		 
	 }
	 
	 void display() {
		 System.out.println("id="+id+"name="+name);
		 
	 }
	 
	
	
}

public class OOPS2 {

	
	public static void main(String[] args) {
		
		Demo obj=new Demo(23,"yash");
		
		obj.display();
		
		Demo obj2=new Demo(obj);
		
		obj2.display();
		
		
		
		
		
	}
}
