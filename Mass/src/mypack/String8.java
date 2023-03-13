package mypack;

import java.util.*;


public class String8 {

	public static void main(String[] args) {
		
		//we can make string muttable using stringbuilder
		
		StringBuilder str=new StringBuilder(" ");
		
		for(char c='a';c<='z';c++) {
		str.append(c);
			
		}
		System.out.println(str);
		
	}
}
