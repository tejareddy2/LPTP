package testng;

import org.testng.annotations.Test;

public class SecondTestNG extends ExAnnotations {
	@Test
	public void test1(){
		System.out.println("test1");
	}
	
	@Test
	public void test3(){
		System.out.println("test3");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
}
