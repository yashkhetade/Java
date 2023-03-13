package mypack;
import java.util.*;

public class power {

	public static int pow(int x,int  n) {
		
		if(n==0) {
			
			return 1;
			
		}
		return x*pow(x,n-1);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		int x,n;
		System.out.println("enter the value of base");
		x=sc.nextInt();
		System.out.println("enter the value of power");
		n=sc.nextInt();
		
		System.out.println("result : "+pow(x,n));
		
	}
}
