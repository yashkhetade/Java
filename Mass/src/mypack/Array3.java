package mypack;
import java.util.*;

public class Array3 {

	public static void main(String[] args) {
		
		ALLSORTING<Integer> a=new ALLSORTING<Integer>();
		
		a.add(12);
		a.add(5);
		a.add(8);
		a.add(99);
		a.add(55);
		
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
		
		a.add(4,44);
		System.out.println(a);
	}
}
