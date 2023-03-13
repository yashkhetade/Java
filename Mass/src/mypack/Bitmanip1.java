package mypack;
import java.util.*;



public class Bitmanip1 {
	


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int dec=0,bin,i=1,rem;
		System.out.println("enter the binary no");
		bin=sc.nextInt();
		
		while(bin!=0) {
			
			rem=bin%10;
			dec=dec+(rem*i);
			i=i*2;
			bin=bin/10;
			
			
		}
		
		
	


		
		
		
		System.out.println(dec);
		sc.close();
		
		
		
	}
}
