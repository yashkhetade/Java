package mypack;


public class stringprac {
	
	public static String Titlecase(String str) {
		
		StringBuilder sb=new StringBuilder("");
		char ch=Character.toUpperCase(str.charAt(0));
				
		sb.append(ch);	
		
		for(int i=1;i<=str.length()-1;i++) {
			
			if(str.charAt(i)==' ') {
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
	
	public static boolean checkpalindrome(String str) {
		
		int n=str.length();
		for(int i=0;i<n/2;i++) {
			
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
				
			}
			
			
		}
		return true;
		
		
	}
	
	

	
	public static void main(String[] args) {
		
		String str="noon bro";
		
		System.out.println(Titlecase(str));
		
		
	}
	
}
