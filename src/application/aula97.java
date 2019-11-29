package application;

import java.util.Locale;
import java.util.Scanner;

public class aula97 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int number = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.printf("Position %d,%d:%n", i, j);
					if(j-1 >= 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i-1 >= 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j+1 < mat[i].length) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i+1 < mat.length) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
