package javabasics;

public class ExNestedDoWhile {
	public static void main(String args[]) {
		int i;
		int j;

		i = 1;
		do {
			j = 1;
			do {
				System.out.print(j + "  ");
				j++;
			} while (j <= 5);
			i++;
			System.out.println();

		} while (i <= 5);
	}
}
