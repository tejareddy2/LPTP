package oops;

public class MyFirefoxDriver implements MyWebDriver {

	@Override
	public void myGet() {
		System.out.println("Firefox MyGet");
		
	}

	@Override
	public void myFindElement() {
		System.out.println("Firefox myFindElement");
		
	}

	@Override
	public void myClose() {
		System.out.println("Firefox myClose");
		
	}

}
