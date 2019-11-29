package application;

import java.util.Locale;
import java.util.Scanner;

public class aula96 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] m = new int[n][n];

		int neg = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = sc.nextInt();
				if (m[i][j] < 0) {
					neg++;
				}
			}
		}

		System.out.println("Main diagonal:");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i][i] + " ");
		}

		System.out.println("\nNegative numbers = " + neg);

		sc.close();

	}

}
