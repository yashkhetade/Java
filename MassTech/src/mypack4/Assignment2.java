package mypack4;
import java.util.*;

class Batsman{
	
	int bcode;
	String bname;
	int innings,notout,runs;
//	float total;
	
	
	public void Readdata() {
		
		Scanner sc=new Scanner (System.in);
		
	System.out.println(" batsman data : ");
	
	System.out.println("enter the bname : ");
	this.bname=sc.nextLine();
	
	System.out.println("enter the bcode : ");
	this.bcode=sc.nextInt();
	

	
	System.out.println("enter the innings: ");
	this.innings=sc.nextInt();
	
	System.out.println("enter the notout time : ");
	this.notout=sc.nextInt();

	
	System.out.println("enter the runs : ");
	this.runs=sc.nextInt();
	
	
		
	
	sc.close();
		
		
	}
	
	public float calcavg() {
		
		System.out.println("Batavg is : ");
		float batavg=runs/(innings-notout);
		
		return batavg;
	}
	
	public void display() {
		
		System.out.println("bcode :"+bcode);
		System.out.println(" bname : "+bname);
		System.out.println(" innings : "+innings);
		System.out.println(" notout : "+notout);
		System.out.println(" runs : "+runs);
		
	
		
	}
	
}

public class Assignment2 {

	public static void main(String[] args) {
		
		Batsman b1=new Batsman();
		b1.Readdata();
		b1.display();
		System.out.println(b1.calcavg());
	}
	
}