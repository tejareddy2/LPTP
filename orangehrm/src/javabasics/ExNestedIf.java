package javabasics;

public class ExNestedIf {

	public static void main(String args[]) {

		String money = "Yes";
		String tickets = "Yes";
		if (money == "Yes") {
			if (tickets == "Yes") {
				System.out.println("Watch Movie");
			} else {
				System.out.println("Go to Restaurant");
			}
		} else {
			System.out.println("Go to public park");
		}
	}
}
