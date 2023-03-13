package mypack;



public class Stringsp2 {

	
	public static boolean checkpalindrome(String str) {
		
		int n=str.length();
		for(int i=0;i<=n/2;i++) {
			
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
				
			}
			
		}
		
		return true;
		
		
	}
	
	
	public static float shortestpath(String str) {
		
		int n=str.length();
		int x=0,y=0;
		
		for(int i=0;i<=n-1;i++) {
			char c=str.charAt(i);
			
			if(c=='E') {
				x++;
				
			}
			else if(c=='W') {
				x--;
				
			}
			
			else if(c=='N') {
				y++;
				
			}
			else {
				y--;
				
			}
			
		}
		
		int x2=x*x;
		
		int y2=y*y;
		return (float)Math.sqrt(x2+y2);
		
		
		
	}
	
	
	
	public static String Titlecase(String str) {
		
		StringBuilder sb=new StringBuilder(" ");
		
		char c=Character.toUpperCase(str.charAt(0));
		
		sb.append(c);
		
		for(int i=1;i<=str.length()-1;i++) {
			
			if(str.charAt(i)==' '){
				
				sb.append(str.charAt(i));
				i++;
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			
			else {
				
				sb.append(str.charAt(i));
				
			}
			
		}
		
		return sb.toString();
		
		
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
		
		
		
		String str="hello bro how are you";
		
		System.out.println("before reversing : "+(str));
		reverse(str);


		
		
	}
}
