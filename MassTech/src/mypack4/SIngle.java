package mypack4;


class Animal2{
	
	void show() {
		System.out.println("i am parent class method ");
		
	}
	
}


class dog2 extends Animal{
	
	void display() {
		System.out.println("i am dog ");
		
	}
}







public class SIngle {

	
	public static void main(String[] args) {
		
		
		
		dog2 obj2=new dog2();
		obj2.display();
		obj2.show();
		
		
	}
}
