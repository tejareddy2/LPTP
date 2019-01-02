package javabasics;

public class ExNestedWhileLoop {

	public static void main(String args[]) {
		int i;
		int j;

		i = 1;
		while (i <= 5) {
			j = 1;
			while (j <= 5) {
				System.out.print(j + "  ");
				j++;
			}
			i++;
			System.out.println();

		}
	}
}
