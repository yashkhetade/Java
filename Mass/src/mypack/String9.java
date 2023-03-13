package mypack;
import java.util.*;

public class String9 {
	
	//stringbuilder is used to make string muttable
	//it modifies the orignal string
	
	public static String Titlecase(String str) {
		
		StringBuilder sb=new StringBuilder(" ");
		
		char ch=Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		
		for(int i=0;i<=str.length()-1;i++) {
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
	
	
	
	
	
	
	
	
	public static void SentenceCase(String str) {
		
		
		
	}
	
	public static void main(String[] args) {
	
	
	String str="hello bro how are you";

	
	System.out.println(Titlecase(str));
	
	}
	
	
	
	
}
