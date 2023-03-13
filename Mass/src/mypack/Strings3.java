package mypack;
import java.util.*;



public class Strings3 {
	
	
	public static void print(String str) {
		
		for(int i=0;i<=str.length()-1;i++) {
			System.out.println(str.charAt(i));
			
		}
		
	}
	

	public static void reverse(String str) {
		
		int n=str.length();
		char ch;
		String back=" ";
		
		for(int i=0;i<=n-1;i++) {
			ch=str.charAt(i);
			back=ch+back;
			
			
		}
		
		System.out.println("after reversing :  "+back);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		

		
		//strings are immutable
		//old string cannot be modified a new string is made always
		
		//next sirf word leta hai
		//nextline puri line leta hai
		
		Scanner sc=new Scanner(System.in);
		String str2;
		System.out.println("enter your name");
		str2=sc.nextLine();
		
	    print(str2);
		
		

		System.out.println("your character at index is : " +str2.charAt(1));
		
		System.out.println("your name lenth is " +str2.length());
		
		sc.close();
	}
	
	
}
