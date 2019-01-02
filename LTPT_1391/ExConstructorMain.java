package oops;

public class ExConstructorMain {

	public static void main(String args[])
	{
		/*ExConstructor obj =new ExConstructor();
		System.out.println(obj.a);
		
		ExConstructor obj1 =new ExConstructor();
		System.out.println(obj1.a);*/
		
		ExConstructor obj =new ExConstructor('x');
		System.out.println(obj.b);
		
		System.out.println(ExConstructor.a);
		
		ExConstructor obj1 =new ExConstructor('x');
		System.out.println(obj1.b);
		
		System.out.println(ExConstructor.a);
		
		
	}
}
