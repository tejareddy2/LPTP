package oops;

public class ExMethods {

	public void display(){
		System.out.println("Hi, This is Method.U can reuse me where ever u want ");
	}
	
	
	public static void main(String args[]){
		System.out.println("Hi,This is main Method");
		ExMethods obj=new ExMethods();
		
		obj.display();

		
		
	}
}
