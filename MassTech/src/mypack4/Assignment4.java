package mypack4;
import java.util.*;

public class Assignment4 {

	int flightno;
	
	String Destination;
	
	float Distance;
	
	float fuel;
	
	
	public void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the flight no");
		flightno=sc.nextInt();
		
		System.out.println("enter the destination");
		Destination=sc.next();
		
		System.out.println("enter the distance");
		Distance=sc.nextFloat();
		
		
	    
	    sc.close();
		
		
		
	}
	
	public float callfuel(){
		
		if(Distance<=1000) {
			fuel=500;
			
		}
		else if(Distance>1000&&Distance<=2000){
			fuel=1100;
			
		}
		else {
			fuel= 2200;
		}
		
		return fuel;
	}
	
	public static void main(String[] args) {
		
		Assignment4 obj=new Assignment4();
		
		obj.read();
		
		System.out.println(obj.callfuel());
	
		
		
	}
}
