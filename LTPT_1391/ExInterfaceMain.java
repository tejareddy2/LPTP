package oops;

public class ExInterfaceMain {

	public static void main(String args[]) {

		String browserName="chrome";
		MyWebDriver driver = null;
		
		if(browserName.equals("FF")){
			driver = new MyFirefoxDriver();
		}
		else if(browserName.equals("chrome")){
			driver = new MyChromeDriver();	
		}else
		{
			System.out.println("Invalid Browser");
		}
		
		

		driver.myGet();
		driver.myFindElement();
		driver.myClose();

		

	}
}
