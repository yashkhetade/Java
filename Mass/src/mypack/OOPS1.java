package mypack;

//GETTERS AND SETTERS ARE USED FOR SECURITY PURPOSE
//THEY ARE USED TO ACCESS PRIVATE MEMBERS


class Parent{
	
// private String password;
 private int id;
 
 public int getId() {
	 return this.id;
	 
 }
	
 public void setId(int id) {
	 this.id=id;
	 
 }
	
}


public class OOPS1 {
	
	
	public static void main(String[] args) {
		Parent p=new Parent();
		
		p.setId(34);
		System.out.println(p.getId());
		
		p.setId(38);
		System.out.println(p.getId());
		
	}
}
