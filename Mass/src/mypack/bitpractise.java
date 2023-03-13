package mypack;






public class bitpractise {
	
	public static int ithbit(int n,int i) {

		int bitmask= 1<<i;
		
		if((n&bitmask)==0) {
			
			return 0;
			
		}
		else {
			
			return 1;
		}
		

		
	}
	
	
	public static int setithbit(int n,int i) {
		
		int bitmask=1<<i;
		return n|bitmask;
		
		
	}
	
	public static int clearithbit(int n,int i ) {
		
		int bitmask= ~(1<<i);
		return n&bitmask;
		
	}
	
	public static int update (int n,int i) {
		
		return ;
		
		
	}
	
	
	public static clearlastithbit(int n,int i) {
		
		int bitmask= (~0)<<i;
		
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(setithbit(10,3));
	}
	
	

	
	
}




/*
 * 
 * 8 4 2 1
 * 1 0 1 0
 * 
 * 
 * 
 */

