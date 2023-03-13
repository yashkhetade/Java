package mypack4;

class Student{
	
	int adminno;
	String sname;
	float eng, math, science;
//	float total;
	
	
	public void Takedata(int adminno,String sname,float eng,float math,float science) {
		
		this.adminno=adminno;
		this.sname=sname;
		this.eng=eng;
		this.math=math;
		this.science=science;
		
		
		
		
	}
	
	public float total() {
		
		System.out.println("Total marks are : ");
		float c=eng+ math+ science;
		
		return c;
	}
	
	public void show() {
		
		System.out.println("admin no is "+adminno);
		System.out.println("admin name is "+sname);
		System.out.println("marks are : "+"eng= "+eng+"math= "+math+"science= "+science);
		
	
		
	}
	
}

public class Assignment1 {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.Takedata(23,"Yash", 70, 80, 86);
		s1.show();
		System.out.println(s1.total());
	}
	
}
