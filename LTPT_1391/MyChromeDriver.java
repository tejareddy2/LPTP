package oops;

public class MyChromeDriver implements MyWebDriver {

	@Override
	public void myGet() {
		System.out.println("Chrome MyGet");
		
	}

	@Override
	public void myFindElement() {
		System.out.println("Chrome myFindElement");
		
	}

	@Override
	public void myClose() {
		System.out.println("Chrome myClose");
		
	}

}
