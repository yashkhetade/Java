package mypack;

class Complex{
	int r,i;
	
	Complex(){
		
	}
	
	Complex(int real,int imag){
		
		r=real;
		i=imag;
		
	}
	
	public String display() {
		
		return (r+"i"+i);
		
	}
	
	public static Complex Add(Complex c1,Complex c2) {
		
		Complex c3=new Complex();
		c3.r=c1.r+c2.r;
		c3.i=c1.i+c2.i;
		
		return c3;
		
	}
	
	
	
	
}

public class OOP$ {

	
	
	
	public static void main(String[] args) {
		Complex obj1=new Complex (2,4);
				Complex obj2=new Complex (2,6);
				
				Complex obj3= Complex.Add(obj1, obj2);
				
				System.out.println(obj3.display());
		
		
		
	}
	
	
	
}
