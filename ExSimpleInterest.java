package javabasics;

public class ExSimpleInterest {

	public static void main(String[] args)
	{
		double principle=10000;
		int time=10;
		double rateOfInterest=12.5;
		double simpleIntrest;
		simpleIntrest=(principle*time*rateOfInterest)/100;
		System.out.println("Simple Interest:"+simpleIntrest);
	}
}
