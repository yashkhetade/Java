package mypack4;

class Bank{
	
	private String name="yash";
	
	private int accno;
	
	private double balance;
	
	private String addr="pune";
	
	
	void setName(String name) {
		this.name=name;
		
		
		
	}
	
	void setaddr(String addr) {
		this.addr=addr;
		
		
		
	}
	
	String getName() {
		
		return name;
		
		
		
	}
	
   String getaddr() {
		
		return addr;
		
		
		
	}
	
	
	double getbalance() {
		
		return balance;
		
		
		
	}
	
	void setbalance(double balance) {
		
		this.balance= balance;
		
		
		
	}
	
	
	
}


public class BankExp {

	public static void main(String[] args) {
		Bank b1=new Bank();
		
		System.out.println(b1.getaddr());
		System.out.println(b1.getName());
	}
}
