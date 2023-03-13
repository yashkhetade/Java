package mypack;
import java.util.*;
public class decimaltobinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
    
		 int dec,bin=1;
		System.out.println("enter the decimal no");
		dec=sc.nextInt();
		sc.close();
		while(dec!=0){
			bin=dec%2;
			System.out.println(bin);
			dec=dec/2;
			
		}
		
		
	}
}
