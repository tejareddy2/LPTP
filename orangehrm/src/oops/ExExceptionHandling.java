package oops;

public class ExExceptionHandling {

	public static void main(String args[]){
		
		System.out.println("Open Browser");
		int a;
		int b;
		int c;
		try{
			a=10;
			b=0;
			c=a/b;
			System.out.println("Result is:" +c);	}
	
		catch(ArrayIndexOutOfBoundsException e){
			  System.out.println("Getting exception due to incorrect size of array"+ e.getMessage());
			}
		finally{
			System.out.println("Close Browser");	
		}
	
			
		
		
	}
}
