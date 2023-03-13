package mypack4;


class Animal4{
	
	void show() {
		System.out.println("i am parent class method ");
		
	}
	
}


class dog5 extends Animal{
	
	void display() {
		System.out.println("i am dog ");
		
	}
}

class cat5 extends dog{
	
	void display2() {
		System.out.println("i am cat ");
		
	}
}





public class Multiple {

	
	public static void main(String[] args) {
		
		cat5 obj=new cat5();
		obj.display();
		
		obj.show();
		
		obj.display2();
		
		
	}
}